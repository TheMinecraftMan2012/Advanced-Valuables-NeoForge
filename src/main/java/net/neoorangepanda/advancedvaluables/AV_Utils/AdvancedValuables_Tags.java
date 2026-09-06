package net.neoorangepanda.advancedvaluables.AV_Utils;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public class AdvancedValuables_Tags
{
    public static class Blocks
    {
        public static final TagKey<@NotNull Block> INCORRECT_FOR_ALL_SAPPHIRE_TOOL = createTag("incorrect_for_all_sapphire_tool");
        public static final TagKey<@NotNull Block> NEEDS_ALL_SAPPHIRE_TOOL = createTag("needs_all_sapphire_tool");

        public static final TagKey<@NotNull Block> INCORRECT_FOR_ALL_GARNET_TOOL = createTag("incorrect_for_all_garnet_tool");
        public static final TagKey<@NotNull Block> NEEDS_ALL_GARNET_TOOL = createTag("needs_all_garnet_tool");

        public static final TagKey<@NotNull Block> INCORRECT_FOR_FUSION_TOOL = createTag("incorrect_for_fusion_tool");
        public static final TagKey<@NotNull Block> NEEDS_FUSION_TOOL = createTag("needs_fusion_tool");

        public static final TagKey<@NotNull Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<@NotNull Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");

        public static final TagKey<@NotNull Block> INCORRECT_FOR_SPARKITE_TOOL = createTag("incorrect_for_sparkite_tool");
        public static final TagKey<@NotNull Block> NEEDS_SPARKITE_TOOL = createTag("needs_sparkite_tool");

        public static final TagKey<@NotNull Block> AV_CRAFTERS = createTag("av_crafters");

        private static TagKey<@NotNull Block> createTag(String name)
        {
            return BlockTags.create(Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<@NotNull Item> VALUABLE_ITEMS = createTag("valuable_items");
        public static final TagKey<@NotNull Item> SMELT_ITEMS = createTag("smelt_items");
        public static final TagKey<@NotNull Item> RAW_ITEMS = createTag("raw_items");
        public static final TagKey<@NotNull Item> ELEMENTAL_ITEMS = createTag("elemental_items");

        public static final TagKey<@NotNull Item> RED_SAPPHIRE_REPAIR = createTag("red_sapphire_repair");
        public static final TagKey<@NotNull Item> BLUE_SAPPHIRE_REPAIR = createTag("blue_sapphire_repair");
        public static final TagKey<@NotNull Item> GREEN_SAPPHIRE_REPAIR = createTag("green_sapphire_repair");

        public static final TagKey<@NotNull Item> RED_GARNET_REPAIR = createTag("red_garnet_repair");
        public static final TagKey<@NotNull Item> BLUE_GARNET_REPAIR = createTag("blue_garnet_repair");
        public static final TagKey<@NotNull Item> PINK_GARNET_REPAIR = createTag("pink_garnet_repair");
        public static final TagKey<@NotNull Item> YELLOW_GARNET_REPAIR = createTag("yellow_garnet_repair");

        public static final TagKey<@NotNull Item> FUSION_REPAIR = createTag("fusion_repair");
        public static final TagKey<@NotNull Item> RUBY_REPAIR = createTag("ruby_repair");

        public static final TagKey<@NotNull Item> SPARKITE_REPAIR = createTag("sparkite_repair");

        public static final TagKey<@NotNull Item> AV_PICKAXES = createTag("av_pickaxes");
        public static final TagKey<@NotNull Item> AV_AXES = createTag("av_axes");
        public static final TagKey<@NotNull Item> AV_SHOVELS = createTag("av_shovels");
        public static final TagKey<@NotNull Item> AV_HOES = createTag("av_hoes");
        public static final TagKey<@NotNull Item> AV_SWORDS = createTag("av_swords");
        public static final TagKey<@NotNull Item> AV_SPEARS = createTag("av_spears");
        public static final TagKey<@NotNull Item> AV_ELEMENTAL_WEAPONS = createTag("av_elemental_weapons");

        public static final TagKey<@NotNull Item> AV_HELMETS = createTag("av_helmets");
        public static final TagKey<@NotNull Item> AV_CHESTPLATES = createTag("av_chestplates");
        public static final TagKey<@NotNull Item> AV_LEGGINGS = createTag("av_leggings");
        public static final TagKey<@NotNull Item> AV_BOOTS = createTag("av_boots");

        public static final TagKey<@NotNull Item> AV_SAPPHIRE_POWDERS = createTag("av_sapphire_powders");
        public static final TagKey<@NotNull Item> AV_GARNET_POWDERS = createTag("av_garnet_powders");

        private static TagKey<@NotNull Item> createTag(String name)
        {
            return ItemTags.create(Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name));
        }
    }
}
