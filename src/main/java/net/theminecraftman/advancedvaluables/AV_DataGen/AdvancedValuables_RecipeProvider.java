package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_BlockClass;
import net.theminecraftman.advancedvaluables.AV_Templates.AdvancedValuables_ItemClass;
import net.theminecraftman.advancedvaluables.AdvancedValuables;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AdvancedValuables_RecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public AdvancedValuables_RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput)
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
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RED_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.FUSION_BLOCK, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RUBY_BLOCK, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE, "has_blue_raw_sapphire");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE, "has_red_raw_sapphire");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE, "has_green_raw_sapphire");

        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.RED_RAW_GARNET, "has_red_raw_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.BLUE_RAW_GARNET, "has_blue_raw_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.PINK_RAW_GARNET, "has_pink_raw_garnet");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET, "has_yellow_raw_garnet");

        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RAW_FUSION_BLOCK, AdvancedValuables_ItemClass.RAW_FUSION_GEM, "has_raw_fusion_gem");
        generateBlockRecipe(recipeOutput, AdvancedValuables_BlockClass.RAW_RUBY_BLOCK, AdvancedValuables_ItemClass.RAW_RUBY, "has_raw_ruby");

        // -- Crafting Recipe -- // -- Shaped Recipe -- // -- Tools and Armor -- //
        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_GARNET_PICKAXE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_GARNET_AXE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_GARNET_SHOVEL, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_GARNET_HOE, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.RED_GARNET_SWORD, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_GARNET_AXE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_GARNET_HOE, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.BLUE_GARNET_SWORD, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.PINK_GARNET_AXE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.PINK_GARNET_HOE, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.PINK_GARNET_SWORD, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.YELLOW_GARNET_AXE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.YELLOW_GARNET_HOE, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.FUSION_PICKAXE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.FUSION_AXE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.FUSION_SHOVEL, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.FUSION_HOE, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.FUSION_SWORD, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");

        generatePickaxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RUBY_PICKAXE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateAxeRecipe(recipeOutput, AdvancedValuables_ItemClass.RUBY_AXE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateShovelRecipe(recipeOutput, AdvancedValuables_ItemClass.RUBY_SHOVEL, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateHoeRecipe(recipeOutput, AdvancedValuables_ItemClass.RUBY_HOE, AdvancedValuables_ItemClass.RUBY, "has_ruby");
        generateSwordRecipe(recipeOutput, AdvancedValuables_ItemClass.RUBY_SWORD, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        // -- Armors -- //
        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.BLUE_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.BLUE_SAPPHIRE, "has_blue_sapphire");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.RED_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.RED_SAPPHIRE, "has_red_sapphire");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HELMET,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_CHESTPLATE,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_LEGGINGS,
                AdvancedValuables_ItemClass.GREEN_SAPPHIRE_BOOTS, AdvancedValuables_ItemClass.GREEN_SAPPHIRE, "has_green_sapphire");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.RED_GARNET_HELMET,
                AdvancedValuables_ItemClass.RED_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.RED_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.RED_GARNET_BOOTS, AdvancedValuables_ItemClass.RED_GARNET, "has_red_garnet");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.BLUE_GARNET_HELMET,
                AdvancedValuables_ItemClass.BLUE_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.BLUE_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.BLUE_GARNET_BOOTS, AdvancedValuables_ItemClass.BLUE_GARNET, "has_blue_garnet");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.PINK_GARNET_HELMET,
                AdvancedValuables_ItemClass.PINK_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.PINK_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.PINK_GARNET_BOOTS, AdvancedValuables_ItemClass.PINK_GARNET, "has_pink_garnet");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.YELLOW_GARNET_HELMET,
                AdvancedValuables_ItemClass.YELLOW_GARNET_CHESTPLATE,
                AdvancedValuables_ItemClass.YELLOW_GARNET_LEGGINGS,
                AdvancedValuables_ItemClass.YELLOW_GARNET_BOOTS, AdvancedValuables_ItemClass.YELLOW_GARNET, "has_yellow_garnet");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.FUSION_HELMET,
                AdvancedValuables_ItemClass.FUSION_CHESTPLATE,
                AdvancedValuables_ItemClass.FUSION_LEGGINGS,
                AdvancedValuables_ItemClass.FUSION_BOOTS, AdvancedValuables_ItemClass.FUSION_GEM, "has_fusion_gem");

        generateArmorRecipe(recipeOutput,
                AdvancedValuables_ItemClass.RUBY_HELMET,
                AdvancedValuables_ItemClass.RUBY_CHESTPLATE,
                AdvancedValuables_ItemClass.RUBY_LEGGINGS,
                AdvancedValuables_ItemClass.RUBY_BOOTS, AdvancedValuables_ItemClass.RUBY, "has_ruby");

        // -- Crafting Recipe -- // -- Shapeless Recipe -- //
        // -- Red Sapphire -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_red_sapphire_block", has(AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_red_raw_sapphire_block", has(AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        // -- Blue Sapphire -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_blue_sapphire_block", has(AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_blue_raw_sapphire_block", has(AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        // -- Green Sapphire -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_green_sapphire_block", has(AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get(), 9)
                .requires(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy("has_green_raw_sapphire_block", has(AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())).save(recipeOutput);

        // -- Red Garnet -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .unlockedBy("has_red_garnet_block", has(AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_red_raw_garnet_block", has(AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())).save(recipeOutput);

        // -- Blue Garnet -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .unlockedBy("has_blue_garnet_block", has(AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_blue_raw_garnet_block", has(AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())).save(recipeOutput);

        // -- Yellow Garnet -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .unlockedBy("has_yellow_garnet_block", has(AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_yellow_raw_garnet_block", has(AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())).save(recipeOutput);

        // -- Pink Garnet -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .unlockedBy("has_pink_garnet_block", has(AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_RAW_GARNET.get(), 9)
                .requires(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())
                .unlockedBy("has_pink_raw_garnet_block", has(AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())).save(recipeOutput);

        // -- Fusion Gem -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 9)
                .requires(AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .unlockedBy("has_fusion_block", has(AdvancedValuables_BlockClass.FUSION_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_FUSION_GEM.get(), 9)
                .requires(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())
                .unlockedBy("has_raw_fusion_block", has(AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())).save(recipeOutput);

        // -- Ruby -- //
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 9)
                .requires(AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", has(AdvancedValuables_BlockClass.RUBY_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AdvancedValuables_ItemClass.RAW_RUBY.get(), 9)
                .requires(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())
                .unlockedBy("has_raw_ruby_block", has(AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())).save(recipeOutput);

        // -- Smelting (Raw Items - Solid Items) -- //
        oreSmelting(recipeOutput, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 0.25f, 200, "blue_sapphire");
        oreSmelting(recipeOutput, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 0.25f, 200, "red_sapphire");
        oreSmelting(recipeOutput, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 0.25f, 200, "green_sapphire");
        oreSmelting(recipeOutput, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 0.25f, 200, "red_garnet");
        oreSmelting(recipeOutput, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 0.25f, 200, "blue_garnet");
        oreSmelting(recipeOutput, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 0.25f, 200, "pink_garnet");
        oreSmelting(recipeOutput, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 0.25f, 200, "yellow_garnet");
        oreSmelting(recipeOutput, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 0.25f, 200, "fusion_gem");
        oreSmelting(recipeOutput, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 0.25f, 200, "ruby");

        // -- Blasting (Raw Items - Solid Items) -- //
        oreBlasting(recipeOutput, BLUE_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get(), 0.25f, 100, "blue_sapphire");
        oreBlasting(recipeOutput, RED_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE.get(), 0.25f, 100, "red_sapphire");
        oreBlasting(recipeOutput, GREEN_SAPPHIRE_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get(), 0.25f, 100, "green_sapphire");
        oreBlasting(recipeOutput, RED_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET.get(), 0.25f, 100, "red_garnet");
        oreBlasting(recipeOutput, BLUE_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET.get(), 0.25f, 100, "blue_garnet");
        oreBlasting(recipeOutput, PINK_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET.get(), 0.25f, 100, "pink_garnet");
        oreBlasting(recipeOutput, YELLOW_GARNET_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET.get(), 0.25f, 200, "yellow_garnet");
        oreBlasting(recipeOutput, FUSION_GEM_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_GEM.get(), 0.25f, 100, "fusion_gem");
        oreBlasting(recipeOutput, RUBY_SMELTING_ITEMS, RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY.get(), 0.25f, 100, "ruby");

        // -- Smelting (Raw Blocks - Solid Blocks) -- //
        oreSmelting(recipeOutput, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get(), 0.25f, 200, "blue_sapphire");
        oreSmelting(recipeOutput, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get(), 0.25f, 200, "red_sapphire");
        oreSmelting(recipeOutput, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get(), 0.25f, 200, "green_sapphire");
        oreSmelting(recipeOutput, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get(), 0.25f, 200, "red_garnet");
        oreSmelting(recipeOutput, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get(), 0.25f, 200, "blue_garnet");
        oreSmelting(recipeOutput, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get(), 0.25f, 200, "pink_garnet");
        oreSmelting(recipeOutput, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get(), 0.25f, 200, "yellow_garnet");
        oreSmelting(recipeOutput, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK.get(), 0.25f, 200, "fusion_gem");
        oreSmelting(recipeOutput, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK.get(), 0.25f, 200, "ruby");

        // -- Blasting (Raw Blocks - Solid Blocks) -- //
        oreBlasting(recipeOutput, BLUE_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get(), 0.25f, 100, "blue_sapphire");
        oreBlasting(recipeOutput, RED_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get(), 0.25f, 100, "red_sapphire");
        oreBlasting(recipeOutput, GREEN_SAPPHIRE_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get(), 0.25f, 100, "green_sapphire");
        oreBlasting(recipeOutput, RED_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get(), 0.25f, 100, "red_garnet");
        oreBlasting(recipeOutput, BLUE_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get(), 0.25f, 100, "blue_garnet");
        oreBlasting(recipeOutput, PINK_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get(), 0.25f, 100, "pink_garnet");
        oreBlasting(recipeOutput, YELLOW_GARNET_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get(), 0.25f, 200, "yellow_garnet");
        oreBlasting(recipeOutput, FUSION_GEM_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK.get(), 0.25f, 100, "fusion_gem");
        oreBlasting(recipeOutput, RUBY_SMELTING_BLOCKS, RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK.get(), 0.25f, 100, "ruby");

        // -- Add-ons -- //
        oreBlasting(recipeOutput, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        oreBlasting(recipeOutput, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        oreBlasting(recipeOutput, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");

        oreSmelting(recipeOutput, IRON_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 0.25f, 100, "iron_block");
        oreSmelting(recipeOutput, GOLD_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 0.25f, 100, "gold_block");
        oreSmelting(recipeOutput, COPPER_SMELTING_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 0.25f, 100, "copper_block");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory recipeCategory, ItemLike result,
                                      float experience, int cookingTime, String group)
    {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, recipeCategory, result,
                experience, cookingTime, group, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory recipeCategory, ItemLike result,
                                      float experience, int cookingTime, String group)
    {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients, recipeCategory, result,
                experience, cookingTime, group, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> cookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group, String recipeName)
    {
        for (ItemLike itemLike : ingredients)
        {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), category, result, experience, cookingTime, cookingSerializer, factory).group(group).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(recipeOutput, AdvancedValuables.MOD_ID + ":" + getItemName(result) + recipeName + "_" + getItemName(itemLike));
        }
    }

    // -- Shortcuts -- // -- Tools -- //
    private static void generateBlockRecipe(RecipeOutput output, DeferredBlock<Block> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    private static void generatePickaxeRecipe(RecipeOutput output, DeferredItem<Item> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private static void generateAxeRecipe(RecipeOutput output, DeferredItem<Item> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private static void generateShovelRecipe(RecipeOutput output, DeferredItem<Item> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private static void generateHoeRecipe(RecipeOutput output, DeferredItem<Item> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }
    private static void generateSwordRecipe(RecipeOutput output, DeferredItem<Item> result, DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', ingredient).define('b', Items.STICK)
                .unlockedBy(group, has(ingredient)).save(output);
    }

    // -- Shortcuts -- // -- Armor -- //
    private static void generateArmorRecipe(RecipeOutput output,
                                            DeferredItem<Item> result_helmet,
                                            DeferredItem<Item> result_chestplate,
                                            DeferredItem<Item> result_leggings,
                                            DeferredItem<Item> result_boots,
                                            DeferredItem<Item> ingredient, String group)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result_chestplate)
                .pattern("a a")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result_leggings)
                .pattern("aaa")
                .pattern("a a")
                .pattern("a a")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result_helmet)
                .pattern("aaa")
                .pattern("a a")
                .pattern("   ")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result_boots)
                .pattern("   ")
                .pattern("a a")
                .pattern("a a")
                .define('a', ingredient)
                .unlockedBy(group, has(ingredient)).save(output);
    }
}
