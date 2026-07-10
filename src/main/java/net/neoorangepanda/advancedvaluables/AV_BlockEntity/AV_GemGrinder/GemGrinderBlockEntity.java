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
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipeInput;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Recipes;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder.GemGrinderMenu;

import javax.annotation.Nullable;
import java.util.Optional;

public class GemGrinderBlockEntity extends BlockEntity implements MenuProvider
{
    public final ItemStackHandler handler = new ItemStackHandler(2)
    {
        @Override
        protected void onContentsChanged(int slot)
        {
            setChanged();
            if (!level.isClientSide())
            {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
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
        data = new ContainerData() {
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
    public Component getDisplayName()
    {
        return Component.translatable("block.advancedvaluables.gem_grinder");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player)
    {
        return new GemGrinderMenu(i, inventory, this, this.data);
    }

    public void drops()
    {
        SimpleContainer inventory = new SimpleContainer(handler.getSlots());
        for (int i = 0; i < handler.getSlots(); i++)
        {
            inventory.setItem(i, handler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    protected void saveAdditional(ValueOutput output)
    {
        handler.serialize(output);
        output.putInt("gem_grinder.progress", progress);
        output.putInt("gem_grinder.max_progress", maxProgress);

        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input)
    {
        super.loadAdditional(input);

        handler.deserialize(input);
        progress = input.getInt("gem_grinder.progress").get();
        maxProgress = input.getInt("gem_grinder.max_progress").get();
    }

    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state)
    {
        drops();
        super.preRemoveSideEffects(pos, state);
    }

    public void tick(Level level, BlockPos blockPos, BlockState state)
    {
        if (hasRecipe())
        {
            increaseCraftingProgress();
            setChanged(level, blockPos, state);

            if (hasCraftingFinished())
            {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void craftItem()
    {
        Optional<RecipeHolder<GemGrinderRecipe>> recipe = getCurrentRecipe();
        ItemStack output = recipe.get().value().output();

        handler.extractItem(INPUT_SLOT, 1, false);
        handler.setStackInSlot(OUTPUT_SLOT, new ItemStack(output.getItem(), handler.getStackInSlot(OUTPUT_SLOT).getCount() + output.getCount()));
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

    private boolean hasRecipe()
    {
        Optional<RecipeHolder<GemGrinderRecipe>> recipe = getCurrentRecipe();
        if (recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output();
        return canInsertAmountIntoOutputSlot(output.getCount()) && canInsertItemIntoOutputSlot(output);
    }

    private Optional<RecipeHolder<GemGrinderRecipe>> getCurrentRecipe()
    {
        return ((ServerLevel) this.level).recipeAccess().getRecipeFor(AdvancedValuables_Recipes.GEM_GRINDER_TYPE.get(), new GemGrinderRecipeInput(handler.getStackInSlot(INPUT_SLOT)), level);
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output)
    {
        return handler.getStackInSlot(OUTPUT_SLOT).isEmpty() || handler.getStackInSlot(OUTPUT_SLOT).getItem() == output.getItem();
    }

    private boolean canInsertAmountIntoOutputSlot(int count)
    {
        int maxCount = handler.getStackInSlot(OUTPUT_SLOT).isEmpty() ? 64 : handler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
        int currentCount = handler.getStackInSlot(OUTPUT_SLOT).getCount();

        return maxCount >= currentCount + count;
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries)
    {
        return saveWithoutMetadata(registries);
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
