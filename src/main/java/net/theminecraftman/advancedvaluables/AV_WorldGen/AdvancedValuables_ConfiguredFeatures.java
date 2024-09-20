package net.theminecraftman.advancedvaluables.AV_WorldGen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;

public class AdvancedValuables_ConfiguredFeatures
{
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUE_SAPPHIRE_ORE_KEY = registerKey("blue_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_SAPPHIRE_ORE_KEY = registerKey("red_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREEN_SAPPHIRE_ORE_KEY = registerKey("green_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_GARNET_ORE_KEY = registerKey("red_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUE_GARNET_ORE_KEY = registerKey("blue_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PINK_GARNET_ORE_KEY = registerKey("pink_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_YELLOW_GARNET_ORE_KEY = registerKey("yellow_garnet_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FUSION_ORE_KEY = registerKey("fusion_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");

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

        List<OreConfiguration.TargetBlockState> overworld_fusion_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.FUSION_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworld_ruby_ores = List.of(
                OreConfiguration.target(stoneReplaceable, AdvancedValuables_BlockClass.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_BLUE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_blue_sapphire_ores, 9));
        register(context, OVERWORLD_RED_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_red_sapphire_ores, 9));
        register(context, OVERWORLD_GREEN_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_green_sapphire_ores, 9));

        register(context, OVERWORLD_RED_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_red_garnet_ores, 9));
        register(context, OVERWORLD_BLUE_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_blue_garnet_ores, 9));
        register(context, OVERWORLD_PINK_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_pink_garnet_ores, 9));
        register(context, OVERWORLD_YELLOW_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_yellow_garnet_ores, 9));

        register(context, OVERWORLD_FUSION_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_fusion_ores, 9));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_ruby_ores, 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
