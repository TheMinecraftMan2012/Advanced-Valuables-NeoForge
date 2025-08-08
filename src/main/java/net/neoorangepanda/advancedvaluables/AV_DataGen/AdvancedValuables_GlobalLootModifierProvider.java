package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoorangepanda.advancedvaluables.AV_GlobalLootModifier.AdvancedValuables_AddItemModifier;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_GlobalLootModifierProvider extends GlobalLootModifierProvider
{
    public  AdvancedValuables_GlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, AdvancedValuables.MOD_ID);
    }

    @Override
    protected void start()
    {
        addLootModifier("red_sapphire_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.RED_SAPPHIRE);
        addLootModifier("red_sapphire_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.RED_SAPPHIRE);

        addLootModifier("blue_sapphire_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);
        addLootModifier("blue_sapphire_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.BLUE_SAPPHIRE);

        addLootModifier("green_sapphire_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);
        addLootModifier("green_sapphire_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.GREEN_SAPPHIRE);

        addLootModifier("red_garnet_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.RED_GARNET);
        addLootModifier("red_garnet_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.RED_GARNET);

        addLootModifier("blue_garnet_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.BLUE_GARNET);
        addLootModifier("blue_garnet_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.BLUE_GARNET);

        addLootModifier("pink_garnet_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.PINK_GARNET);
        addLootModifier("pink_garnet_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.PINK_GARNET);

        addLootModifier("yellow_garnet_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.YELLOW_GARNET);
        addLootModifier("yellow_garnet_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.YELLOW_GARNET);

        addLootModifier("ruby_from_abandoned_mineshaft", "chests/abandoned_mineshaft", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_ancient_city", "chests/ancient_city", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_ancient_city_ice_box", "chests/ancient_city_ice_box", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_buried_treasure", "chests/buried_treasure", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_desert_pyramid", "chests/desert_pyramid", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_jungle_temple", "chests/jungle_temple", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_pillager_outpost", "chests/pillager_outpost", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_underwater_ruin_big", "chests/underwater_ruin_big", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_underwater_ruin_small", "chests/underwater_ruin_small", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_woodland_mansion", "chests/woodland_mansion", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_shipwreck_map", "chests/shipwreck_map", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_shipwreck_supply", "chests/shipwreck_supply", AdvancedValuables_ItemClass.RUBY);
        addLootModifier("ruby_from_shipwreck_treasure", "chests/shipwreck_treasure", AdvancedValuables_ItemClass.RUBY);
    }

    private void addLootModifier(String modifier, String location, DeferredItem<Item> item)
    {
        add(modifier, new AdvancedValuables_AddItemModifier(new LootItemCondition[]{
               new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace(location)).build()
        }, item.get()));
    }
}
