package net.theminecraftman.advancedvaluables.AV_ToolsComponents.ToolsTier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.util.AdvancedValuables_Tags;

public class AdvancedValuables_ToolsTier
{
    public static final Tier RED_SAPPHIRE_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_SAPPHIRE.get()));
    public static final Tier BLUE_SAPPHIRE_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get()));
    public static final Tier GREEN_SAPPHIRE_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_SAPPHIRE_TOOL, 1900, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get()));

    public static final Tier RED_GARNET_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.RED_GARNET.get()));
    public static final Tier BLUE_GARNET_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.BLUE_GARNET.get()));
    public static final Tier PINK_GARNET_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.PINK_GARNET.get()));
    public static final Tier YELLOW_GARNET_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_ALL_GARNET_TOOL, 1950, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.YELLOW_GARNET.get()));

    public static final Tier FUSION_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_FUSION_TOOL, 2500, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.FUSION_GEM.get()));
    public static final Tier RUBY_TOOL_TIER = new SimpleTier(AdvancedValuables_Tags.Blocks.INCORRECT_FOR_RUBY_TOOL, 2000, 7f, 1.5f, 22, () -> Ingredient.of(AdvancedValuables_ItemClass.RUBY.get()));
}
