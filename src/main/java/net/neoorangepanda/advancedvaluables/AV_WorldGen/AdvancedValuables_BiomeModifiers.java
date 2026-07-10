package net.neoorangepanda.advancedvaluables.AV_WorldGen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_BiomeModifiers
{
    public static final ResourceKey<BiomeModifier> ADD_UPPER_RED_SAPPHIRE_ORE = registerKey("add_upper_red_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_RED_SAPPHIRE_ORE = registerKey("add_medium_red_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_RED_SAPPHIRE_ORE = registerKey("add_lower_red_sapphire_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_BLUE_SAPPHIRE_ORE = registerKey("add_upper_blue_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_BLUE_SAPPHIRE_ORE = registerKey("add_medium_blue_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_BLUE_SAPPHIRE_ORE = registerKey("add_lower_blue_sapphire_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_GREEN_SAPPHIRE_ORE = registerKey("add_upper_green_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_GREEN_SAPPHIRE_ORE = registerKey("add_medium_green_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_GREEN_SAPPHIRE_ORE = registerKey("add_lower_green_sapphire_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_RED_GARNET_ORE = registerKey("add_upper_red_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_RED_GARNET_ORE = registerKey("add_medium_red_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_RED_GARNET_ORE = registerKey("add_lower_red_garnet_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_BLUE_GARNET_ORE = registerKey("add_upper_blue_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_BLUE_GARNET_ORE = registerKey("add_medium_blue_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_BLUE_GARNET_ORE = registerKey("add_lower_blue_garnet_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_PINK_GARNET_ORE = registerKey("add_upper_pink_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_PINK_GARNET_ORE = registerKey("add_medium_pink_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_PINK_GARNET_ORE = registerKey("add_lower_pink_garnet_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_YELLOW_GARNET_ORE = registerKey("add_upper_yellow_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_YELLOW_GARNET_ORE = registerKey("add_medium_yellow_garnet_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_YELLOW_GARNET_ORE = registerKey("add_lower_yellow_garnet_ore");

    public static final ResourceKey<BiomeModifier> ADD_UPPER_RUBY_ORE = registerKey("add_upper_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_MEDIUM_RUBY_ORE = registerKey("add_medium_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_LOWER_RUBY_ORE = registerKey("add_lower_ruby_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_LOWER_BLUE_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_BLUE_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_BLUE_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_BLUE_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_BLUE_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_BLUE_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_RED_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_RED_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_RED_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_RED_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_RED_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_RED_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_GREEN_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_GREEN_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_GREEN_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_GREEN_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_GREEN_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_GREEN_SAPPHIRE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_RED_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_RED_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_RED_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_RED_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_RED_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_RED_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_BLUE_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_BLUE_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_BLUE_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_BLUE_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_BLUE_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_BLUE_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_PINK_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_PINK_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_PINK_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_PINK_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_PINK_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_PINK_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_YELLOW_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_YELLOW_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_YELLOW_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_YELLOW_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_YELLOW_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_YELLOW_GARNET_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_LOWER_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.LOWER_RUBY_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_MEDIUM_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.MEDIUM_RUBY_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_UPPER_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(AdvancedValuables_PlacedFeatures.UPPER_RUBY_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name)
    {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
    }
}
