package net.theminecraftman.advancedvaluables.AV_Templates;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.advancedvaluables.AV_ToolsComponents.ToolsTier.AdvancedValuables_ToolsTier;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

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
    public static final DeferredItem<Item> RED_SAPPHIRE_PICKAXE = registerPickaxeItem("red_sapphire_pickaxe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_PICKAXE = registerPickaxeItem("blue_sapphire_pickaxe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_PICKAXE = registerPickaxeItem("green_sapphire_pickaxe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<Item> RED_GARNET_PICKAXE = registerPickaxeItem("red_garnet_pickaxe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_GARNET_PICKAXE = registerPickaxeItem("blue_garnet_pickaxe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> PINK_GARNET_PICKAXE = registerPickaxeItem("pink_garnet_pickaxe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> YELLOW_GARNET_PICKAXE = registerPickaxeItem("yellow_garnet_pickaxe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<Item> FUSION_PICKAXE = registerFireResistantPickaxeItem("fusion_pickaxe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<Item> RUBY_PICKAXE = registerPickaxeItem("ruby_pickaxe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Axes -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_AXE = registerAxeItem("red_sapphire_axe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_AXE = registerAxeItem("blue_sapphire_axe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_AXE = registerAxeItem("green_sapphire_axe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<Item> RED_GARNET_AXE = registerAxeItem("red_garnet_axe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_GARNET_AXE = registerAxeItem("blue_garnet_axe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> PINK_GARNET_AXE = registerAxeItem("pink_garnet_axe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> YELLOW_GARNET_AXE = registerAxeItem("yellow_garnet_axe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<Item> FUSION_AXE = registerFireResistantAxeItem("fusion_axe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<Item> RUBY_AXE = registerAxeItem("ruby_axe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Shovels -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_SHOVEL = registerShovelItem("red_sapphire_shovel", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_SHOVEL = registerShovelItem("blue_sapphire_shovel", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_SHOVEL = registerShovelItem("green_sapphire_shovel", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<Item> RED_GARNET_SHOVEL = registerShovelItem("red_garnet_shovel", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_GARNET_SHOVEL = registerShovelItem("blue_garnet_shovel", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> PINK_GARNET_SHOVEL = registerShovelItem("pink_garnet_shovel", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> YELLOW_GARNET_SHOVEL = registerShovelItem("yellow_garnet_shovel", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<Item> FUSION_SHOVEL = registerFireResistantShovelItem("fusion_shovel", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<Item> RUBY_SHOVEL = registerShovelItem("ruby_shovel", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Hoes -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_HOE = registerHoeItem("red_sapphire_hoe", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_HOE = registerHoeItem("blue_sapphire_hoe", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_HOE = registerHoeItem("green_sapphire_hoe", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<Item> RED_GARNET_HOE = registerHoeItem("red_garnet_hoe", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_GARNET_HOE = registerHoeItem("blue_garnet_hoe", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> PINK_GARNET_HOE = registerHoeItem("pink_garnet_hoe", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> YELLOW_GARNET_HOE = registerHoeItem("yellow_garnet_hoe", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<Item> FUSION_HOE = registerFireResistantHoeItem("fusion_hoe", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<Item> RUBY_HOE = registerHoeItem("ruby_hoe", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    // -- Swords -- //
    public static final DeferredItem<Item> RED_SAPPHIRE_SWORD = registerSwordItem("red_sapphire_sword", AdvancedValuables_ToolsTier.RED_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_SAPPHIRE_SWORD = registerSwordItem("blue_sapphire_sword", AdvancedValuables_ToolsTier.BLUE_SAPPHIRE_TOOL_TIER);
    public static final DeferredItem<Item> GREEN_SAPPHIRE_SWORD = registerSwordItem("green_sapphire_sword", AdvancedValuables_ToolsTier.GREEN_SAPPHIRE_TOOL_TIER);

    public static final DeferredItem<Item> RED_GARNET_SWORD = registerSwordItem("red_garnet_sword", AdvancedValuables_ToolsTier.RED_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> BLUE_GARNET_SWORD = registerSwordItem("blue_garnet_sword", AdvancedValuables_ToolsTier.BLUE_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> PINK_GARNET_SWORD = registerSwordItem("pink_garnet_sword", AdvancedValuables_ToolsTier.PINK_GARNET_TOOL_TIER);
    public static final DeferredItem<Item> YELLOW_GARNET_SWORD = registerSwordItem("yellow_garnet_sword", AdvancedValuables_ToolsTier.YELLOW_GARNET_TOOL_TIER);

    public static final DeferredItem<Item> FUSION_SWORD = registerFireResistantSwordItem("fusion_sword", AdvancedValuables_ToolsTier.FUSION_TOOL_TIER);

    public static final DeferredItem<Item> RUBY_SWORD = registerSwordItem("ruby_sword", AdvancedValuables_ToolsTier.RUBY_TOOL_TIER);

    private static DeferredItem<Item> registerPickaxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1, -2.8f))));
    }

    private static DeferredItem<Item> registerAxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, 6, -3.2f))));
    }

    private static DeferredItem<Item> registerShovelItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, 1.5f, -3f))));
    }

    private static DeferredItem<Item> registerHoeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, 0, -3f))));
    }

    private static DeferredItem<Item> registerSwordItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4f))));
    }

    private static DeferredItem<Item> registerFireResistantPickaxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1, -2.8f)).fireResistant()));
    }

    private static DeferredItem<Item> registerFireResistantAxeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, 6, -3.2f)).fireResistant()));
    }

    private static DeferredItem<Item> registerFireResistantShovelItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, 1.5f, -3f)).fireResistant()));
    }

    private static DeferredItem<Item> registerFireResistantHoeItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, 0, -3f)).fireResistant()));
    }

    private static DeferredItem<Item> registerFireResistantSwordItem(String name, Tier tier)
    {
        return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4f)).fireResistant()));
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
