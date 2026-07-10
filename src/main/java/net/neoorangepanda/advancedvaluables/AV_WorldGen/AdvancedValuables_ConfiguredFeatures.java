package net.neoorangepanda.advancedvaluables.AV_WorldGen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.List;

public class AdvancedValuables_ConfiguredFeatures
{
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_RED_SAPPHIRE_ORE = registerKey("upper_red_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_RED_SAPPHIRE_ORE = registerKey("medium_red_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_RED_SAPPHIRE_ORE = registerKey("lower_red_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_BLUE_SAPPHIRE_ORE = registerKey("upper_blue_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_BLUE_SAPPHIRE_ORE = registerKey("medium_blue_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_BLUE_SAPPHIRE_ORE = registerKey("lower_blue_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_GREEN_SAPPHIRE_ORE = registerKey("upper_green_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_GREEN_SAPPHIRE_ORE = registerKey("medium_green_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_GREEN_SAPPHIRE_ORE = registerKey("lower_green_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_RED_GARNET_ORE = registerKey("upper_red_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_RED_GARNET_ORE = registerKey("medium_red_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_RED_GARNET_ORE = registerKey("lower_red_garnet_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_BLUE_GARNET_ORE = registerKey("upper_blue_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_BLUE_GARNET_ORE = registerKey("medium_blue_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_BLUE_GARNET_ORE = registerKey("lower_blue_garnet_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_PINK_GARNET_ORE = registerKey("upper_pink_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_PINK_GARNET_ORE = registerKey("medium_pink_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_PINK_GARNET_ORE = registerKey("lower_pink_garnet_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_YELLOW_GARNET_ORE = registerKey("upper_yellow_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_YELLOW_GARNET_ORE = registerKey("medium_yellow_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_YELLOW_GARNET_ORE = registerKey("lower_yellow_garnet_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> UPPER_RUBY_ORE = registerKey("upper_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_RUBY_ORE = registerKey("medium_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOWER_RUBY_ORE = registerKey("lower_ruby_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworld_blue_sapphire_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_red_sapphire_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_green_sapphire_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworld_red_garnet_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.RED_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_blue_garnet_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_pink_garnet_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.PINK_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_yellow_garnet_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworld_ruby_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );

        register(context, LOWER_BLUE_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_blue_sapphire_ores, 4));
        register(context, MEDIUM_BLUE_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_blue_sapphire_ores, 4));
        register(context, UPPER_BLUE_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_blue_sapphire_ores, 4));

        register(context, LOWER_RED_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_red_sapphire_ores, 4));
        register(context, MEDIUM_RED_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_red_sapphire_ores, 4));
        register(context, UPPER_RED_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_red_sapphire_ores, 4));

        register(context, LOWER_GREEN_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_green_sapphire_ores, 4));
        register(context, MEDIUM_GREEN_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_green_sapphire_ores, 4));
        register(context, UPPER_GREEN_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(overworld_green_sapphire_ores, 4));

        register(context, LOWER_RED_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_red_garnet_ores, 4));
        register(context, MEDIUM_RED_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_red_garnet_ores, 4));
        register(context, UPPER_RED_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_red_garnet_ores, 4));

        register(context, LOWER_BLUE_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_blue_garnet_ores, 4));
        register(context, MEDIUM_BLUE_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_blue_garnet_ores, 4));
        register(context, UPPER_BLUE_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_blue_garnet_ores, 4));

        register(context, LOWER_PINK_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_pink_garnet_ores, 4));
        register(context, MEDIUM_PINK_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_pink_garnet_ores, 4));
        register(context, UPPER_PINK_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_pink_garnet_ores, 4));

        register(context, LOWER_YELLOW_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_yellow_garnet_ores, 4));
        register(context, MEDIUM_YELLOW_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_yellow_garnet_ores, 4));
        register(context, UPPER_YELLOW_GARNET_ORE, Feature.ORE, new OreConfiguration(overworld_yellow_garnet_ores, 4));

        register(context, LOWER_RUBY_ORE, Feature.ORE, new OreConfiguration(overworld_ruby_ores, 4));
        register(context, MEDIUM_RUBY_ORE, Feature.ORE, new OreConfiguration(overworld_ruby_ores, 4));
        register(context, UPPER_RUBY_ORE, Feature.ORE, new OreConfiguration(overworld_ruby_ores, 4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
