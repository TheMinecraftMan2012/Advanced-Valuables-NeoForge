package net.theminecraftman.advancedvaluables.AV_Registries;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents.AdvancedValuables_FoodProperties;
import net.theminecraftman.advancedvaluables.AV_Libraries.Hammer.HammerItem;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ArmorMaterials;
import net.theminecraftman.advancedvaluables.AV_Libraries.ToolsComponents.AdvancedValuables_ToolsTier;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.function.Supplier;

public class AdvancedValuables_ItemClass
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedValuables.MOD_ID);

    public static final DeferredItem<Item> BLUE_SAPPHIRE = ITEMS.registerSimpleItem("blue_sapphire");
    public static final DeferredItem<Item> RED_SAPPHIRE = ITEMS.registerSimpleItem("red_sapphire");
    public static final DeferredItem<Item> GREEN_SAPPHIRE = ITEMS.registerSimpleItem("green_sapphire");

    public static final DeferredItem<Item> RED_GARNET = ITEMS.registerSimpleItem("red_garnet");
    public static final DeferredItem<Item> PINK_GARNET = ITEMS.registerSimpleItem("pink_garnet");
    public static final DeferredItem<Item> BLUE_GARNET = ITEMS.registerSimpleItem("blue_garnet");
    public static final DeferredItem<Item> YELLOW_GARNET = ITEMS.registerSimpleItem("yellow_garnet");

    public static final DeferredItem<Item> FUSION_GEM = ITEMS.registerSimpleItem("fusion_gem", new Item.Properties().fireResistant());
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");

    public static final DeferredItem<Item> BLUE_RAW_SAPPHIRE = ITEMS.registerSimpleItem("blue_raw_sapphire");
    public static final DeferredItem<Item> RED_RAW_SAPPHIRE = ITEMS.registerSimpleItem("red_raw_sapphire");
    public static final DeferredItem<Item> GREEN_RAW_SAPPHIRE = ITEMS.registerSimpleItem("green_raw_sapphire");

    public static final DeferredItem<Item> RED_RAW_GARNET = ITEMS.registerSimpleItem("red_raw_garnet");
    public static final DeferredItem<Item> PINK_RAW_GARNET = ITEMS.registerSimpleItem("pink_raw_garnet");
    public static final DeferredItem<Item> BLUE_RAW_GARNET = ITEMS.registerSimpleItem("blue_raw_garnet");
    public static final DeferredItem<Item> YELLOW_RAW_GARNET = ITEMS.registerSimpleItem("yellow_raw_garnet");

    public static final DeferredItem<Item> RAW_FUSION_GEM = ITEMS.registerSimpleItem("raw_fusion_gem", new Item.Properties().fireResistant());
    public static final DeferredItem<Item> RAW_RUBY = ITEMS.registerSimpleItem("raw_ruby");

    // -- Tools & Armor -- //
    // -- Pickaxes -- //
    public static final DeferredItem<PickaxeItem> RED_SAPPHIRE_PICKAXE = registerPickaxeItem("red_sapphire_pickaxe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<PickaxeItem> BLUE_SAPPHIRE_PICKAXE = registerPickaxeItem("blue_sapphire_pickaxe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<PickaxeItem> GREEN_SAPPHIRE_PICKAXE = registerPickaxeItem("green_sapphire_pickaxe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<PickaxeItem> RED_GARNET_PICKAXE = registerPickaxeItem("red_garnet_pickaxe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<PickaxeItem> BLUE_GARNET_PICKAXE = registerPickaxeItem("blue_garnet_pickaxe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<PickaxeItem> PINK_GARNET_PICKAXE = registerPickaxeItem("pink_garnet_pickaxe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<PickaxeItem> YELLOW_GARNET_PICKAXE = registerPickaxeItem("yellow_garnet_pickaxe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<PickaxeItem> FUSION_PICKAXE = registerFireResistantPickaxeItem("fusion_pickaxe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = registerPickaxeItem("ruby_pickaxe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Axes -- //
    public static final DeferredItem<AxeItem> RED_SAPPHIRE_AXE = registerAxeItem("red_sapphire_axe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<AxeItem> BLUE_SAPPHIRE_AXE = registerAxeItem("blue_sapphire_axe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<AxeItem> GREEN_SAPPHIRE_AXE = registerAxeItem("green_sapphire_axe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<AxeItem> RED_GARNET_AXE = registerAxeItem("red_garnet_axe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<AxeItem> BLUE_GARNET_AXE = registerAxeItem("blue_garnet_axe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<AxeItem> PINK_GARNET_AXE = registerAxeItem("pink_garnet_axe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<AxeItem> YELLOW_GARNET_AXE = registerAxeItem("yellow_garnet_axe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<AxeItem> FUSION_AXE = registerFireResistantAxeItem("fusion_axe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<AxeItem> RUBY_AXE = registerAxeItem("ruby_axe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Shovels -- //
    public static final DeferredItem<ShovelItem> RED_SAPPHIRE_SHOVEL = registerShovelItem("red_sapphire_shovel", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<ShovelItem> BLUE_SAPPHIRE_SHOVEL = registerShovelItem("blue_sapphire_shovel", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<ShovelItem> GREEN_SAPPHIRE_SHOVEL = registerShovelItem("green_sapphire_shovel", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<ShovelItem> RED_GARNET_SHOVEL = registerShovelItem("red_garnet_shovel", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<ShovelItem> BLUE_GARNET_SHOVEL = registerShovelItem("blue_garnet_shovel", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<ShovelItem> PINK_GARNET_SHOVEL = registerShovelItem("pink_garnet_shovel", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<ShovelItem> YELLOW_GARNET_SHOVEL = registerShovelItem("yellow_garnet_shovel", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<ShovelItem> FUSION_SHOVEL = registerFireResistantShovelItem("fusion_shovel", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = registerShovelItem("ruby_shovel", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Hoes -- //
    public static final DeferredItem<HoeItem> RED_SAPPHIRE_HOE = registerHoeItem("red_sapphire_hoe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<HoeItem> BLUE_SAPPHIRE_HOE = registerHoeItem("blue_sapphire_hoe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<HoeItem> GREEN_SAPPHIRE_HOE = registerHoeItem("green_sapphire_hoe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<HoeItem> RED_GARNET_HOE = registerHoeItem("red_garnet_hoe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<HoeItem> BLUE_GARNET_HOE = registerHoeItem("blue_garnet_hoe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<HoeItem> PINK_GARNET_HOE = registerHoeItem("pink_garnet_hoe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<HoeItem> YELLOW_GARNET_HOE = registerHoeItem("yellow_garnet_hoe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<HoeItem> FUSION_HOE = registerFireResistantHoeItem("fusion_hoe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<HoeItem> RUBY_HOE = registerHoeItem("ruby_hoe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Swords -- //
    public static final DeferredItem<SwordItem> RED_SAPPHIRE_SWORD = registerSwordItem("red_sapphire_sword", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<SwordItem> BLUE_SAPPHIRE_SWORD = registerSwordItem("blue_sapphire_sword", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<SwordItem> GREEN_SAPPHIRE_SWORD = registerSwordItem("green_sapphire_sword", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<SwordItem> RED_GARNET_SWORD = registerSwordItem("red_garnet_sword", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<SwordItem> BLUE_GARNET_SWORD = registerSwordItem("blue_garnet_sword", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<SwordItem> PINK_GARNET_SWORD = registerSwordItem("pink_garnet_sword", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<SwordItem> YELLOW_GARNET_SWORD = registerSwordItem("yellow_garnet_sword", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<SwordItem> FUSION_SWORD = registerFireResistantSwordItem("fusion_sword", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<SwordItem> RUBY_SWORD = registerSwordItem("ruby_sword", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Armors -- //
    public static final DeferredItem<ArmorItem> RED_SAPPHIRE_HELMET = registerArmorItem("red_sapphire_helmet", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.HELMET, 15);
    public static final DeferredItem<ArmorItem> RED_SAPPHIRE_CHESTPLATE = registerArmorItem("red_sapphire_chestplate", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.CHESTPLATE, 15);
    public static final DeferredItem<ArmorItem> RED_SAPPHIRE_LEGGINGS = registerArmorItem("red_sapphire_leggings", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.LEGGINGS, 15);
    public static final DeferredItem<ArmorItem> RED_SAPPHIRE_BOOTS = registerArmorItem("red_sapphire_boots", AdvancedValuables_ArmorMaterials.RED_SAPPHIRE, ArmorItem.Type.BOOTS, 15);

    public static final DeferredItem<ArmorItem> BLUE_SAPPHIRE_HELMET = registerArmorItem("blue_sapphire_helmet", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.HELMET, 15);
    public static final DeferredItem<ArmorItem> BLUE_SAPPHIRE_CHESTPLATE = registerArmorItem("blue_sapphire_chestplate", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.CHESTPLATE, 15);
    public static final DeferredItem<ArmorItem> BLUE_SAPPHIRE_LEGGINGS = registerArmorItem("blue_sapphire_leggings", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.LEGGINGS, 15);
    public static final DeferredItem<ArmorItem> BLUE_SAPPHIRE_BOOTS = registerArmorItem("blue_sapphire_boots", AdvancedValuables_ArmorMaterials.BLUE_SAPPHIRE, ArmorItem.Type.BOOTS, 15);

    public static final DeferredItem<ArmorItem> GREEN_SAPPHIRE_HELMET = registerArmorItem("green_sapphire_helmet", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.HELMET, 15);
    public static final DeferredItem<ArmorItem> GREEN_SAPPHIRE_CHESTPLATE = registerArmorItem("green_sapphire_chestplate", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.CHESTPLATE, 15);
    public static final DeferredItem<ArmorItem> GREEN_SAPPHIRE_LEGGINGS = registerArmorItem("green_sapphire_leggings", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.LEGGINGS, 15);
    public static final DeferredItem<ArmorItem> GREEN_SAPPHIRE_BOOTS = registerArmorItem("green_sapphire_boots", AdvancedValuables_ArmorMaterials.GREEN_SAPPHIRE, ArmorItem.Type.BOOTS, 15);

    public static final DeferredItem<ArmorItem> RED_GARNET_HELMET = registerArmorItem("red_garnet_helmet", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.HELMET, 18);
    public static final DeferredItem<ArmorItem> RED_GARNET_CHESTPLATE = registerArmorItem("red_garnet_chestplate", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.CHESTPLATE, 18);
    public static final DeferredItem<ArmorItem> RED_GARNET_LEGGINGS = registerArmorItem("red_garnet_leggings", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.LEGGINGS, 18);
    public static final DeferredItem<ArmorItem> RED_GARNET_BOOTS = registerArmorItem("red_garnet_boots", AdvancedValuables_ArmorMaterials.RED_GARNET, ArmorItem.Type.BOOTS, 18);

    public static final DeferredItem<ArmorItem> BLUE_GARNET_HELMET = registerArmorItem("blue_garnet_helmet", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.HELMET, 18);
    public static final DeferredItem<ArmorItem> BLUE_GARNET_CHESTPLATE = registerArmorItem("blue_garnet_chestplate", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.CHESTPLATE, 18);
    public static final DeferredItem<ArmorItem> BLUE_GARNET_LEGGINGS = registerArmorItem("blue_garnet_leggings", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.LEGGINGS, 18);
    public static final DeferredItem<ArmorItem> BLUE_GARNET_BOOTS = registerArmorItem("blue_garnet_boots", AdvancedValuables_ArmorMaterials.BLUE_GARNET, ArmorItem.Type.BOOTS, 18);

    public static final DeferredItem<ArmorItem> PINK_GARNET_HELMET = registerArmorItem("pink_garnet_helmet", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.HELMET, 18);
    public static final DeferredItem<ArmorItem> PINK_GARNET_CHESTPLATE = registerArmorItem("pink_garnet_chestplate", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.CHESTPLATE, 18);
    public static final DeferredItem<ArmorItem> PINK_GARNET_LEGGINGS = registerArmorItem("pink_garnet_leggings", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.LEGGINGS, 18);
    public static final DeferredItem<ArmorItem> PINK_GARNET_BOOTS = registerArmorItem("pink_garnet_boots", AdvancedValuables_ArmorMaterials.PINK_GARNET, ArmorItem.Type.BOOTS, 18);

    public static final DeferredItem<ArmorItem> YELLOW_GARNET_HELMET = registerArmorItem("yellow_garnet_helmet", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.HELMET, 18);
    public static final DeferredItem<ArmorItem> YELLOW_GARNET_CHESTPLATE = registerArmorItem("yellow_garnet_chestplate", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.CHESTPLATE, 18);
    public static final DeferredItem<ArmorItem> YELLOW_GARNET_LEGGINGS = registerArmorItem("yellow_garnet_leggings", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.LEGGINGS, 18);
    public static final DeferredItem<ArmorItem> YELLOW_GARNET_BOOTS = registerArmorItem("yellow_garnet_boots", AdvancedValuables_ArmorMaterials.YELLOW_GARNET, ArmorItem.Type.BOOTS, 18);

    public static final DeferredItem<ArmorItem> FUSION_HELMET = registerFireResistantArmorItem("fusion_helmet", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.HELMET, 50);
    public static final DeferredItem<ArmorItem> FUSION_CHESTPLATE = registerFireResistantArmorItem("fusion_chestplate", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.CHESTPLATE, 50);
    public static final DeferredItem<ArmorItem> FUSION_LEGGINGS = registerFireResistantArmorItem("fusion_leggings", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.LEGGINGS, 50);
    public static final DeferredItem<ArmorItem> FUSION_BOOTS = registerFireResistantArmorItem("fusion_boots", AdvancedValuables_ArmorMaterials.FUSION_GEM, ArmorItem.Type.BOOTS, 50);

    public static final DeferredItem<ArmorItem> RUBY_HELMET = registerArmorItem("ruby_helmet", AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.HELMET, 40);
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = registerArmorItem("ruby_chestplate", AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, 40);
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = registerArmorItem("ruby_leggings", AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, 40);
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = registerArmorItem("ruby_boots", AdvancedValuables_ArmorMaterials.RUBY, ArmorItem.Type.BOOTS, 40);

    // -- Effective Foods -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_APPLE = ITEMS.registerSimpleItem("red_sapphire_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.RED_SAPPHIRE_APPLE));
    public static final DeferredItem<Item> BLUE_SAPPHIRE_APPLE = ITEMS.registerSimpleItem("blue_sapphire_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.BLUE_SAPPHIRE_APPLE));
    public static final DeferredItem<Item> GREEN_SAPPHIRE_APPLE = ITEMS.registerSimpleItem("green_sapphire_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.GREEN_SAPPHIRE_APPLE));

    public static final DeferredItem<Item> RED_GARNET_APPLE = ITEMS.registerSimpleItem("red_garnet_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.RED_GARNET_APPLE));
    public static final DeferredItem<Item> BLUE_GARNET_APPLE = ITEMS.registerSimpleItem("blue_garnet_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.BLUE_GARNET_APPLE));
    public static final DeferredItem<Item> PINK_GARNET_APPLE = ITEMS.registerSimpleItem("pink_garnet_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.PINK_GARNET_APPLE));
    public static final DeferredItem<Item> YELLOW_GARNET_APPLE = ITEMS.registerSimpleItem("yellow_garnet_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.YELLOW_GARNET_APPLE));

    public static final DeferredItem<Item> FUSION_APPLE = ITEMS.registerSimpleItem("fusion_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.FUSION_APPLE).fireResistant());
    public static final DeferredItem<Item> RUBY_APPLE = ITEMS.registerSimpleItem("ruby_apple", new Item.Properties().food(AdvancedValuables_FoodProperties.RUBY_APPLE));

    // -- Hammers -- //
    public static final DeferredItem<HammerItem> RED_SAPPHIRE_HAMMER = registerHammerItem("red_sapphire_hammer", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<HammerItem> BLUE_SAPPHIRE_HAMMER = registerHammerItem("blue_sapphire_hammer", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<HammerItem> GREEN_SAPPHIRE_HAMMER = registerHammerItem("green_sapphire_hammer", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<HammerItem> RED_GARNET_HAMMER = registerHammerItem("red_garnet_hammer", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<HammerItem> BLUE_GARNET_HAMMER = registerHammerItem("blue_garnet_hammer", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<HammerItem> PINK_GARNET_HAMMER = registerHammerItem("pink_garnet_hammer", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<HammerItem> YELLOW_GARNET_HAMMER = registerHammerItem("yellow_garnet_hammer", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<HammerItem> FUSION_HAMMER = registerFireResistantHammerItem("fusion_hammer", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);
    public static final DeferredItem<HammerItem> RUBY_HAMMER = registerHammerItem("ruby_hammer", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Hammer Crafting Requirement -- //
    public static final DeferredItem<Item> HAMMER_WIREFRAME = ITEMS.registerSimpleItem("hammer_wireframe");

    private static DeferredItem<PickaxeItem> registerPickaxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1, -2.8f))));
    }

    private static DeferredItem<AxeItem> registerAxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, 6, -3.2f))));
    }

    private static DeferredItem<ShovelItem> registerShovelItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, 1.5f, -3f))));
    }

    private static DeferredItem<HoeItem> registerHoeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, 0, -3f))));
    }

    private static DeferredItem<SwordItem> registerSwordItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4f))));
    }

    private static DeferredItem<PickaxeItem> registerFireResistantPickaxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1, -2.8f)).fireResistant()));
    }

    private static DeferredItem<AxeItem> registerFireResistantAxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, 6, -3.2f)).fireResistant()));
    }

    private static DeferredItem<ShovelItem> registerFireResistantShovelItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, 1.5f, -3f)).fireResistant()));
    }

    private static DeferredItem<HoeItem> registerFireResistantHoeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, 0, -3f)).fireResistant()));
    }

    private static DeferredItem<SwordItem> registerFireResistantSwordItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4f)).fireResistant()));
    }

    // -- Armor -- //
    private static DeferredItem<ArmorItem> registerArmorItem(String name, Holder<ArmorMaterial> armorMaterial, ArmorItem.Type armorType, int getDurability)
    {
        return ITEMS.register(name, () -> new ArmorItem(armorMaterial, armorType, new Item.Properties().durability(armorType.getDurability(getDurability))));
    }

    private static DeferredItem<ArmorItem> registerFireResistantArmorItem(String name, Holder<ArmorMaterial> armorMaterial, ArmorItem.Type armorType, int getDurability)
    {
        return ITEMS.register(name, () -> new ArmorItem(armorMaterial, armorType, new Item.Properties().durability(armorType.getDurability(getDurability)).fireResistant()));
    }

    // -- Hammer -- //
    private static DeferredItem<HammerItem> registerHammerItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HammerItem(tier, new Item.Properties().attributes(HammerItem.createAttributes(tier, 7F, -3.5f))));
    }

    private static DeferredItem<HammerItem> registerFireResistantHammerItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HammerItem(tier, new Item.Properties().attributes(HammerItem.createAttributes(tier, 7F, -3.5f)).fireResistant()));
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
