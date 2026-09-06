package net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_GemGrinder;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.access.ItemAccess;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipeInput;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Recipes;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder.GemGrinderMenu;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Optional;

public class GemGrinderBlockEntity extends BlockEntity implements MenuProvider
{
    public final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(2)
    {
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents)
        {
            super.onContentsChanged(index, previousContents);
            GemGrinderBlockEntity.this.setChanged();
        }
    };

    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;

    public GemGrinderBlockEntity(BlockPos pos, BlockState blockState)
    {
        super(AdvancedValuables_Entities.GEM_GRINDER_BE.get(), pos, blockState);
        data = new ContainerData()
        {
            @Override
            public int get(int i)
            {
                return switch (i)
                {
                    case 0 -> GemGrinderBlockEntity.this.progress;
                    case 1 -> GemGrinderBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int value)
            {
                switch (i)
                {
                    case 0: GemGrinderBlockEntity.this.progress = value;
                    case 1: GemGrinderBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount()
            {
                return 2;
            }
        };
    }

    @Override
    public @NotNull Component getDisplayName()
    {
        return Component.translatable("block.advancedvaluables.gem_grinder");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, @NotNull Inventory inventory, @NotNull Player player)
    {
        return new GemGrinderMenu(containerId, inventory, this, this.inventory, this.data);
    }

    public void drops()
    {
        SimpleContainer inv = new SimpleContainer(this.inventory.size());
        for (int i = 0; i < this.inventory.size(); i++)
        {
            ItemAccess itemAccess = ItemAccess.forHandlerIndex(inventory, 0);
            inv.setItem(i, new ItemStack(itemAccess.getResource().getItem(), itemAccess.getAmount()));
        }

        assert this.level != null;
        Containers.dropContents(this.level, this.worldPosition, inv);
    }

    @Override
    protected void saveAdditional(@NotNull ValueOutput output)
    {
        super.saveAdditional(output);

        output.putInt("gem_grinder.progress", progress);
        output.putInt("gem_grinder.max_progress", maxProgress);
        output.putChild("inventory", inventory);
    }

    @Override
    protected void loadAdditional(@NotNull ValueInput input)
    {
        super.loadAdditional(input);

        progress = input.getIntOr("gem_grinder.progress", 0);
        maxProgress = input.getIntOr("gem_grinder.max_progress", 72);
        input.child("inventory").ifPresent(inventory::deserialize);
    }

    public void tick(Level level, BlockPos blockPos, BlockState state)
    {
        if (hasRecipe(level, blockPos))
        {
            increaseCraftingProgress();
            setChanged(level, blockPos, state);

            if (hasCraftingFinished())
            {
                craftItem();
                resetProgress();
            }
        } else resetProgress();
    }

    private void craftItem()
    {
        Optional<RecipeHolder<@NotNull GemGrinderRecipe>> recipe = getCurrentRecipe();
        ItemStack output = recipe.get().value().output().create();

        try (Transaction transaction = Transaction.openRoot())
        {
            ItemAccess itemAccess = ItemAccess.forHandlerIndex(inventory, OUTPUT_SLOT);

            inventory.extract(inventory.getResource(INPUT_SLOT), 1, transaction);
            inventory.set(OUTPUT_SLOT, ItemResource.of(output), itemAccess.getAmount() + output.getCount());

            transaction.commit();
        }
    }

    private void resetProgress()
    {
        progress = 0;
        maxProgress = 72;
    }

    private boolean hasCraftingFinished()
    {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress()
    {
        progress++;
    }

    private boolean hasRecipe(Level level, BlockPos blockPos)
    {
        boolean isPoweredWithRedstone = level.hasNeighborSignal(blockPos);
        Optional<RecipeHolder<@NotNull GemGrinderRecipe>> recipe = getCurrentRecipe();
        if (recipe.isEmpty()) return false;
        ItemStack output = recipe.get().value().assemble(new GemGrinderRecipeInput(inventory.getResource(INPUT_SLOT).toStack()));
        return canInsertAmountIntoOutputSlot(output.getCount()) && canInsertItemIntoOutputSlot(output) && isPoweredWithRedstone;
    }

    private Optional<RecipeHolder<@NotNull GemGrinderRecipe>> getCurrentRecipe()
    {
        assert this.level != null;
        return ((ServerLevel) this.level).recipeAccess().getRecipeFor(AdvancedValuables_Recipes.GEM_GRINDER_TYPE.get(),
                new GemGrinderRecipeInput(inventory.getResource(INPUT_SLOT).toStack()), level);
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output)
    {
        return inventory.getResource(OUTPUT_SLOT).isEmpty() ||
                inventory.getResource(OUTPUT_SLOT).is(output.getItem());
    }

    private boolean canInsertAmountIntoOutputSlot(int count)
    {
        int maxCount = inventory.getResource(OUTPUT_SLOT).isEmpty() ? 64 : inventory.getResource(OUTPUT_SLOT).getMaxStackSize();
        int currentCount = inventory.getAmountAsInt(OUTPUT_SLOT);

        return maxCount >= currentCount + count;
    }

    @Override
    public @NotNull CompoundTag getUpdateTag(HolderLookup.@NotNull Provider registries)
    {
        return saveWithoutMetadata(registries);
    }

    @Override
    public @Nullable Packet<@NotNull ClientGamePacketListener> getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
