package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_ItemTagProvider extends ItemTagsProvider
{

    public AdvancedValuables_ItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                             CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, AdvancedValuables.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(AdvancedValuables_Tags.Items.VALUABLE_ITEMS)
                .add(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_GARNET.get())
                .add(AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .add(AdvancedValuables_ItemClass.PINK_GARNET.get())
                .add(AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .add(AdvancedValuables_ItemClass.FUSION_GEM.get())
                .add(AdvancedValuables_ItemClass.RUBY.get())
                .add(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get())
                .add(AdvancedValuables_ItemClass.RED_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get())
                .add(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get())
                .add(AdvancedValuables_ItemClass.RAW_RUBY.get());
    }
}
