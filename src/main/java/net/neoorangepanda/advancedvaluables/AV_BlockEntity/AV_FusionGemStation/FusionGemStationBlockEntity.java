package net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.access.ItemAccess;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation.FusionGemStationMenu;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class FusionGemStationBlockEntity extends BlockEntity implements MenuProvider
{
    public final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(5)
    {
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents)
        {
            super.onContentsChanged(index, previousContents);
            FusionGemStationBlockEntity.this.setChanged();
            assert level != null;
            if (!level.isClientSide())
            {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int INPUT_SLOT_NETHERITE = 0;
    private static final int INPUT_SLOT_POWDER_1 = 1;
    private static final int INPUT_SLOT_POWDER_2 = 2;
    private static final int INPUT_SLOT_POWDER_3 = 3;
    private static final int OUTPUT_SLOT = 4;

    protected final ContainerData data;

    private int progress = 0;
    private int maxProgress = 72;

    public FusionGemStationBlockEntity(BlockPos pos, BlockState blockState)
    {
        super(AdvancedValuables_Entities.FUSION_GEM_STATION_BE.get(), pos, blockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i)
            {
                return switch (i)
                {
                    case 0 -> FusionGemStationBlockEntity.this.progress;
                    case 1 -> FusionGemStationBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int value)
            {
                switch (i)
                {
                    case 0: FusionGemStationBlockEntity.this.progress = value;
                    case 1: FusionGemStationBlockEntity.this.maxProgress = value;
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
        return Component.translatable("block.advancedvaluables.fusion_gem_station");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, @NotNull Inventory inventory, @NotNull Player player)
    {
        return new FusionGemStationMenu(containerId, inventory, this, this.inventory, this.data);
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

        output.putInt("fusion_gem_station.progress", progress);
        output.putInt("fusion_gem_station.max_progress", maxProgress);
        output.putChild("inventory", inventory);
    }

    @Override
    protected void loadAdditional(@NotNull ValueInput input)
    {
        super.loadAdditional(input);

        progress = input.getIntOr("fusion_gem_station.progress", 0);
        maxProgress = input.getIntOr("fusion_gem_station.max_progress", 72);
        input.child("inventory").ifPresent(inventory::deserialize);
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

    public void tick(Level level, BlockPos pos, BlockState state)
    {
        if(hasRecipe(level, pos) && isOutputSlotEmptyOrReceivable())
        {
            increaseCraftingProgress();
            setChanged(level, pos, state);

            if(hasCraftingFinished())
            {
                craftItem();
                resetProgress();
            }
        }
        else
        {
            resetProgress();
        }
    }


    private boolean isOutputSlotEmptyOrReceivable()
    {
        return  inventory.getResource(OUTPUT_SLOT).isEmpty() ||
                inventory.getResource(OUTPUT_SLOT).test(stack -> stack.count() < stack.getMaxStackSize());
    }

    private void craftItem()
    {
        ItemStack output = new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get(), 1);

        try(Transaction transaction = Transaction.openRoot())
        {
            ItemAccess itemAccess = ItemAccess.forHandlerIndex(inventory, OUTPUT_SLOT);

            inventory.extract(inventory.getResource(INPUT_SLOT_NETHERITE), 1, transaction);
            inventory.extract(inventory.getResource(INPUT_SLOT_POWDER_1), 1, transaction);
            inventory.extract(inventory.getResource(INPUT_SLOT_POWDER_2), 1, transaction);
            inventory.extract(inventory.getResource(INPUT_SLOT_POWDER_3), 1, transaction);
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
        this.progress++;
    }

    private boolean hasRecipe(Level level, BlockPos blockPos)
    {
        ItemStack output = new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get());
        boolean isPoweredWithRedstone = level.hasNeighborSignal(blockPos);

        boolean checkNetheriteSlot = inventory.getResource(INPUT_SLOT_NETHERITE).toStack().is(Items.NETHERITE_INGOT);
        boolean checkMixedSapphireSlot = inventory.getResource(INPUT_SLOT_POWDER_1).toStack().is(AdvancedValuables_ItemClass.MIXED_SAPPHIRE_POWDER.get());
        boolean checkMixedGarnetSlot = inventory.getResource(INPUT_SLOT_POWDER_2).toStack().is(AdvancedValuables_ItemClass.MIXED_GARNET_POWDER.get());
        boolean checkRubySlot = inventory.getResource(INPUT_SLOT_POWDER_3).toStack().is(AdvancedValuables_ItemClass.RUBY_POWDER.get());
        boolean checkValidRecipe = checkNetheriteSlot && checkMixedSapphireSlot && checkMixedGarnetSlot && checkRubySlot;

        boolean outputSlotAmount = canInsertAmountIntoOutputSlot(output.getCount());
        boolean outputSlotItem = canInsertItemIntoOutputSlot(output);

        return checkValidRecipe && outputSlotAmount && outputSlotItem && isPoweredWithRedstone;
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

    private float rotation;

    public float getRenderingRotation()
    {
        rotation += 0.5f;
        if(rotation >= 360) {
            rotation = 0;
        }
        return rotation;
    }
}
