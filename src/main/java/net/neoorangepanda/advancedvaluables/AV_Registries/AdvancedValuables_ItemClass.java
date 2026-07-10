package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.ProvidesTrimMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodConsumables;
import net.neoorangepanda.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodProperties;
import net.neoorangepanda.advancedvaluables.AV_Libraries.Items.HammerItem;
import net.neoorangepanda.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ArmorMaterials;
import net.neoorangepanda.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ToolsTier;
import net.neoorangepanda.advancedvaluables.AV_Trims.AdvancedValuables_TrimMaterial;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public class  AdvancedValuables_ItemClass
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedValuables.MOD_ID);

    public static final DeferredItem<Item> BLUE_SAPPHIRE = ITEMS.registerSimpleItem("blue_sapphire", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.BLUE_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"))));
    public static final DeferredItem<Item> RED_SAPPHIRE = ITEMS.registerSimpleItem("red_sapphire", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.RED_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"))));
    public static final DeferredItem<Item> GREEN_SAPPHIRE = ITEMS.registerSimpleItem("green_sapphire", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.GREEN_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"))));

    public static final DeferredItem<Item> RED_GARNET = ITEMS.registerSimpleItem("red_garnet", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.RED_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"))));
    public static final DeferredItem<Item> PINK_GARNET = ITEMS.registerSimpleItem("pink_garnet", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.BLUE_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"))));
    public static final DeferredItem<Item> BLUE_GARNET = ITEMS.registerSimpleItem("blue_garnet", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.PINK_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"))));
    public static final DeferredItem<Item> YELLOW_GARNET = ITEMS.registerSimpleItem("yellow_garnet", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.YELLOW_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"))));

    public static final DeferredItem<Item> FUSION_GEM = ITEMS.registerSimpleItem("fusion_gem", new Item.Properties().fireResistant().trimMaterial(AdvancedValuables_TrimMaterial.FUSION_GEM)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"))));
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby", new Item.Properties().trimMaterial(AdvancedValuables_TrimMaterial.RUBY)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"))));

    public static final DeferredItem<Item> BLUE_RAW_SAPPHIRE = ITEMS.registerSimpleItem("blue_raw_sapphire", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_raw_sapphire"))));
    public static final DeferredItem<Item> RED_RAW_SAPPHIRE = ITEMS.registerSimpleItem("red_raw_sapphire", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_raw_sapphire"))));
    public static final DeferredItem<Item> GREEN_RAW_SAPPHIRE = ITEMS.registerSimpleItem("green_raw_sapphire", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_raw_sapphire"))));

    public static final DeferredItem<Item> RED_RAW_GARNET = ITEMS.registerSimpleItem("red_raw_garnet", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_raw_garnet"))));
    public static final DeferredItem<Item> PINK_RAW_GARNET = ITEMS.registerSimpleItem("pink_raw_garnet", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_raw_garnet"))));
    public static final DeferredItem<Item> BLUE_RAW_GARNET = ITEMS.registerSimpleItem("blue_raw_garnet", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_raw_garnet"))));
    public static final DeferredItem<Item> YELLOW_RAW_GARNET = ITEMS.registerSimpleItem("yellow_raw_garnet", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_raw_garnet"))));

    public static final DeferredItem<Item> RAW_FUSION_GEM = ITEMS.registerSimpleItem("raw_fusion_gem", new Item.Properties().fireResistant()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "raw_fusion_gem"))));
    public static final DeferredItem<Item> RAW_RUBY = ITEMS.registerSimpleItem("raw_ruby", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "raw_ruby"))));

    public static final DeferredItem<Item> RED_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("red_sapphire_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire_powder"))));
    public static final DeferredItem<Item> BLUE_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("blue_sapphire_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire_powder"))));
    public static final DeferredItem<Item> GREEN_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("green_sapphire_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire_powder"))));

    public static final DeferredItem<Item> RED_GARNET_POWDER = ITEMS.registerSimpleItem("red_garnet_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet_powder"))));
    public static final DeferredItem<Item> BLUE_GARNET_POWDER = ITEMS.registerSimpleItem("blue_garnet_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet_powder"))));
    public static final DeferredItem<Item> PINK_GARNET_POWDER = ITEMS.registerSimpleItem("pink_garnet_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet_powder"))));
    public static final DeferredItem<Item> YELLOW_GARNET_POWDER = ITEMS.registerSimpleItem("yellow_garnet_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet_powder"))));

    public static final DeferredItem<Item> RUBY_POWDER = ITEMS.registerSimpleItem("ruby_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby_powder"))));

    public static final DeferredItem<Item> MIXED_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("mixed_sapphire_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "mixed_sapphire_powder"))));
    public static final DeferredItem<Item> MIXED_GARNET_POWDER = ITEMS.registerSimpleItem("mixed_garnet_powder", new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "mixed_garnet_powder"))));

    // -- Tools & Armor -- //
    // -- Pickaxes -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_PICKAXE = registerPickaxeItem("red_sapphire_pickaxe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 5.5f, 1.2f, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_PICKAXE = registerPickaxeItem("blue_sapphire_pickaxe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 5.5f, 1.2f, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_PICKAXE = registerPickaxeItem("green_sapphire_pickaxe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 5.5f, 1.2f, false);

    public static final DeferredItem<Item> RED_GARNET_PICKAXE = registerPickaxeItem("red_garnet_pickaxe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 5.7f, 1.2f, false);
    public static final DeferredItem<Item> BLUE_GARNET_PICKAXE = registerPickaxeItem("blue_garnet_pickaxe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 5.7f, 1.2f, false);
    public static final DeferredItem<Item> PINK_GARNET_PICKAXE = registerPickaxeItem("pink_garnet_pickaxe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 5.7f, 1.2f, false);
    public static final DeferredItem<Item> YELLOW_GARNET_PICKAXE = registerPickaxeItem("yellow_garnet_pickaxe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 5.7f, 1.2f, false);

    public static final DeferredItem<Item> FUSION_PICKAXE = registerPickaxeItem("fusion_pickaxe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 7.5f, 1.2f, true);

    public static final DeferredItem<Item> RUBY_PICKAXE = registerPickaxeItem("ruby_pickaxe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 6.5f, 1.2f, false);

    // -- Axes -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_AXE = registerAxeItem("red_sapphire_axe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 9.5f, 1f, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_AXE = registerAxeItem("blue_sapphire_axe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 9.5f, 1f, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_AXE = registerAxeItem("green_sapphire_axe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 9.5f, 1f, false);

    public static final DeferredItem<Item> RED_GARNET_AXE = registerAxeItem("red_garnet_axe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 9.7f, 1f, false);
    public static final DeferredItem<Item> BLUE_GARNET_AXE = registerAxeItem("blue_garnet_axe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 9.7f, 1f, false);
    public static final DeferredItem<Item> PINK_GARNET_AXE = registerAxeItem("pink_garnet_axe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 9.7f, 1f, false);
    public static final DeferredItem<Item> YELLOW_GARNET_AXE = registerAxeItem("yellow_garnet_axe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 9.7f, 1f, false);

    public static final DeferredItem<Item> FUSION_AXE = registerAxeItem("fusion_axe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 11.5f, 1.2f, true);

    public static final DeferredItem<Item> RUBY_AXE = registerAxeItem("ruby_axe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 10.5f, 1f, false);

    // -- Shovels -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_SHOVEL = registerShovelItem("red_sapphire_shovel", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 6f, 1, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_SHOVEL = registerShovelItem("blue_sapphire_shovel", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 6f, 1, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_SHOVEL = registerShovelItem("green_sapphire_shovel", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 6f, 1, false);

    public static final DeferredItem<Item> RED_GARNET_SHOVEL = registerShovelItem("red_garnet_shovel", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 6.1f, 1, false);
    public static final DeferredItem<Item> BLUE_GARNET_SHOVEL = registerShovelItem("blue_garnet_shovel", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 6.1f, 1, false);
    public static final DeferredItem<Item> PINK_GARNET_SHOVEL = registerShovelItem("pink_garnet_shovel", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 6.1f, 1, false);
    public static final DeferredItem<Item> YELLOW_GARNET_SHOVEL = registerShovelItem("yellow_garnet_shovel", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 6.1f, 1, false);

    public static final DeferredItem<Item> FUSION_SHOVEL = registerShovelItem("fusion_shovel", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 6.5f, 1.65f, true);

    public static final DeferredItem<Item> RUBY_SHOVEL = registerShovelItem("ruby_shovel", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 5.5f, 1.6f, false);

    // -- Hoes -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_HOE = registerHoeItem("red_sapphire_hoe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 1f, 4.5f, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_HOE = registerHoeItem("blue_sapphire_hoe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 1f, 4.5f, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_HOE = registerHoeItem("green_sapphire_hoe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 1f, 4.5f, false);

    public static final DeferredItem<Item> RED_GARNET_HOE = registerHoeItem("red_garnet_hoe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 1f, 4.6f, false);
    public static final DeferredItem<Item> BLUE_GARNET_HOE = registerHoeItem("blue_garnet_hoe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 1f, 4.6f, false);
    public static final DeferredItem<Item> PINK_GARNET_HOE = registerHoeItem("pink_garnet_hoe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 1f, 4.6f, false);
    public static final DeferredItem<Item> YELLOW_GARNET_HOE = registerHoeItem("yellow_garnet_hoe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 1f, 4.6f, false);

    public static final DeferredItem<Item> FUSION_HOE = registerHoeItem("fusion_hoe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 1f, 5.5f, true);

    public static final DeferredItem<Item> RUBY_HOE = registerHoeItem("ruby_hoe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 1f, 5f, false);

    // -- Swords -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_SWORD = registerSwordItem("red_sapphire_sword", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 7.5f, 1.6f, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_SWORD = registerSwordItem("blue_sapphire_sword", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 7.5f, 1.6f, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_SWORD = registerSwordItem("green_sapphire_sword", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 7.5f, 1.6f, false);

    public static final DeferredItem<Item> RED_GARNET_SWORD = registerSwordItem("red_garnet_sword", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 7.6f, 1.6f, false);
    public static final DeferredItem<Item> BLUE_GARNET_SWORD = registerSwordItem("blue_garnet_sword", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 7.6f, 1.6f, false);
    public static final DeferredItem<Item> PINK_GARNET_SWORD = registerSwordItem("pink_garnet_sword", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 7.6f, 1.6f, false);
    public static final DeferredItem<Item> YELLOW_GARNET_SWORD = registerSwordItem("yellow_garnet_sword", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 7.6f, 1.6f, false);

    public static final DeferredItem<Item> FUSION_SWORD = registerSwordItem("fusion_sword", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 9.5f, 1.2f, true);

    public static final DeferredItem<Item> RUBY_SWORD = registerSwordItem("ruby_sword", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 8.5f, 1.6f, false);

    // -- Armors -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_HELMET = registerArmorItem("red_sapphire_helmet", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<Item> RED_SAPPHIRE_CHESTPLATE = registerArmorItem("red_sapphire_chestplate", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<Item> RED_SAPPHIRE_LEGGINGS = registerArmorItem("red_sapphire_leggings", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<Item> RED_SAPPHIRE_BOOTS = registerArmorItem("red_sapphire_boots", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<Item> BLUE_SAPPHIRE_HELMET = registerArmorItem("blue_sapphire_helmet", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_CHESTPLATE = registerArmorItem("blue_sapphire_chestplate", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_LEGGINGS = registerArmorItem("blue_sapphire_leggings", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_BOOTS = registerArmorItem("blue_sapphire_boots", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<Item> GREEN_SAPPHIRE_HELMET = registerArmorItem("green_sapphire_helmet", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_CHESTPLATE = registerArmorItem("green_sapphire_chestplate", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_LEGGINGS = registerArmorItem("green_sapphire_leggings", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_BOOTS = registerArmorItem("green_sapphire_boots", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<Item> RED_GARNET_HELMET = registerArmorItem("red_garnet_helmet", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<Item> RED_GARNET_CHESTPLATE = registerArmorItem("red_garnet_chestplate", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<Item> RED_GARNET_LEGGINGS = registerArmorItem("red_garnet_leggings", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<Item> RED_GARNET_BOOTS = registerArmorItem("red_garnet_boots", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<Item> BLUE_GARNET_HELMET = registerArmorItem("blue_garnet_helmet", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<Item> BLUE_GARNET_CHESTPLATE = registerArmorItem("blue_garnet_chestplate", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<Item> BLUE_GARNET_LEGGINGS = registerArmorItem("blue_garnet_leggings", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<Item> BLUE_GARNET_BOOTS = registerArmorItem("blue_garnet_boots", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<Item> PINK_GARNET_HELMET = registerArmorItem("pink_garnet_helmet", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<Item> PINK_GARNET_CHESTPLATE = registerArmorItem("pink_garnet_chestplate", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<Item> PINK_GARNET_LEGGINGS = registerArmorItem("pink_garnet_leggings", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<Item> PINK_GARNET_BOOTS = registerArmorItem("pink_garnet_boots", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<Item> YELLOW_GARNET_HELMET = registerArmorItem("yellow_garnet_helmet", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<Item> YELLOW_GARNET_CHESTPLATE = registerArmorItem("yellow_garnet_chestplate", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<Item> YELLOW_GARNET_LEGGINGS = registerArmorItem("yellow_garnet_leggings", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<Item> YELLOW_GARNET_BOOTS = registerArmorItem("yellow_garnet_boots", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<Item> FUSION_HELMET = registerArmorItem("fusion_helmet", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.HELMET, 50, true);
    public static final DeferredItem<Item> FUSION_CHESTPLATE = registerArmorItem("fusion_chestplate", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.CHESTPLATE, 50, true);
    public static final DeferredItem<Item> FUSION_LEGGINGS = registerArmorItem("fusion_leggings", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.LEGGINGS, 50, true);
    public static final DeferredItem<Item> FUSION_BOOTS = registerArmorItem("fusion_boots", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.BOOTS, 50, true);

    public static final DeferredItem<Item> RUBY_HELMET = registerArmorItem("ruby_helmet", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.HELMET, 40, false);
    public static final DeferredItem<Item> RUBY_CHESTPLATE = registerArmorItem("ruby_chestplate", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.CHESTPLATE, 40, false);
    public static final DeferredItem<Item> RUBY_LEGGINGS = registerArmorItem("ruby_leggings", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.LEGGINGS, 40, false);
    public static final DeferredItem<Item> RUBY_BOOTS = registerArmorItem("ruby_boots", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.BOOTS, 40, false);

    // -- Effective Foods -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_APPLE = registerFoodItem("red_sapphire_apple", AdvancedValuables_FoodProperties.RED_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.RED_SAPPHIRE_APPLE);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_APPLE = registerFoodItem("blue_sapphire_apple", AdvancedValuables_FoodProperties.BLUE_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.BLUE_SAPPHIRE_APPLE);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_APPLE = registerFoodItem("green_sapphire_apple", AdvancedValuables_FoodProperties.GREEN_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.GREEN_SAPPHIRE_APPLE);

    public static final DeferredItem<Item> RED_GARNET_APPLE = registerFoodItem("red_garnet_apple", AdvancedValuables_FoodProperties.RED_GARNET_APPLE, AdvancedValuables_FoodConsumables.RED_GARNET_APPLE);
    public static final DeferredItem<Item> BLUE_GARNET_APPLE = registerFoodItem("blue_garnet_apple", AdvancedValuables_FoodProperties.BLUE_GARNET_APPLE, AdvancedValuables_FoodConsumables.BLUE_GARNET_APPLE);
    public static final DeferredItem<Item> PINK_GARNET_APPLE = registerFoodItem("pink_garnet_apple", AdvancedValuables_FoodProperties.PINK_GARNET_APPLE, AdvancedValuables_FoodConsumables.PINK_GARNET_APPLE);
    public static final DeferredItem<Item> YELLOW_GARNET_APPLE = registerFoodItem("yellow_garnet_apple", AdvancedValuables_FoodProperties.YELLOW_GARNET_APPLE, AdvancedValuables_FoodConsumables.YELLOW_GARNET_APPLE);

    public static final DeferredItem<Item> FUSION_APPLE = registerFoodItem("fusion_apple", AdvancedValuables_FoodProperties.FUSION_APPLE, AdvancedValuables_FoodConsumables.FUSION_APPLE);
    public static final DeferredItem<Item> RUBY_APPLE = registerFoodItem("ruby_apple", AdvancedValuables_FoodProperties.RUBY_APPLE, AdvancedValuables_FoodConsumables.RUBY_APPLE);

    public static final DeferredItem<Item> ILLEGAL_FOOD = registerFoodItem("illegal_food", AdvancedValuables_FoodProperties.ILLEGAL_FOOD, AdvancedValuables_FoodConsumables.ILLEGAL_FOOD);

    // -- Hammers -- //

    public static final DeferredItem<HammerItem> RED_SAPPHIRE_HAMMER = registerHammerItem("red_sapphire_hammer", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, false);
    public static final DeferredItem<HammerItem> BLUE_SAPPHIRE_HAMMER = registerHammerItem("blue_sapphire_hammer", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, false);
    public static final DeferredItem<HammerItem> GREEN_SAPPHIRE_HAMMER = registerHammerItem("green_sapphire_hammer", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, false);

    public static final DeferredItem<HammerItem> RED_GARNET_HAMMER = registerHammerItem("red_garnet_hammer", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 7.7f, 1.6f, false);
    public static final DeferredItem<HammerItem> BLUE_GARNET_HAMMER = registerHammerItem("blue_garnet_hammer", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 7.7f, 1.6f, false);
    public static final DeferredItem<HammerItem> PINK_GARNET_HAMMER = registerHammerItem("pink_garnet_hammer", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 7.7f, 1.6f, false);
    public static final DeferredItem<HammerItem> YELLOW_GARNET_HAMMER = registerHammerItem("yellow_garnet_hammer", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 7.7f, 1.6f, false);

    public static final DeferredItem<HammerItem> FUSION_HAMMER = registerHammerItem("fusion_hammer", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 10.5f, 1.2f, true);
    public static final DeferredItem<HammerItem> RUBY_HAMMER = registerHammerItem("ruby_hammer", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 9.5f, 1.6f, false);

    // -- Hammer Crafting Requirement -- //
    public static final DeferredItem<Item> HAMMER_WIREFRAME = ITEMS.registerSimpleItem("hammer_wireframe");

    private static DeferredItem<Item> registerPickaxeItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name, (properties) -> new Item(properties.pickaxe(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name, (properties) -> new Item(properties.pickaxe(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<Item> registerAxeItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name , (properties) -> new Item(properties.axe(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name , (properties) -> new Item(properties.axe(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<Item> registerShovelItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name , (properties) -> new Item(properties.shovel(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name , (properties) -> new Item(properties.shovel(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<Item> registerHoeItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name , (properties) -> new Item(properties.hoe(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name , (properties) -> new Item(properties.hoe(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<Item> registerSwordItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name , (properties) -> new Item(properties.sword(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name , (properties) -> new Item(properties.sword(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<HammerItem> registerHammerItem(String name, ToolMaterial tier, float attackDamage, float attackSpeed, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name , (properties) -> new HammerItem(properties.pickaxe(tier, attackDamage - 2.5f, attackSpeed - 4f).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name , (properties) -> new HammerItem(properties.pickaxe(tier, attackDamage - 2.5f, attackSpeed - 4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }

    private static DeferredItem<Item> registerArmorItem(String name, ArmorMaterial material, ArmorType type, int durability, boolean isFireProof)
    {
        return isFireProof ?
                ITEMS.registerItem(name, (properties) -> new Item(properties.humanoidArmor(material, type).useItemDescriptionPrefix().durability(type.getDurability(durability)).fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))))) :
                ITEMS.registerItem(name, (properties) -> new Item(properties.humanoidArmor(material, type).durability(type.getDurability(durability)).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))));
    }


    // -- Food -- //
    private static DeferredItem<Item> registerFoodItem(String name, FoodProperties properties, Consumable consumable)
    {
        return ITEMS.registerSimpleItem(name, new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))
                .food(properties, consumable));
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
