package net.neoorangepanda.advancedvaluables.AV_Screens.AV_FusionGemStation;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.item.ResourceHandlerSlot;
import net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation.FusionGemStationBlockEntity;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_MenuTypes;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("all")
public class FusionGemStationMenu extends AbstractContainerMenu
{
    public final FusionGemStationBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public FusionGemStationMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData)
    {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new ItemStacksResourceHandler(5), new SimpleContainerData(2));
    }

    public FusionGemStationMenu(int containedId, Inventory inventory, BlockEntity entity, ItemStacksResourceHandler handler, ContainerData containerData) {
        super(AdvancedValuables_MenuTypes.FUSION_GEM_STATION_MENU.get(), containedId);

        this.blockEntity = ((FusionGemStationBlockEntity) entity);
        this.level = inventory.player.level();
        this.data = containerData;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        this.addSlot(new ResourceHandlerSlot(handler, handler::set, 0, 25, 28) {
            @Override
            public boolean mayPlace(@NotNull ItemStack stack)
            {
                return stack.is(Items.NETHERITE_INGOT);
            }
        });

        this.addSlot(new ResourceHandlerSlot(handler, handler::set, 1, 47, 28) {
            @Override
            public boolean mayPlace(@NotNull ItemStack stack)
            {
                return stack.is(AdvancedValuables_ItemClass.MIXED_SAPPHIRE_POWDER);
            }
        }); // Mixed Sapphire Powder

        this.addSlot(new ResourceHandlerSlot(handler, handler::set, 2, 25, 50) {
            @Override
            public boolean mayPlace(@NotNull ItemStack stack)
            {
                return stack.is(AdvancedValuables_ItemClass.MIXED_GARNET_POWDER);
            }
        }); // Mixed Garnet Powder

        this.addSlot(new ResourceHandlerSlot(handler, handler::set, 3, 47, 50) {
            @Override
            public boolean mayPlace(@NotNull ItemStack stack)
            {
                return stack.is(AdvancedValuables_ItemClass.RUBY_POWDER);
            }
        }); // Ruby Powder

        this.addSlot(new ResourceHandlerSlot(handler, handler::set, 4, 128, 38) {
            @Override
            public boolean mayPlace(@NotNull ItemStack stack)
            {
                return false;
            }
        }); // Output

        addDataSlots(containerData);
    }

    public boolean isCrafting()
    {
        return data.get(0) > 0;
    }

    public int getScaledArrowProgress()
    {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int arrowPixelSize = 24;

        return maxProgress != 0 && progress != 0 ? progress * arrowPixelSize / maxProgress : 0;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 5;

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player playerIn, int pIndex)
    {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT)
        {
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false))
            {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0)
        {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(@NotNull Player player)
    {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), player, AdvancedValuables_BlockClass.FUSION_GEM_STATION.get());
    }

    private void addPlayerInventory(Inventory playerInventory)
    {
        for (int i = 0; i < 3; ++i)
        {
            for (int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 88 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory)
    {
        for (int i = 0; i < 9; ++i)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 146));
        }
    }
}
