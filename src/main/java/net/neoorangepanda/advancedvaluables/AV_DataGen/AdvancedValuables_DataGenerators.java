package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
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

        generator.addProvider(true, new AdvancedValuables_RecipeProvider.Runner(output, lookupProvider));
        generator.addProvider(true, new LootTableProvider(output, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(AdvancedValuables_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        BlockTagsProvider blockTagsProvider = new AdvancedValuables_BlockTagProvider(output, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new AdvancedValuables_ItemTagProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_ModelProvider(output));
        generator.addProvider(true, new AdvancedValuables_DatapackProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_GlobalLootModifierProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_ParticleDescriptionProvider(output));
        generator.addProvider(true, new AdvancedValuables_TrimmedArmorModelProvider(output));
        generator.addProvider(true, new AdvancedValuables_VanillaArmorTrimOverrideProvider(output));
        generator.addProvider(true, new AdvancedValuables_TrimAtlasOverrideProvider(output));
        generator.addProvider(true, new AdvancedValuables_ArmorTrimAtlasOverrideProvider(output));
    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new AdvancedValuables_RecipeProvider.Runner(output, lookupProvider));
        generator.addProvider(true, new LootTableProvider(output, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(AdvancedValuables_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        BlockTagsProvider blockTagsProvider = new AdvancedValuables_BlockTagProvider(output, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new AdvancedValuables_ItemTagProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_ModelProvider(output));
        generator.addProvider(true, new AdvancedValuables_DatapackProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_GlobalLootModifierProvider(output, lookupProvider));
        generator.addProvider(true, new AdvancedValuables_TrimmedArmorModelProvider(output));
        generator.addProvider(true, new AdvancedValuables_VanillaArmorTrimOverrideProvider(output));
        generator.addProvider(true, new AdvancedValuables_TrimAtlasOverrideProvider(output));
        generator.addProvider(true, new AdvancedValuables_ArmorTrimAtlasOverrideProvider(output));
    }
}
