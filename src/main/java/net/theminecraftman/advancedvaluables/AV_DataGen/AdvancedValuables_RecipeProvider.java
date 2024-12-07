package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theminecraftman.advancedvaluables.AV_Libraries.Hammer.HammerItem;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Registries.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_RecipeProvider extends RecipeProvider implements IConditionBuilder
{
    protected AdvancedValuables_RecipeProvider(HolderLookup.Provider provider, RecipeOutput output)
    {
        super(provider, output);
    }

    public static class Runner extends RecipeProvider.Runner
    {
        protected Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider)
        {
            super(packOutput, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput)
        {
            return new AdvancedValuables_RecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName()
        {
            return "My Recipes";
        }
    }

    @Override
    protected void buildRecipes()
    {
        // -- Raw Items - Solid Items -- //
        List<ItemLike> BLUE_SAPPHIRE_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_BLUE_SAPPHIRE_ORE
        );
        List<ItemLike> RED_SAPPHIRE_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_RED_SAPPHIRE_ORE
        );
        List<ItemLike> GREEN_SAPPHIRE_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_GREEN_SAPPHIRE_ORE
        );
        List<ItemLike> RED_GARNET_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.RED_RAW_GARNET,
                AdvancedValuables_BlockClass.RED_GARNET_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_RED_GARNET_ORE
        );
        List<ItemLike> BLUE_GARNET_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.BLUE_RAW_GARNET,
                AdvancedValuables_BlockClass.BLUE_GARNET_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_BLUE_GARNET_ORE
        );
        List<ItemLike> PINK_GARNET_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.PINK_RAW_GARNET,
                AdvancedValuables_BlockClass.PINK_GARNET_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_PINK_GARNET_ORE
        );
        List<ItemLike> YELLOW_GARNET_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.YELLOW_RAW_GARNET,
                AdvancedValuables_BlockClass.YELLOW_GARNET_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_YELLOW_GARNET_ORE
        );

        List<ItemLike> FUSION_GEM_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.RAW_FUSION_GEM,
                AdvancedValuables_BlockClass.FUSION_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_FUSION_ORE
        );
        List<ItemLike> RUBY_SMELTING_ITEMS = List.of(
                AdvancedValuables_ItemClass.RAW_RUBY,
                AdvancedValuables_BlockClass.RUBY_ORE,
                AdvancedValuables_BlockClass.DEEPSLATE_RUBY_ORE
        );

        // -- Raw Blocks - Solid Blocks -- //
        List<ItemLike> BLUE_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK);
        List<ItemLike> RED_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK);
        List<ItemLike> GREEN_SAPPHIRE_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK);
        List<ItemLike> RED_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK);
        List<ItemLike> BLUE_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK);
        List<ItemLike> PINK_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK);
        List<ItemLike> YELLOW_GARNET_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK);
        List<ItemLike> FUSION_GEM_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK);
        List<ItemLike> RUBY_SMELTING_BLOCKS = List.of(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK);

        // Add-ons
        List<ItemLike> IRON_SMELTING_BLOCK = List.of(Blocks.RAW_IRON_BLOCK);
        List<ItemLike> GOLD_SMELTING_BLOCK = List.of(Blocks.RAW_GOLD_BLOCK);
        List<ItemLike> COPPER_SMELTING_BLOCK = List.of(Blocks.RAW_COPPER_BLOCK);

        // -- Crafting Recipe -- // -- Shaped Recipe -- //
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.FUSION_BLOCK, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RUBY_BLOCK, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, "has_blue_raw_sapphire");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, "has_red_raw_sapphire");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, "has_green_raw_sapphire");

        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_RAW_GARNET, "has_red_raw_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, "has_blue_raw_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_RAW_GARNET, "has_pink_raw_garnet");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, "has_yellow_raw_garnet");

        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RAW_FUSION_BLOCK, AdvancedValuables_ItemClass.RAW_FUSION_GEM, "has_raw_fusion_gem");
        generateBlockRecipe(this.output, AdvancedValuables_BlockClass.RAW_RUBY_BLOCK, AdvancedValuables_ItemClass.RAW_RUBY, "has_raw_ruby");

        // -- Crafting Recipe -- // -- Shaped Recipe -- // -- Tools and Armor -- //
        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_PICKAXE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_AXE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_SHOVEL, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_HOE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_SWORD, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_AXE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_HOE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_SWORD, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_AXE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_HOE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_SWORD, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_AXE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_HOE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.FUSION_PICKAXE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.FUSION_AXE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.FUSION_SHOVEL, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.FUSION_HOE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.FUSION_SWORD, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");

        generatePickaxeRecipe(this.output, AdvancedValuables_ItemClass.RUBY_PICKAXE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateAxeRecipe(this.output, AdvancedValuables_ItemClass.RUBY_AXE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateShovelRecipe(this.output, AdvancedValuables_ItemClass.RUBY_SHOVEL, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateHoeRecipe(this.output, AdvancedValuables_ItemClass.RUBY_HOE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateSwordRecipe(this.output, AdvancedValuables_ItemClass.RUBY_SWORD, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        // -- Armors -- //
        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.RED_GARNET_HELMET,
                AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.RED_GARNET_BOOTS, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.BLUE_GARNET_HELMET,
                AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.PINK_GARNET_HELMET,
                AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.PINK_GARNET_BOOTS, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET,
                AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.FUSION_HELMET,
                AdvancedValuables_ItemClass.FUSION_CHESTPLATE,
                AdvancedValuables_ItemClass.FUSION_LEGGINGS,
                AdvancedValuables_ItemClass.FUSION_BOOTS, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");

        generateArmorRecipe(this.output,
                AdvancedValuables_ItemClass.RUBY_HELMET,
                AdvancedValuables_ItemClass.RUBY_CHESTPLATE,
                AdvancedValuables_ItemClass.RUBY_LEGGINGS,
                AdvancedValuables_ItemClass.RUBY_BOOTS, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        // -- Crafting Recipe -- // -- Shaped Recipe -- // -- Apple Recipe -- //
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE_APPLE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "red_sapphire");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_APPLE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "blue_sapphire");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_APPLE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "green_sapphire");

        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET_APPLE, AdvancedValuables_ItemClass.RED_GARNET, "red_garnet");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET_APPLE, AdvancedValuables_ItemClass.BLUE_GARNET, "blue_garnet");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET_APPLE, AdvancedValuables_ItemClass.PINK_GARNET, "pink_garnet");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET_APPLE, AdvancedValuables_ItemClass.YELLOW_GARNET, "yellow_garnet");

        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.FUSION_APPLE, AdvancedValuables_ItemClass.FUSION_GEM, "fusion_gem");
        generateAppleRecipe(this.output, AdvancedValuables_ItemClass.RUBY_APPLE, AdvancedValuables_ItemClass.RUBY, "ruby");

        // -- Crafting Recipe -- // -- Shapeless Recipe -- //
        // -- Red Sapphire -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_red_sapphire_block", has(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_red_raw_sapphire_block", has(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())).save(this.output);

        // -- Blue Sapphire -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_blue_sapphire_block", has(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_blue_raw_sapphire_block", has(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())).save(this.output);

        // -- Green Sapphire -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_green_sapphire_block", has(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_green_raw_sapphire_block", has(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())).save(this.output);

        // -- Red Garnet -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .unlockedBy("has_red_garnet_block", has(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_red_raw_garnet_block", has(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())).save(this.output);

        // -- Blue Garnet -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .unlockedBy("has_blue_garnet_block", has(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_blue_raw_garnet_block", has(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())).save(this.output);

        // -- Yellow Garnet -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .unlockedBy("has_yellow_garnet_block", has(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_yellow_raw_garnet_block", has(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())).save(this.output);

        // -- Pink Garnet -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .unlockedBy("has_pink_garnet_block", has(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_pink_raw_garnet_block", has(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())).save(this.output);

        // -- Fusion Gem -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 9)
                .requires(AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .unlockedBy("has_fusion_block", has(AdvancedValuables_BlockClass.FUSION_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_FUSION_GEM.get(), 9)
                .requires(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())
                .unlockedBy("has_raw_fusion_block", has(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())).save(this.output);

        // -- Ruby -- //
        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 9)
                .requires(AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", has(AdvancedValuables_BlockClass.RUBY_BLOCK.get())).save(this.output);

        shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_RUBY.get(), 9)
                .requires(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())
                .unlockedBy("has_raw_ruby_block", has(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())).save(this.output);

        // -- Smelting (Raw Items - Solid Items) -- //
        oreSmelting(this.output, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 0.25f, 200, "blue_sapphire");
        oreSmelting(this.output, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 0.25f, 200, "red_sapphire");
        oreSmelting(this.output, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 0.25f, 200, "green_sapphire");
        oreSmelting(this.output, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 0.25f, 200, "red_garnet");
        oreSmelting(this.output, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 0.25f, 200, "blue_garnet");
        oreSmelting(this.output, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 0.25f, 200, "pink_garnet");
        oreSmelting(this.output, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 0.25f, 200, "yellow_garnet");
        oreSmelting(this.output, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 0.25f, 200, "fusion_gem");
        oreSmelting(this.output, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 0.25f, 200, "ruby");

        // -- Blasting (Raw Items - Solid Items) -- //
        oreBlasting(this.output, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 0.25f, 100, "blue_sapphire");
        oreBlasting(this.output, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 0.25f, 100, "red_sapphire");
        oreBlasting(this.output, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 0.25f, 100, "green_sapphire");
        oreBlasting(this.output, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 0.25f, 100, "red_garnet");
        oreBlasting(this.output, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 0.25f, 100, "blue_garnet");
        oreBlasting(this.output, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 0.25f, 100, "pink_garnet");
        oreBlasting(this.output, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 0.25f, 200, "yellow_garnet");
        oreBlasting(this.output, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 0.25f, 100, "fusion_gem");
        oreBlasting(this.output, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 0.25f, 100, "ruby");

        // -- Smelting (Raw Blocks - Solid Blocks) -- //
        oreSmelting(this.output, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get(), 0.25f, 200, "blue_sapphire");
        oreSmelting(this.output, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get(), 0.25f, 200, "red_sapphire");
        oreSmelting(this.output, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get(), 0.25f, 200, "green_sapphire");
        oreSmelting(this.output, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get(), 0.25f, 200, "red_garnet");
        oreSmelting(this.output, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get(), 0.25f, 200, "blue_garnet");
        oreSmelting(this.output, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get(), 0.25f, 200, "pink_garnet");
        oreSmelting(this.output, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get(), 0.25f, 200, "yellow_garnet");
        oreSmelting(this.output, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK.get(), 0.25f, 200, "fusion_gem");
        oreSmelting(this.output, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK.get(), 0.25f, 200, "ruby");

        // -- Blasting (Raw Blocks - Solid Blocks) -- //
        oreBlasting(this.output, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get(), 0.25f, 100, "blue_sapphire");
        oreBlasting(this.output, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get(), 0.25f, 100, "red_sapphire");
        oreBlasting(this.output, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get(), 0.25f, 100, "green_sapphire");
        oreBlasting(this.output, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get(), 0.25f, 100, "red_garnet");
        oreBlasting(this.output, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get(), 0.25f, 100, "blue_garnet");
        oreBlasting(this.output, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get(), 0.25f, 100, "pink_garnet");
        oreBlasting(this.output, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get(), 0.25f, 200, "yellow_garnet");
        oreBlasting(this.output, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK.get(), 0.25f, 100, "fusion_gem");
        oreBlasting(this.output, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK.get(), 0.25f, 100, "ruby");

        // -- Add-ons -- //
        oreBlasting(this.output, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        oreBlasting(this.output, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        oreBlasting(this.output, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

        oreSmelting(this.output, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        oreSmelting(this.output, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        oreSmelting(this.output, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

        // -- Decor Blocks -- //
        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.RED_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.RED_SAPPHIRE, "red_sapphire", "has_red_sapphire");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.BLUE_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "blue_sapphire", "has_blue_sapphire");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_STAIRS,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_SLAB,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BUTTON,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_FENCE_GATE,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_WALL,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_DOOR,
                AdvancedValuables_BlockClass.GREEN_SAPPHIRE_TRAPDOOR,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "green_sapphire", "has_green_sapphire");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.RED_GARNET_STAIRS,
                AdvancedValuables_BlockClass.RED_GARNET_SLAB,
                AdvancedValuables_BlockClass.RED_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RED_GARNET_BUTTON,
                AdvancedValuables_BlockClass.RED_GARNET_FENCE,
                AdvancedValuables_BlockClass.RED_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.RED_GARNET_WALL,
                AdvancedValuables_BlockClass.RED_GARNET_DOOR,
                AdvancedValuables_BlockClass.RED_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.RED_GARNET, "red_garnet", "has_red_garnet");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.BLUE_GARNET_STAIRS,
                AdvancedValuables_BlockClass.BLUE_GARNET_SLAB,
                AdvancedValuables_BlockClass.BLUE_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.BLUE_GARNET_BUTTON,
                AdvancedValuables_BlockClass.BLUE_GARNET_FENCE,
                AdvancedValuables_BlockClass.BLUE_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.BLUE_GARNET_WALL,
                AdvancedValuables_BlockClass.BLUE_GARNET_DOOR,
                AdvancedValuables_BlockClass.BLUE_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.BLUE_GARNET, "blue_garnet", "has_blue_garnet");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.PINK_GARNET_STAIRS,
                AdvancedValuables_BlockClass.PINK_GARNET_SLAB,
                AdvancedValuables_BlockClass.PINK_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.PINK_GARNET_BUTTON,
                AdvancedValuables_BlockClass.PINK_GARNET_FENCE,
                AdvancedValuables_BlockClass.PINK_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.PINK_GARNET_WALL,
                AdvancedValuables_BlockClass.PINK_GARNET_DOOR,
                AdvancedValuables_BlockClass.PINK_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.PINK_GARNET, "pink_garnet", "has_pink_garnet");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.YELLOW_GARNET_STAIRS,
                AdvancedValuables_BlockClass.YELLOW_GARNET_SLAB,
                AdvancedValuables_BlockClass.YELLOW_GARNET_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_BUTTON,
                AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_FENCE_GATE,
                AdvancedValuables_BlockClass.YELLOW_GARNET_WALL,
                AdvancedValuables_BlockClass.YELLOW_GARNET_DOOR,
                AdvancedValuables_BlockClass.YELLOW_GARNET_TRAPDOOR,
                AdvancedValuables_ItemClass.YELLOW_GARNET, "yellow_garnet", "has_yellow_garnet");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.FUSION_STAIRS,
                AdvancedValuables_BlockClass.FUSION_SLAB,
                AdvancedValuables_BlockClass.FUSION_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.FUSION_BUTTON,
                AdvancedValuables_BlockClass.FUSION_FENCE,
                AdvancedValuables_BlockClass.FUSION_FENCE_GATE,
                AdvancedValuables_BlockClass.FUSION_WALL,
                AdvancedValuables_BlockClass.FUSION_DOOR,
                AdvancedValuables_BlockClass.FUSION_TRAPDOOR,
                AdvancedValuables_ItemClass.FUSION_GEM, "fusion_gem", "has_fusion_gem");

        generateBuildingBlocks(this.output,
                AdvancedValuables_BlockClass.RUBY_STAIRS,
                AdvancedValuables_BlockClass.RUBY_SLAB,
                AdvancedValuables_BlockClass.RUBY_PRESSURE_PLATE,
                AdvancedValuables_BlockClass.RUBY_BUTTON,
                AdvancedValuables_BlockClass.RUBY_FENCE,
                AdvancedValuables_BlockClass.RUBY_FENCE_GATE,
                AdvancedValuables_BlockClass.RUBY_WALL,
                AdvancedValuables_BlockClass.RUBY_DOOR,
                AdvancedValuables_BlockClass.RUBY_TRAPDOOR,
                AdvancedValuables_ItemClass.RUBY, "ruby", "has_ruby");

        // -- Hammer Wireframe Crafting -- //
        shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                .pattern("aaa")
                .pattern("aaa")
                .pattern(" a ")
                .define('a', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).group("hammer")
                .save(this.output);

        // -- Hammer Crafting -- //
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.RED_SAPPHIRE, AdvancedValuables_ItemClass.RED_SAPPHIRE_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.RED_GARNET, AdvancedValuables_ItemClass.RED_GARNET_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.BLUE_GARNET, AdvancedValuables_ItemClass.BLUE_GARNET_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.PINK_GARNET, AdvancedValuables_ItemClass.PINK_GARNET_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.YELLOW_GARNET, AdvancedValuables_ItemClass.YELLOW_GARNET_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.FUSION_GEM, AdvancedValuables_ItemClass.FUSION_HAMMER);
        generateHammerRecipe(this.output, AdvancedValuables_ItemClass.RUBY, AdvancedValuables_ItemClass.RUBY_HAMMER);
    }

    protected void oreSmelting(RecipeOutput output, List<ItemLike> ingredients, RecipeCategory recipeCategory, ItemLike result,
                               float experience, int cookingTime, String group)
    {
        oreCooking(output, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, recipeCategory, result,
                experience, cookingTime, group, "_from_smelting");
    }

    protected void oreBlasting(RecipeOutput output, List<ItemLike> ingredients, RecipeCategory recipeCategory, ItemLike result,
                                      float experience, int cookingTime, String group)
    {
        oreCooking(output, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients, recipeCategory, result,
                experience, cookingTime, group, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput output, RecipeSerializer<T> cookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group, String recipeName)
    {
        for (ItemLike itemLike : ingredients)
        {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), category, result, experience, cookingTime, cookingSerializer, factory).group(group).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(output, AdvancedValuables.MOD_ID + ":" + getItemName(result) + recipeName + "_" + getItemName(itemLike));
        }
    }

    // -- Shortcuts -- // -- Tools -- //
    private void generateBlockRecipe(RecipeOutput output, DeferredBlock<Block> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    private void generatePickaxeRecipe(RecipeOutput output, DeferredItem<PickaxeItem> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private void generateAxeRecipe(RecipeOutput output, DeferredItem<AxeItem> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private void generateShovelRecipe(RecipeOutput output, DeferredItem<ShovelItem> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private void generateHoeRecipe(RecipeOutput output, DeferredItem<HoeItem> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private void generateSwordRecipe(RecipeOutput output, DeferredItem<SwordItem> result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    // -- Shortcuts -- // -- Armor -- //
    private void generateArmorRecipe(RecipeOutput output,
                                            DeferredItem<ArmorItem> result_helmet,
                                            DeferredItem<ArmorItem> result_chestplate,
                                            DeferredItem<ArmorItem> result_leggings,
                                            DeferredItem<ArmorItem> result_boots,
                                            DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, result_chestplate)
                .pattern("a a")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        shaped(RecipeCategory.MISC, result_leggings)
                .pattern("aaa")
                .pattern("a a")
                .pattern("a a")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        shaped(RecipeCategory.MISC, result_helmet)
                .pattern("aaa")
                .pattern("a a")
                .pattern("   ")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        shaped(RecipeCategory.MISC, result_boots)
                .pattern("   ")
                .pattern("a a")
                .pattern("a a")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    private void generateAppleRecipe(RecipeOutput output, DeferredItem<Item> apple_result, DeferredItem<Item> ingredient, String group)
    {
        shaped(RecipeCategory.MISC, apple_result)
                .pattern("aaa")
                .pattern("aba")
                .pattern("aaa")
                .define('a', ingredient).define('b', Items.APPLE)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    private void generateBuildingBlocks(RecipeOutput output ,DeferredBlock<StairBlock> result_stair,
                                               DeferredBlock<SlabBlock> result_slab,
                                               DeferredBlock<PressurePlateBlock> result_pressure_plate,
                                               DeferredBlock<ButtonBlock> result_button,
                                               DeferredBlock<FenceBlock> result_fence,
                                               DeferredBlock<FenceGateBlock> result_fence_gate,
                                               DeferredBlock<WallBlock> result_wall,
                                               DeferredBlock<DoorBlock> result_door,
                                               DeferredBlock<TrapDoorBlock> result_trapdoor,
                                               DeferredItem<Item> ingredient, String group, String unlock)
    {
        stairBuilder(result_stair, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, result_slab, ingredient);
        pressurePlate(result_pressure_plate, ingredient);
        buttonBuilder(result_button, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
        fenceBuilder(result_fence, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
        fenceGateBuilder(result_fence_gate, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
        wall(RecipeCategory.BUILDING_BLOCKS, result_wall, ingredient);
        doorBuilder(result_door, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
        trapdoorBuilder(result_trapdoor, Ingredient.of(ingredient)).group(group).unlockedBy(unlock, has(ingredient)).save(output);
    }

    private void generateHammerRecipe(RecipeOutput output, DeferredItem<Item> ingredient, DeferredItem<HammerItem> result)
    {
        shapeless(RecipeCategory.MISC, result)
                .requires(ingredient).requires(AdvancedValuables_ItemClass.HAMMER_WIREFRAME)
                .unlockedBy("has_hammer_wireframe", has(ingredient)).group("hammer")
                .save(output);
    }
}