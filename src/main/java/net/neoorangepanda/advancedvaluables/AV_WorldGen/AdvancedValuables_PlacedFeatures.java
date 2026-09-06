package net.neoorangepanda.advancedvaluables.AV_WorldGen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdvancedValuables_PlacedFeatures
{
    public static final ResourceKey<@NotNull PlacedFeature> UPPER_RED_SAPPHIRE_ORE = registerKey("upper_red_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_RED_SAPPHIRE_ORE = registerKey("medium_red_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_RED_SAPPHIRE_ORE = registerKey("lower_red_sapphire_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_BLUE_SAPPHIRE_ORE = registerKey("upper_blue_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_BLUE_SAPPHIRE_ORE = registerKey("medium_blue_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_BLUE_SAPPHIRE_ORE = registerKey("lower_blue_sapphire_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_GREEN_SAPPHIRE_ORE = registerKey("upper_green_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_GREEN_SAPPHIRE_ORE = registerKey("medium_green_sapphire_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_GREEN_SAPPHIRE_ORE = registerKey("lower_green_sapphire_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_RED_GARNET_ORE = registerKey("upper_red_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_RED_GARNET_ORE = registerKey("medium_red_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_RED_GARNET_ORE = registerKey("lower_red_garnet_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_BLUE_GARNET_ORE = registerKey("upper_blue_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_BLUE_GARNET_ORE = registerKey("medium_blue_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_BLUE_GARNET_ORE = registerKey("lower_blue_garnet_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_PINK_GARNET_ORE = registerKey("upper_pink_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_PINK_GARNET_ORE = registerKey("medium_pink_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_PINK_GARNET_ORE = registerKey("lower_pink_garnet_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_YELLOW_GARNET_ORE = registerKey("upper_yellow_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_YELLOW_GARNET_ORE = registerKey("medium_yellow_garnet_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_YELLOW_GARNET_ORE = registerKey("lower_yellow_garnet_ore");

    public static final ResourceKey<@NotNull PlacedFeature> UPPER_RUBY_ORE = registerKey("upper_ruby_ore");
    public static final ResourceKey<@NotNull PlacedFeature> MEDIUM_RUBY_ORE = registerKey("medium_ruby_ore");
    public static final ResourceKey<@NotNull PlacedFeature> LOWER_RUBY_ORE = registerKey("lower_ruby_ore");

    public static void bootstrap(BootstrapContext<@NotNull PlacedFeature> context)
    {
        HolderGetter<@NotNull ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LOWER_BLUE_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_BLUE_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_BLUE_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_BLUE_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_BLUE_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_BLUE_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_RED_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_RED_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_RED_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_RED_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_RED_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_RED_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_GREEN_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_GREEN_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_GREEN_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_GREEN_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_GREEN_SAPPHIRE_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_GREEN_SAPPHIRE_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_RED_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_RED_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_RED_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_RED_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_RED_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_RED_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_BLUE_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_BLUE_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_BLUE_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_BLUE_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_BLUE_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_BLUE_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_PINK_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_PINK_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_PINK_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_PINK_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_PINK_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_PINK_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_YELLOW_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_YELLOW_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_YELLOW_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_YELLOW_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_YELLOW_GARNET_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_YELLOW_GARNET_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));

        register(context, LOWER_RUBY_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.LOWER_RUBY_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(-15))));
        register(context, MEDIUM_RUBY_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.MEDIUM_RUBY_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(23))));
        register(context, UPPER_RUBY_ORE, configuredFeatures.getOrThrow(AdvancedValuables_ConfiguredFeatures.UPPER_RUBY_ORE), AdvancedValuables_OrePlacement.commonOrePlacement(1,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(23), VerticalAnchor.absolute(60))));
    }

    private static ResourceKey<@NotNull PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
    }

    private static void register(BootstrapContext<@NotNull PlacedFeature> context, ResourceKey<@NotNull PlacedFeature> key, Holder<@NotNull ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
