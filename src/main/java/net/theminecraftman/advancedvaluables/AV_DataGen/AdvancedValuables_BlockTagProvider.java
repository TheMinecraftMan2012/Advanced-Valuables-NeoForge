package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_BlockTagProvider extends BlockTagsProvider
{

    public AdvancedValuables_BlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, AdvancedValuables.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.FUSION_ORE.get())
                .add(AdvancedValuables_BlockClass.RUBY_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.RUBY_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .add(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())
                .add(AdvancedValuables_BlockClass.FUSION_ORE.get())
                .add(AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE.get());

        this.tag(AdvancedValuables_Tags.Blocks.NEEDS_ALL_SAPPHIRE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.NEEDS_FUSION_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(AdvancedValuables_Tags.Blocks.NEEDS_ALL_SAPPHIRE_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(AdvancedValuables_Tags.Blocks.NEEDS_ALL_GARNET_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_FUSION_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(AdvancedValuables_Tags.Blocks.NEEDS_FUSION_TOOL);

        this.tag(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(AdvancedValuables_Tags.Blocks.NEEDS_RUBY_TOOL);

        this.tag(BlockTags.FENCES)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE.get())
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_FENCE.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_FENCE.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE.get())
                .add(AdvancedValuables_BlockClass.FUSION_FENCE.get())
                .add(AdvancedValuables_BlockClass.RUBY_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.FUSION_FENCE_GATE.get())
                .add(AdvancedValuables_BlockClass.RUBY_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL.get())
                .add(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL.get())
                .add(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL.get())
                .add(AdvancedValuables_BlockClass.RED_GARNET_WALL.get())
                .add(AdvancedValuables_BlockClass.BLUE_GARNET_WALL.get())
                .add(AdvancedValuables_BlockClass.PINK_GARNET_WALL.get())
                .add(AdvancedValuables_BlockClass.YELLOW_GARNET_WALL.get())
                .add(AdvancedValuables_BlockClass.FUSION_WALL.get())
                .add(AdvancedValuables_BlockClass.RUBY_WALL.get());
    }
}
