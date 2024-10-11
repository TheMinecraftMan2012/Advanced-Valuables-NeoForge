package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ItemModelProvider extends ItemModelProvider
{
    public AdvancedValuables_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, AdvancedValuables.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get());

        basicItem(AdvancedValuables_ItemClass.RED_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET.get());

        basicItem(AdvancedValuables_ItemClass.FUSION_GEM.get());
        basicItem(AdvancedValuables_ItemClass.RUBY.get());

        basicItem(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get());

        basicItem(AdvancedValuables_ItemClass.RED_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get());

        basicItem(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get());
        basicItem(AdvancedValuables_ItemClass.RAW_RUBY.get());

        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.RED_GARNET_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.RED_GARNET_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.PINK_GARNET_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.FUSION_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.FUSION_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.FUSION_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.FUSION_BOOTS.get());

        basicItem(AdvancedValuables_ItemClass.RUBY_HELMET.get());
        basicItem(AdvancedValuables_ItemClass.RUBY_CHESTPLATE.get());
        basicItem(AdvancedValuables_ItemClass.RUBY_LEGGINGS.get());
        basicItem(AdvancedValuables_ItemClass.RUBY_BOOTS.get());

        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD);

        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD);

        handheldItem(AdvancedValuables_ItemClass.FUSION_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_AXE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.FUSION_HOE);
        handheldItem(AdvancedValuables_ItemClass.FUSION_SWORD);

        handheldItem(AdvancedValuables_ItemClass.RUBY_PICKAXE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_AXE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_SHOVEL);
        handheldItem(AdvancedValuables_ItemClass.RUBY_HOE);
        handheldItem(AdvancedValuables_ItemClass.RUBY_SWORD);

        basicItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.RED_GARNET_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.BLUE_GARNET_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.PINK_GARNET_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.YELLOW_GARNET_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.FUSION_APPLE.get());
        basicItem(AdvancedValuables_ItemClass.RUBY_APPLE.get());

        buttonItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.RED_GARNET_BUTTON, AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.PINK_GARNET_BUTTON, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.FUSION_BUTTON, AdvancedValuables_BlockClass.FUSION_BLOCK);
        buttonItem(AdvancedValuables_BlockClass.RUBY_BUTTON, AdvancedValuables_BlockClass.RUBY_BLOCK);

        fenceItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.RED_GARNET_FENCE, AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.PINK_GARNET_FENCE, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.FUSION_FENCE, AdvancedValuables_BlockClass.FUSION_BLOCK);
        fenceItem(AdvancedValuables_BlockClass.RUBY_FENCE, AdvancedValuables_BlockClass.RUBY_BLOCK);

        wallItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK);
        wallItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK);
        wallItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK);
        wallItem(AdvancedValuables_BlockClass.RED_GARNET_WALL, AdvancedValuables_BlockClass.RED_GARNET_BLOCK);
        wallItem(AdvancedValuables_BlockClass.BLUE_GARNET_WALL, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK);
        wallItem(AdvancedValuables_BlockClass.PINK_GARNET_WALL, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK);
        wallItem(AdvancedValuables_BlockClass.YELLOW_GARNET_WALL, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK);
        wallItem(AdvancedValuables_BlockClass.FUSION_WALL, AdvancedValuables_BlockClass.FUSION_BLOCK);
        wallItem(AdvancedValuables_BlockClass.RUBY_WALL, AdvancedValuables_BlockClass.RUBY_BLOCK);

        basicItem(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.RED_GARNET_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.PINK_GARNET_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.FUSION_DOOR.asItem());
        basicItem(AdvancedValuables_BlockClass.RUBY_DOOR.asItem());

        handheldItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.RED_GARNET_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.BLUE_GARNET_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.PINK_GARNET_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.FUSION_HAMMER);
        handheldItem(AdvancedValuables_ItemClass.RUBY_HAMMER);

        basicItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock)
    {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock)
    {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock)
    {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
