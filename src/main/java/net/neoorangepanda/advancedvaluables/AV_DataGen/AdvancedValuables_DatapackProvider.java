package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoorangepanda.advancedvaluables.AV_Enchantments.AdvancedValuables_EnchantmentBootstrap;
import net.neoorangepanda.advancedvaluables.AV_Trims.AdvancedValuables_TrimMaterial;
import net.neoorangepanda.advancedvaluables.AV_WorldGen.AdvancedValuables_BiomeModifiers;
import net.neoorangepanda.advancedvaluables.AV_WorldGen.AdvancedValuables_ConfiguredFeatures;
import net.neoorangepanda.advancedvaluables.AV_WorldGen.AdvancedValuables_PlacedFeatures;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_DatapackProvider extends DatapackBuiltinEntriesProvider
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.TRIM_MATERIAL, AdvancedValuables_TrimMaterial::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, AdvancedValuables_ConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, AdvancedValuables_PlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, AdvancedValuables_BiomeModifiers::bootstrap)
            .add(Registries.ENCHANTMENT, AdvancedValuables_EnchantmentBootstrap::bootstrap);

    public AdvancedValuables_DatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, BUILDER, Set.of(AdvancedValuables.MOD_ID));
    }
}
