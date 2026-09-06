package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Items.SparkiteStaff.SparkiteStaff;
import net.neoorangepanda.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodConsumables;
import net.neoorangepanda.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodProperties;
import net.neoorangepanda.advancedvaluables.AV_Items.Hammer.HammerItem;
import net.neoorangepanda.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ArmorMaterials;
import net.neoorangepanda.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ToolsTier;
import net.neoorangepanda.advancedvaluables.AV_Trims.AdvancedValuables_TrimMaterial;
import net.neoorangepanda.advancedvaluables.AV_Utils.AdvancedValuables_Tags;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class  AdvancedValuables_ItemClass
{
    public static final DeferredRegister<@NotNull Potion> POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, AdvancedValuables.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedValuables.MOD_ID);

    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE = ITEMS.registerSimpleItem("blue_sapphire", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.BLUE_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"))));
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE = ITEMS.registerSimpleItem("red_sapphire", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.RED_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"))));
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE = ITEMS.registerSimpleItem("green_sapphire", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.GREEN_SAPPHIRE)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"))));

    public static final DeferredItem<@NotNull Item> RED_GARNET = ITEMS.registerSimpleItem("red_garnet", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.RED_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"))));
    public static final DeferredItem<@NotNull Item> PINK_GARNET = ITEMS.registerSimpleItem("pink_garnet", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.PINK_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"))));
    public static final DeferredItem<@NotNull Item> BLUE_GARNET = ITEMS.registerSimpleItem("blue_garnet", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.BLUE_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"))));
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET = ITEMS.registerSimpleItem("yellow_garnet", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.YELLOW_GARNET)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"))));

    public static final DeferredItem<@NotNull Item> FUSION_GEM = ITEMS.registerSimpleItem("fusion_gem", properties -> properties.fireResistant().trimMaterial(AdvancedValuables_TrimMaterial.FUSION_GEM)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"))));
    public static final DeferredItem<@NotNull Item> RUBY = ITEMS.registerSimpleItem("ruby", properties -> properties.trimMaterial(AdvancedValuables_TrimMaterial.RUBY)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"))));

    public static final DeferredItem<@NotNull Item> BLUE_RAW_SAPPHIRE = ITEMS.registerSimpleItem("blue_raw_sapphire", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_raw_sapphire"))));
    public static final DeferredItem<@NotNull Item> RED_RAW_SAPPHIRE = ITEMS.registerSimpleItem("red_raw_sapphire", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_raw_sapphire"))));
    public static final DeferredItem<@NotNull Item> GREEN_RAW_SAPPHIRE = ITEMS.registerSimpleItem("green_raw_sapphire", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_raw_sapphire"))));

    public static final DeferredItem<@NotNull Item> RED_RAW_GARNET = ITEMS.registerSimpleItem("red_raw_garnet", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_raw_garnet"))));
    public static final DeferredItem<@NotNull Item> PINK_RAW_GARNET = ITEMS.registerSimpleItem("pink_raw_garnet", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_raw_garnet"))));
    public static final DeferredItem<@NotNull Item> BLUE_RAW_GARNET = ITEMS.registerSimpleItem("blue_raw_garnet", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_raw_garnet"))));
    public static final DeferredItem<@NotNull Item> YELLOW_RAW_GARNET = ITEMS.registerSimpleItem("yellow_raw_garnet", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_raw_garnet"))));

    public static final DeferredItem<@NotNull Item> RAW_FUSION_GEM = ITEMS.registerSimpleItem("raw_fusion_gem", properties -> properties.fireResistant()
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "raw_fusion_gem"))));
    public static final DeferredItem<@NotNull Item> RAW_RUBY = ITEMS.registerSimpleItem("raw_ruby", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "raw_ruby"))));

    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("red_sapphire_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire_powder"))));
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("blue_sapphire_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire_powder"))));
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("green_sapphire_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire_powder"))));

    public static final DeferredItem<@NotNull Item> RED_GARNET_POWDER = ITEMS.registerSimpleItem("red_garnet_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet_powder"))));
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_POWDER = ITEMS.registerSimpleItem("blue_garnet_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet_powder"))));
    public static final DeferredItem<@NotNull Item> PINK_GARNET_POWDER = ITEMS.registerSimpleItem("pink_garnet_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet_powder"))));
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_POWDER = ITEMS.registerSimpleItem("yellow_garnet_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet_powder"))));

    public static final DeferredItem<@NotNull Item> RUBY_POWDER = ITEMS.registerSimpleItem("ruby_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby_powder"))));

    public static final DeferredItem<@NotNull Item> MIXED_SAPPHIRE_POWDER = ITEMS.registerSimpleItem("mixed_sapphire_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "mixed_sapphire_powder"))));
    public static final DeferredItem<@NotNull Item> MIXED_GARNET_POWDER = ITEMS.registerSimpleItem("mixed_garnet_powder", properties -> properties
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "mixed_garnet_powder"))));

    public static final DeferredItem<@NotNull Item> SPARKITE = ITEMS.registerItem("sparkite", Item::new, properties -> properties
            .fireResistant().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "sparkite"))));

    public static final DeferredItem<@NotNull Item> SPARKITE_STAFF = ITEMS.registerItem("sparkite_staff", SparkiteStaff::new, properties -> properties
            .stacksTo(1).component(AdvancedValuables_DataComponent.THUNDER_COUNT.get(), 1).fireResistant()
            .sword(AdvancedValuables_ToolsTier.SPARKITE_TOOL_TIER, 3, -2.4f).rarity(Rarity.EPIC)
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "sparkite_staff"))));

    // -- Tools & Armor -- //
    // -- Pickaxes -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_PICKAXE = registerPickaxeItem("red_sapphire_pickaxe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_PICKAXE = registerPickaxeItem("blue_sapphire_pickaxe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_PICKAXE = registerPickaxeItem("green_sapphire_pickaxe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_PICKAXE = registerPickaxeItem("red_garnet_pickaxe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_PICKAXE = registerPickaxeItem("blue_garnet_pickaxe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_PICKAXE = registerPickaxeItem("pink_garnet_pickaxe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_PICKAXE = registerPickaxeItem("yellow_garnet_pickaxe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> FUSION_PICKAXE = registerPickaxeItem("fusion_pickaxe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, true);

    public static final DeferredItem<@NotNull Item> RUBY_PICKAXE = registerPickaxeItem("ruby_pickaxe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, false);

    // -- Axes -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_AXE = registerAxeItem("red_sapphire_axe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_AXE = registerAxeItem("blue_sapphire_axe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_AXE = registerAxeItem("green_sapphire_axe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_AXE = registerAxeItem("red_garnet_axe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_AXE = registerAxeItem("blue_garnet_axe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_AXE = registerAxeItem("pink_garnet_axe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_AXE = registerAxeItem("yellow_garnet_axe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> FUSION_AXE = registerAxeItem("fusion_axe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, true);

    public static final DeferredItem<@NotNull Item> RUBY_AXE = registerAxeItem("ruby_axe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, false);

    // -- Shovels -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_SHOVEL = registerShovelItem("red_sapphire_shovel", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_SHOVEL = registerShovelItem("blue_sapphire_shovel", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_SHOVEL = registerShovelItem("green_sapphire_shovel", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_SHOVEL = registerShovelItem("red_garnet_shovel", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_SHOVEL = registerShovelItem("blue_garnet_shovel", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_SHOVEL = registerShovelItem("pink_garnet_shovel", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_SHOVEL = registerShovelItem("yellow_garnet_shovel", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> FUSION_SHOVEL = registerShovelItem("fusion_shovel", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, true);

    public static final DeferredItem<@NotNull Item> RUBY_SHOVEL = registerShovelItem("ruby_shovel", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, false);

    // -- Hoes -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_HOE = registerHoeItem("red_sapphire_hoe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_HOE = registerHoeItem("blue_sapphire_hoe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_HOE = registerHoeItem("green_sapphire_hoe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_HOE = registerHoeItem("red_garnet_hoe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_HOE = registerHoeItem("blue_garnet_hoe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_HOE = registerHoeItem("pink_garnet_hoe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_HOE = registerHoeItem("yellow_garnet_hoe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> FUSION_HOE = registerHoeItem("fusion_hoe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, true);

    public static final DeferredItem<@NotNull Item> RUBY_HOE = registerHoeItem("ruby_hoe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, false);

    // -- Swords -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_SWORD = registerSwordItem("red_sapphire_sword", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_SWORD = registerSwordItem("blue_sapphire_sword", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_SWORD = registerSwordItem("green_sapphire_sword", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_SWORD = registerSwordItem("red_garnet_sword", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_SWORD = registerSwordItem("blue_garnet_sword", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_SWORD = registerSwordItem("pink_garnet_sword", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_SWORD = registerSwordItem("yellow_garnet_sword", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, false);

    public static final DeferredItem<@NotNull Item> FUSION_SWORD = registerSwordItem("fusion_sword", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, true);

    public static final DeferredItem<@NotNull Item> RUBY_SWORD = registerSwordItem("ruby_sword", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, false);

    // -- Spears -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_SPEAR = registerSpearItem("red_sapphire_spear", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 0.80f, 0.75f, 0.70f, 4.0f, 9.0f, 8.25f, 5.1f, 12.5f, 4.6f, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_SPEAR = registerSpearItem("blue_sapphire_spear", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 0.80f, 0.75f, 0.70f, 4.0f, 9.0f, 8.25f, 5.1f, 12.5f, 4.6f, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_SPEAR = registerSpearItem("green_sapphire_spear", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 0.80f, 0.75f, 0.70f, 4.0f, 9.0f, 8.25f, 5.1f, 12.5f, 4.6f, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_SPEAR = registerSpearItem("red_garnet_spear", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER,    0.82f, 0.78f, 0.68f, 4.0f, 8.8f, 8.25f, 5.0f, 12.0f, 4.5f, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_SPEAR = registerSpearItem("blue_garnet_spear", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER,   0.82f, 0.78f, 0.68f, 4.0f, 8.8f, 8.25f, 5.0f, 12.0f, 4.5f, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_SPEAR = registerSpearItem("pink_garnet_spear", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER,   0.82f, 0.78f, 0.68f, 4.0f, 8.8f, 8.25f, 5.0f, 12.0f, 4.5f, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_SPEAR = registerSpearItem("yellow_garnet_spear", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 0.82f, 0.78f, 0.68f, 4.0f, 8.8f, 8.25f, 5.0f, 12.0f, 4.5f, false);

    public static final DeferredItem<@NotNull Item> RUBY_SPEAR   = registerSpearItem("ruby_spear",   AdvancedValuables_ToolsTier.RUBY_TOOL_TIER,   0.85f, 0.82f, 0.60f, 4.2f, 8.5f, 8.5f, 4.8f, 12.5f, 4.2f, false);
    public static final DeferredItem<@NotNull Item> FUSION_SPEAR = registerSpearItem("fusion_spear", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 0.95f, 0.95f, 0.50f, 4.5f, 8.0f, 9.0f, 4.5f, 13.0f, 4.0f, true);

    // -- Armors -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_HELMET = registerArmorItem("red_sapphire_helmet", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_CHESTPLATE = registerArmorItem("red_sapphire_chestplate", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_LEGGINGS = registerArmorItem("red_sapphire_leggings", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_BOOTS = registerArmorItem("red_sapphire_boots", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_HELMET = registerArmorItem("blue_sapphire_helmet", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_CHESTPLATE = registerArmorItem("blue_sapphire_chestplate", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_LEGGINGS = registerArmorItem("blue_sapphire_leggings", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_BOOTS = registerArmorItem("blue_sapphire_boots", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_HELMET = registerArmorItem("green_sapphire_helmet", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.HELMET, 15, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_CHESTPLATE = registerArmorItem("green_sapphire_chestplate", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.CHESTPLATE, 15, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_LEGGINGS = registerArmorItem("green_sapphire_leggings", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.LEGGINGS, 15, false);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_BOOTS = registerArmorItem("green_sapphire_boots", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorType.BOOTS, 15, false);

    public static final DeferredItem<@NotNull Item> RED_GARNET_HELMET = registerArmorItem("red_garnet_helmet", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<@NotNull Item> RED_GARNET_CHESTPLATE = registerArmorItem("red_garnet_chestplate", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<@NotNull Item> RED_GARNET_LEGGINGS = registerArmorItem("red_garnet_leggings", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<@NotNull Item> RED_GARNET_BOOTS = registerArmorItem("red_garnet_boots", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<@NotNull Item> BLUE_GARNET_HELMET = registerArmorItem("blue_garnet_helmet", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_CHESTPLATE = registerArmorItem("blue_garnet_chestplate", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_LEGGINGS = registerArmorItem("blue_garnet_leggings", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_BOOTS = registerArmorItem("blue_garnet_boots", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<@NotNull Item> PINK_GARNET_HELMET = registerArmorItem("pink_garnet_helmet", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_CHESTPLATE = registerArmorItem("pink_garnet_chestplate", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_LEGGINGS = registerArmorItem("pink_garnet_leggings", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_BOOTS = registerArmorItem("pink_garnet_boots", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_HELMET = registerArmorItem("yellow_garnet_helmet", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.HELMET, 18, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_CHESTPLATE = registerArmorItem("yellow_garnet_chestplate", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.CHESTPLATE, 18, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_LEGGINGS = registerArmorItem("yellow_garnet_leggings", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.LEGGINGS, 18, false);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_BOOTS = registerArmorItem("yellow_garnet_boots", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorType.BOOTS, 18, false);

    public static final DeferredItem<@NotNull Item> FUSION_HELMET = registerArmorItem("fusion_helmet", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.HELMET, 50, true);
    public static final DeferredItem<@NotNull Item> FUSION_CHESTPLATE = registerArmorItem("fusion_chestplate", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.CHESTPLATE, 50, true);
    public static final DeferredItem<@NotNull Item> FUSION_LEGGINGS = registerArmorItem("fusion_leggings", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.LEGGINGS, 50, true);
    public static final DeferredItem<@NotNull Item> FUSION_BOOTS = registerArmorItem("fusion_boots", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorType.BOOTS, 50, true);

    public static final DeferredItem<@NotNull Item> RUBY_HELMET = registerArmorItem("ruby_helmet", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.HELMET, 40, false);
    public static final DeferredItem<@NotNull Item> RUBY_CHESTPLATE = registerArmorItem("ruby_chestplate", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.CHESTPLATE, 40, false);
    public static final DeferredItem<@NotNull Item> RUBY_LEGGINGS = registerArmorItem("ruby_leggings", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.LEGGINGS, 40, false);
    public static final DeferredItem<@NotNull Item> RUBY_BOOTS = registerArmorItem("ruby_boots", AdvancedValuables_ArmorMaterials.RUBY, ArmorType.BOOTS, 40, false);

    // -- Effective Foods -- //
    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_APPLE = registerFoodItem("red_sapphire_apple", AdvancedValuables_FoodProperties.RED_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.RED_SAPPHIRE_APPLE);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_APPLE = registerFoodItem("blue_sapphire_apple", AdvancedValuables_FoodProperties.BLUE_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.BLUE_SAPPHIRE_APPLE);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_APPLE = registerFoodItem("green_sapphire_apple", AdvancedValuables_FoodProperties.GREEN_SAPPHIRE_APPLE, AdvancedValuables_FoodConsumables.GREEN_SAPPHIRE_APPLE);

    public static final DeferredItem<@NotNull Item> RED_GARNET_APPLE = registerFoodItem("red_garnet_apple", AdvancedValuables_FoodProperties.RED_GARNET_APPLE, AdvancedValuables_FoodConsumables.RED_GARNET_APPLE);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_APPLE = registerFoodItem("blue_garnet_apple", AdvancedValuables_FoodProperties.BLUE_GARNET_APPLE, AdvancedValuables_FoodConsumables.BLUE_GARNET_APPLE);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_APPLE = registerFoodItem("pink_garnet_apple", AdvancedValuables_FoodProperties.PINK_GARNET_APPLE, AdvancedValuables_FoodConsumables.PINK_GARNET_APPLE);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_APPLE = registerFoodItem("yellow_garnet_apple", AdvancedValuables_FoodProperties.YELLOW_GARNET_APPLE, AdvancedValuables_FoodConsumables.YELLOW_GARNET_APPLE);

    public static final DeferredItem<@NotNull Item> FUSION_APPLE = registerFoodItem("fusion_apple", AdvancedValuables_FoodProperties.FUSION_APPLE, AdvancedValuables_FoodConsumables.FUSION_APPLE);
    public static final DeferredItem<@NotNull Item> RUBY_APPLE = registerFoodItem("ruby_apple", AdvancedValuables_FoodProperties.RUBY_APPLE, AdvancedValuables_FoodConsumables.RUBY_APPLE);

    public static final DeferredItem<@NotNull Item> ILLEGAL_FOOD = registerFoodItem("illegal_food", AdvancedValuables_FoodProperties.ILLEGAL_FOOD, AdvancedValuables_FoodConsumables.ILLEGAL_FOOD);

    // -- Hammers -- //

    public static final DeferredItem<@NotNull Item> RED_SAPPHIRE_HAMMER = registerHammerItem("red_sapphire_hammer", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);
    public static final DeferredItem<@NotNull Item> BLUE_SAPPHIRE_HAMMER = registerHammerItem("blue_sapphire_hammer", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);
    public static final DeferredItem<@NotNull Item> GREEN_SAPPHIRE_HAMMER = registerHammerItem("green_sapphire_hammer", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER, 7.6f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL);

    public static final DeferredItem<@NotNull Item> RED_GARNET_HAMMER = registerHammerItem("red_garnet_hammer", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER, 7.7f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final DeferredItem<@NotNull Item> BLUE_GARNET_HAMMER = registerHammerItem("blue_garnet_hammer", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER, 7.7f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final DeferredItem<@NotNull Item> PINK_GARNET_HAMMER = registerHammerItem("pink_garnet_hammer", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER, 7.7f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);
    public static final DeferredItem<@NotNull Item> YELLOW_GARNET_HAMMER = registerHammerItem("yellow_garnet_hammer", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER, 7.7f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL);

    public static final DeferredItem<@NotNull Item> FUSION_HAMMER = registerHammerItem("fusion_hammer", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER, 10.5f, 1.2f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_FUSION_TOOL);
    public static final DeferredItem<@NotNull Item> RUBY_HAMMER = registerHammerItem("ruby_hammer", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER, 9.5f, 1.6f, AdvancedValuables_Tags.Blocks.INCORRECT_FOR_RUBY_TOOL);

    // -- Hammer Crafting Requirement -- //
    public static final DeferredItem<@NotNull Item> HAMMER_WIREFRAME = ITEMS.registerSimpleItem("hammer_wireframe");

    // -- Potions -- //
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> RED_SAPPHIRE_EMISSION = registerPotion("red_sapphire_emission", AdvancedValuables_MobEffects.RED_SAPPHIRE_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> BLUE_SAPPHIRE_EMISSION = registerPotion("blue_sapphire_emission", AdvancedValuables_MobEffects.BLUE_SAPPHIRE_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> GREEN_SAPPHIRE_EMISSION = registerPotion("green_sapphire_emission", AdvancedValuables_MobEffects.GREEN_SAPPHIRE_EMISSION, 4800);

    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> RED_GARNET_EMISSION = registerPotion("red_garnet_emission", AdvancedValuables_MobEffects.RED_GARNET_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> BLUE_GARNET_EMISSION = registerPotion("blue_garnet_emission", AdvancedValuables_MobEffects.BLUE_GARNET_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> PINK_GARNET_EMISSION = registerPotion("pink_garnet_emission", AdvancedValuables_MobEffects.PINK_GARNET_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> YELLOW_GARNET_EMISSION = registerPotion("yellow_garnet_emission", AdvancedValuables_MobEffects.YELLOW_GARNET_EMISSION, 4800);

    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> FUSION_GEM_EMISSION = registerPotion("fusion_gem_emission", AdvancedValuables_MobEffects.FUSION_GEM_EMISSION, 4800);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> RUBY_EMISSION = registerPotion("ruby_emission", AdvancedValuables_MobEffects.RUBY_EMISSION, 4800);

    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_RED_SAPPHIRE_EMISSION = registerPotion("long_red_sapphire_emission", AdvancedValuables_MobEffects.RED_SAPPHIRE_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_BLUE_SAPPHIRE_EMISSION = registerPotion("long_blue_sapphire_emission", AdvancedValuables_MobEffects.BLUE_SAPPHIRE_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_GREEN_SAPPHIRE_EMISSION = registerPotion("long_green_sapphire_emission", AdvancedValuables_MobEffects.GREEN_SAPPHIRE_EMISSION, 9600);

    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_RED_GARNET_EMISSION = registerPotion("long_red_garnet_emission", AdvancedValuables_MobEffects.RED_GARNET_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_BLUE_GARNET_EMISSION = registerPotion("long_blue_garnet_emission", AdvancedValuables_MobEffects.BLUE_GARNET_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_PINK_GARNET_EMISSION = registerPotion("long_pink_garnet_emission", AdvancedValuables_MobEffects.PINK_GARNET_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_YELLOW_GARNET_EMISSION = registerPotion("long_yellow_garnet_emission", AdvancedValuables_MobEffects.YELLOW_GARNET_EMISSION, 9600);

    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_FUSION_GEM_EMISSION = registerPotion("long_fusion_gem_emission", AdvancedValuables_MobEffects.FUSION_GEM_EMISSION, 9600);
    public static final DeferredHolder<@NotNull Potion, @NotNull Potion> LONG_RUBY_EMISSION = registerPotion("long_ruby_emission", AdvancedValuables_MobEffects.RUBY_EMISSION, 9600);

    private static DeferredHolder<@NotNull Potion, @NotNull Potion> registerPotion(String potion_name, DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> mobEffect, int ticks)
    {
        return POTIONS.register(potion_name, registryName -> new Potion(registryName.getPath(), new MobEffectInstance(mobEffect, ticks)));
    }

    private static DeferredItem<@NotNull Item> registerPickaxeItem(String name, ToolMaterial tier, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.pickaxe(tier, 1, -2.8f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    private static DeferredItem<@NotNull Item> registerAxeItem(String name, ToolMaterial tier, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.axe(tier, 5, -3.0f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    private static DeferredItem<@NotNull Item> registerShovelItem(String name, ToolMaterial tier, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.shovel(tier, 1.5f, -3.0f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    private static DeferredItem<@NotNull Item> registerHoeItem(String name, ToolMaterial tier, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.hoe(tier, -3, -1.0f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    private static DeferredItem<@NotNull Item> registerSwordItem(String name, ToolMaterial tier, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.sword(tier, 3, -2.4f).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    private static DeferredItem<@NotNull Item> registerSpearItem(String name, ToolMaterial tier, float attackSpeedModifier, float kineticDamageMultiplier, float chargeSeconds,
                                                                 float dismountMaxSeconds, float dismountMinSpeed, float knockbackMaxSeconds, float knockbackMinSpeed, float damageMaxSeconds,
                                                                 float damageMinSpeed, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
            Item.Properties props = item.spear(tier, attackSpeedModifier, kineticDamageMultiplier, chargeSeconds,
                    dismountMaxSeconds, dismountMinSpeed, knockbackMaxSeconds, knockbackMinSpeed, damageMaxSeconds, damageMinSpeed)
                    .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));
            if (isFireProof) return new Item(props.fireResistant());
            else return new Item(props);
        });
    }

    // -- Hammers -- //
    private static DeferredItem<@NotNull Item> registerHammerItem(String name, ToolMaterial material, float attackDamageBaseline, float attackSpeedBaseline, TagKey<@NotNull Block> incorrect)
    {
        return ITEMS.registerItem(name, HammerItem::new, properties ->
                properties.tool(material, incorrect, attackDamageBaseline, attackSpeedBaseline, 2f)
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name))));
    }

    private static DeferredItem<@NotNull Item> registerArmorItem(String name, ArmorMaterial material, ArmorType type, int durability, boolean isFireProof)
    {
        return ITEMS.registerItem(name, item -> {
           Item.Properties props = item.humanoidArmor(material, type).durability(type.getDurability(durability))
                   .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)));

           if (isFireProof) return new Item(props.fireResistant());
           else return new Item(props);
        });
    }


    // -- Food -- //
    private static DeferredItem<@NotNull Item> registerFoodItem(String name, FoodProperties foodProperties, Consumable consumable)
    {
        return ITEMS.registerSimpleItem(name, properties -> properties
                .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name)))
                .food(foodProperties, consumable));
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        POTIONS.register(eventBus);
    }
}
