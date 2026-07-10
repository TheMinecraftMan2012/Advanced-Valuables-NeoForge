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
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation.FusionGemStationMenu;
import javax.annotation.Nullable;

public class FusionGemStationBlockEntity extends BlockEntity implements MenuProvider
{
    public final ItemStackHandler handler = new ItemStackHandler(5)
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
        data = new ContainerData() {
            @Override
            public int get(int i)
            {
                return switch (i) {
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
    public Component getDisplayName()
    {
        return Component.translatable("block.advancedvaluables.fusion_gem_station");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player)
    {
        return new FusionGemStationMenu(i, inventory, this, this.data);
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
        output.putInt("fusion_gem_station.progress", progress);
        output.putInt("fusion_gem_station.max_progress", maxProgress);

        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input)
    {
        super.loadAdditional(input);

        handler.deserialize(input);
        progress = input.getInt("fusion_gem_station.progress").get();
        maxProgress = input.getInt("fusion_gem_station.max_progress").get();
    }

    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state)
    {
        drops();
        super.preRemoveSideEffects(pos, state);
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
        ItemStack output_1 = new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get());

        handler.extractItem(INPUT_SLOT_NETHERITE, 1, false);
        handler.extractItem(INPUT_SLOT_POWDER_1, 1, false);
        handler.extractItem(INPUT_SLOT_POWDER_2, 1, false);
        handler.extractItem(INPUT_SLOT_POWDER_3, 1, false);
        handler.setStackInSlot(OUTPUT_SLOT, new ItemStack(output_1.getItem(), handler.getStackInSlot(OUTPUT_SLOT).getCount() + output_1.getCount()));
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
        ItemStack slot_netherite = handler.getStackInSlot(INPUT_SLOT_NETHERITE);
        ItemStack slot1 = handler.getStackInSlot(INPUT_SLOT_POWDER_1);
        ItemStack slot2 = handler.getStackInSlot(INPUT_SLOT_POWDER_2);
        ItemStack slot3 = handler.getStackInSlot(INPUT_SLOT_POWDER_3);

        ItemStack output_1 = new ItemStack(AdvancedValuables_ItemClass.FUSION_GEM.get());

        return (slot_netherite.is(Items.NETHERITE_INGOT) &&
                slot1.is(AdvancedValuables_ItemClass.MIXED_SAPPHIRE_POWDER) &&
                slot2.is(AdvancedValuables_ItemClass.MIXED_GARNET_POWDER) &&
                slot3.is(AdvancedValuables_ItemClass.RUBY_POWDER)) &&
                canInsertAmountIntoOutputSlot(output_1.getCount(), OUTPUT_SLOT) && canInsertItemIntoOutputSlot(output_1, OUTPUT_SLOT);
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output, int slot)
    {
        return handler.getStackInSlot(slot).isEmpty() || handler.getStackInSlot(slot).getItem() == output.getItem();
    }

    private boolean canInsertAmountIntoOutputSlot(int count, int slot)
    {
        int maxCount = handler.getStackInSlot(slot).isEmpty() ? 64 : handler.getStackInSlot(slot).getMaxStackSize();
        int currentCount = handler.getStackInSlot(slot).getCount();

        return maxCount >= currentCount + count;
    }

    private float rotation;

    public float getRenderingRotation() {
        rotation += 0.5f;
        if(rotation >= 360) {
            rotation = 0;
        }
        return rotation;
    }
}
