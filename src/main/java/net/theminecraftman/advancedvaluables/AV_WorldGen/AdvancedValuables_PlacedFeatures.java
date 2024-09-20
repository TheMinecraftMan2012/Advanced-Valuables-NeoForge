package net.theminecraftman.advancedvaluables.AV_WorldGen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;

public class AdvancedValuables_PlacedFeatures
{
    public static final ResourceKey<PlacedFeature> BLUE_SAPPHIRE_ORE_PLACED_KEY = registerKey("blue_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> RED_SAPPHIRE_ORE_PLACED_KEY = registerKey("red_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> GREEN_SAPPHIRE_ORE_PLACED_KEY = registerKey("green_sapphire_ore_placed");

    public static final ResourceKey<PlacedFeature> RED_GARNET_ORE_PLACED_KEY = registerKey("red_garnet_ore_placed");
    public static final ResourceKey<PlacedFeature> BLUE_GARNET_ORE_PLACED_KEY = registerKey("blue_garnet_ore_placed");
    public static final ResourceKey<PlacedFeature> PINK_GARNET_ORE_PLACED_KEY = registerKey("pink_garnet_ore_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_GARNET_ORE_PLACED_KEY = registerKey("yellow_garnet_ore_placed");

    public static final ResourceKey<PlacedFeature> FUSION_ORE_PLACED_KEY = registerKey("fusion_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BLUE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_BLUE_SAPPHIRE_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, RED_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_RED_SAPPHIRE_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, GREEN_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_GREEN_SAPPHIRE_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, RED_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_RED_GARNET_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, BLUE_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_BLUE_GARNET_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, PINK_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_PINK_GARNET_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, YELLOW_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_YELLOW_GARNET_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, FUSION_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_FUSION_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY), AdvancedValuables_OrePlacement.commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
