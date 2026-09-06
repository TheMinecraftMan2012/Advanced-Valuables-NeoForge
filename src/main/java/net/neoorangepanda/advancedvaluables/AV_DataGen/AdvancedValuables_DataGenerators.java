package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AdvancedValuables.MOD_ID)
public class AdvancedValuables_DataGenerators
{
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.createProvider(AdvancedValuables_RecipeProvider.Runner::new);
        event.createProvider((_, _) -> new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(AdvancedValuables_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        event.createProvider(AdvancedValuables_BlockTagProvider::new);
        event.createProvider(AdvancedValuables_ItemTagProvider::new);
        event.createProvider(AdvancedValuables_ModelProvider::new);
        event.createProvider(AdvancedValuables_DatapackProvider::new);
        event.createProvider(AdvancedValuables_GlobalLootModifierProvider::new);
        event.createProvider(AdvancedValuables_ParticleDescriptionProvider::new);
        event.createProvider(AdvancedValuables_TrimmedArmorModelProvider::new);
        event.createProvider(AdvancedValuables_VanillaArmorTrimOverrideProvider::new);
        event.createProvider(AdvancedValuables_TrimAtlasOverrideProvider::new);
        event.createProvider(AdvancedValuables_ArmorTrimAtlasOverrideProvider::new);
    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.createProvider(AdvancedValuables_RecipeProvider.Runner::new);
        event.createProvider((_, _) -> new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(AdvancedValuables_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        event.createProvider(AdvancedValuables_BlockTagProvider::new);
        event.createProvider(AdvancedValuables_ItemTagProvider::new);
        event.createProvider(AdvancedValuables_ModelProvider::new);
        event.createProvider(AdvancedValuables_DatapackProvider::new);
        event.createProvider(AdvancedValuables_GlobalLootModifierProvider::new);
        event.createProvider(AdvancedValuables_ParticleDescriptionProvider::new);
        event.createProvider(AdvancedValuables_TrimmedArmorModelProvider::new);
        event.createProvider(AdvancedValuables_VanillaArmorTrimOverrideProvider::new);
        event.createProvider(AdvancedValuables_TrimAtlasOverrideProvider::new);
        event.createProvider(AdvancedValuables_ArmorTrimAtlasOverrideProvider::new);
    }
}
