package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ArmorMaterials;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.stream.Stream;

public class AdvancedValuables_ModelProvider extends ModelProvider
{
    public AdvancedValuables_ModelProvider(PackOutput output)
    {
        super(output, AdvancedValuables.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_GEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RAW_RUBY.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.HAMMER_WIREFRAME.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_APPLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_APPLE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RED_GARNET_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.BLUE_GARNET_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.PINK_GARNET_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.FUSION_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(AdvancedValuables_ItemClass.RUBY_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET.get(), AdvancedValuables_ArmorMaterials.RED_SAPPHIRE_EQA, "red_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.RED_SAPPHIRE_EQA, "red_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.RED_SAPPHIRE_EQA, "red_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS.get(), AdvancedValuables_ArmorMaterials.RED_SAPPHIRE_EQA, "red_sapphire", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET.get(), AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE_EQA, "blue_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE_EQA, "blue_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE_EQA, "blue_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS.get(), AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE_EQA, "blue_sapphire", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET.get(), AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE_EQA, "green_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE_EQA, "green_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE_EQA, "green_sapphire", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS.get(), AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE_EQA, "green_sapphire", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_GARNET_HELMET.get(), AdvancedValuables_ArmorMaterials.RED_GARNET_EQA, "red_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.RED_GARNET_EQA, "red_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.RED_GARNET_EQA, "red_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RED_GARNET_BOOTS.get(), AdvancedValuables_ArmorMaterials.RED_GARNET_EQA, "red_garnet", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_GARNET_HELMET.get(), AdvancedValuables_ArmorMaterials.BLUE_GARNET_EQA, "blue_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.BLUE_GARNET_EQA, "blue_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.BLUE_GARNET_EQA, "blue_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS.get(), AdvancedValuables_ArmorMaterials.BLUE_GARNET_EQA, "blue_garnet", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.PINK_GARNET_HELMET.get(), AdvancedValuables_ArmorMaterials.PINK_GARNET_EQA, "pink_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.PINK_GARNET_EQA, "pink_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.PINK_GARNET_EQA, "pink_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.PINK_GARNET_BOOTS.get(), AdvancedValuables_ArmorMaterials.PINK_GARNET_EQA, "pink_garnet", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET.get(), AdvancedValuables_ArmorMaterials.YELLOW_GARNET_EQA, "yellow_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.YELLOW_GARNET_EQA, "yellow_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.YELLOW_GARNET_EQA, "yellow_garnet", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS.get(), AdvancedValuables_ArmorMaterials.YELLOW_GARNET_EQA, "yellow_garnet", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.FUSION_HELMET.get(), AdvancedValuables_ArmorMaterials.FUSION_GEM_EQA, "fusion_gem", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.FUSION_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.FUSION_GEM_EQA, "fusion_gem", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.FUSION_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.FUSION_GEM_EQA, "fusion_gem", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.FUSION_BOOTS.get(), AdvancedValuables_ArmorMaterials.FUSION_GEM_EQA, "fusion_gem", false);

        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RUBY_HELMET.get(), AdvancedValuables_ArmorMaterials.RUBY_EQA, "ruby", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RUBY_CHESTPLATE.get(), AdvancedValuables_ArmorMaterials.RUBY_EQA, "ruby", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RUBY_LEGGINGS.get(), AdvancedValuables_ArmorMaterials.RUBY_EQA, "ruby", false);
        itemModels.generateTrimmableItem(AdvancedValuables_ItemClass.RUBY_BOOTS.get(), AdvancedValuables_ArmorMaterials.RUBY_EQA, "ruby", false);

//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.FUSION_BLOCK.get());
//        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RUBY_BLOCK.get());

        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get());

        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RED_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.PINK_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.FUSION_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.RUBY_ORE.get());

        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get());
        blockModels.createTrivialCube(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get());

        blockModels.family(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL.get())
                .stairs(AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB.get())
                .button(AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL.get())
                .stairs(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB.get())
                .button(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL.get())
                .stairs(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB.get())
                .button(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.RED_GARNET_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.RED_GARNET_WALL.get())
                .stairs(AdvancedValuables_BlockClass.RED_GARNET_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.RED_GARNET_SLAB.get())
                .button(AdvancedValuables_BlockClass.RED_GARNET_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.RED_GARNET_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.BLUE_GARNET_WALL.get())
                .stairs(AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.BLUE_GARNET_SLAB.get())
                .button(AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.BLUE_GARNET_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.PINK_GARNET_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.PINK_GARNET_WALL.get())
                .stairs(AdvancedValuables_BlockClass.PINK_GARNET_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.PINK_GARNET_SLAB.get())
                .button(AdvancedValuables_BlockClass.PINK_GARNET_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.PINK_GARNET_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.YELLOW_GARNET_WALL.get())
                .stairs(AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB.get())
                .button(AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.FUSION_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.FUSION_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.FUSION_WALL.get())
                .stairs(AdvancedValuables_BlockClass.FUSION_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.FUSION_SLAB.get())
                .button(AdvancedValuables_BlockClass.FUSION_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.FUSION_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.FUSION_TRAPDOOR.get());

        blockModels.family(AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .fence(AdvancedValuables_BlockClass.RUBY_FENCE.get())
                .fenceGate(AdvancedValuables_BlockClass.RUBY_FENCE_GATE.get())
                .wall(AdvancedValuables_BlockClass.RUBY_WALL.get())
                .stairs(AdvancedValuables_BlockClass.RUBY_STAIRS.get())
                .slab(AdvancedValuables_BlockClass.RUBY_SLAB.get())
                .button(AdvancedValuables_BlockClass.RUBY_BUTTON.get())
                .pressurePlate(AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE.get())
                .door(AdvancedValuables_BlockClass.RUBY_DOOR.get())
                .trapdoor(AdvancedValuables_BlockClass.RUBY_TRAPDOOR.get());
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks()
    {
        return AdvancedValuables_BlockClass.BLOCKS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems()
    {
        return AdvancedValuables_ItemClass.ITEMS.getEntries().stream();
    }
}
