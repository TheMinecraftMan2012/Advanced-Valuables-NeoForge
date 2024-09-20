package net.theminecraftman.advancedvaluables.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_Tags
{
    public static class Blocks
    {
        public static final TagKey<Block> INCORRECT_FOR_ALL_SAPPHIRE_TOOL = createTag("incorrect_for_all_sapphire_tool");
        public static final TagKey<Block> NEEDS_ALL_SAPPHIRE_TOOL = createTag("needs_all_sapphire_tool");

        public static final TagKey<Block> INCORRECT_FOR_ALL_GARNET_TOOL = createTag("incorrect_for_all_garnet_tool");
        public static final TagKey<Block> NEEDS_ALL_GARNET_TOOL = createTag("needs_all_garnet_tool");

        public static final TagKey<Block> INCORRECT_FOR_FUSION_TOOL = createTag("incorrect_for_fusion_tool");
        public static final TagKey<Block> NEEDS_FUSION_TOOL = createTag("needs_fusion_tool");

        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");

        private static TagKey<Block> createTag(String name)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> VALUABLE_ITEMS = createTag("valuable_items");

        private static TagKey<Item> createTag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
        }
    }
}
