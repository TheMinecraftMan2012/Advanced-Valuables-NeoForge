package net.neoorangepanda.advancedvaluables.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

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

        public static final TagKey<Item> RED_SAPPHIRE_REPAIR = createTag("red_sapphire_repair");
        public static final TagKey<Item> BLUE_SAPPHIRE_REPAIR = createTag("blue_sapphire_repair");
        public static final TagKey<Item> GREEN_SAPPHIRE_REPAIR = createTag("green_sapphire_repair");

        public static final TagKey<Item> RED_GARNET_REPAIR = createTag("red_garnet_repair");
        public static final TagKey<Item> BLUE_GARNET_REPAIR = createTag("blue_garnet_repair");
        public static final TagKey<Item> PINK_GARNET_REPAIR = createTag("pink_garnet_repair");
        public static final TagKey<Item> YELLOW_GARNET_REPAIR = createTag("yellow_garnet_repair");

        public static final TagKey<Item> FUSION_REPAIR = createTag("fusion_repair");
        public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");

        public static final TagKey<Item> AV_PICKAXES = createTag("av_pickaxes");
        public static final TagKey<Item> AV_AXES = createTag("av_axes");
        public static final TagKey<Item> AV_SHOVELS = createTag("av_shovels");
        public static final TagKey<Item> AV_HOES = createTag("av_hoes");
        public static final TagKey<Item> AV_SWORDS = createTag("av_swords");

        public static final TagKey<Item> AV_SAPPHIRE_POWDERS = createTag("av_sapphire_powders");
        public static final TagKey<Item> AV_GARNET_POWDERS = createTag("av_garnet_powders");

        private static TagKey<Item> createTag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
        }
    }
}
