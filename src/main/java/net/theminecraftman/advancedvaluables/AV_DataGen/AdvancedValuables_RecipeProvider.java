package net.theminecraftman.advancedvaluables.AV_DataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
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
        // -- Blue Sapphire -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_SAPPHIRE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_RAW_SAPPHIRE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get())
                .unlockedBy("has_blue_raw_sapphire", has(AdvancedValuables_ItemClass.BLUE_RAW_SAPPHIRE.get())).save(recipeOutput);

        // -- Red Sapphire -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_SAPPHIRE_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_RAW_SAPPHIRE_BLOCK.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get())
                .unlockedBy("has_red_raw_sapphire", has(AdvancedValuables_ItemClass.RED_RAW_SAPPHIRE.get())).save(recipeOutput);

        // -- Green Sapphire -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_SAPPHIRE_BLOCK.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.GREEN_RAW_SAPPHIRE_BLOCK.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get())
                .unlockedBy("has_green_raw_sapphire", has(AdvancedValuables_ItemClass.GREEN_RAW_SAPPHIRE.get())).save(recipeOutput);

        // -- Red Garnet -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_GARNET_BLOCK.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', AdvancedValuables_ItemClass.RED_GARNET.get())
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RED_RAW_GARNET_BLOCK.get())
                .pattern("HHH")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', AdvancedValuables_ItemClass.RED_RAW_GARNET.get())
                .unlockedBy("has_red_raw_garnet", has(AdvancedValuables_ItemClass.RED_RAW_GARNET.get())).save(recipeOutput);

        // -- Blue Garnet -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_GARNET_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.BLUE_RAW_GARNET_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get())
                .unlockedBy("has_blue_raw_garnet", has(AdvancedValuables_ItemClass.BLUE_RAW_GARNET.get())).save(recipeOutput);

        // -- Pink Garnet -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_GARNET_BLOCK.get())
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.PINK_RAW_GARNET_BLOCK.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', AdvancedValuables_ItemClass.PINK_RAW_GARNET.get())
                .unlockedBy("has_pink_raw_garnet", has(AdvancedValuables_ItemClass.PINK_RAW_GARNET.get())).save(recipeOutput);

        // -- Yellow Garnet -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_GARNET_BLOCK.get())
                .pattern("KKK")
                .pattern("KKK")
                .pattern("KKK")
                .define('K', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.YELLOW_RAW_GARNET_BLOCK.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get())
                .unlockedBy("has_yellow_raw_garnet", has(AdvancedValuables_ItemClass.YELLOW_RAW_GARNET.get())).save(recipeOutput);

        // -- Fusion Gem -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.FUSION_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RAW_FUSION_BLOCK.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', AdvancedValuables_ItemClass.RAW_FUSION_GEM.get())
                .unlockedBy("has_raw_fusion_gem", has(AdvancedValuables_ItemClass.RAW_FUSION_GEM.get())).save(recipeOutput);

        // -- Ruby -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RUBY_BLOCK.get())
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', AdvancedValuables_ItemClass.RUBY.get())
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_BlockClass.RAW_RUBY_BLOCK.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', AdvancedValuables_ItemClass.RAW_RUBY.get())
                .unlockedBy("has_raw_ruby", has(AdvancedValuables_ItemClass.RAW_RUBY.get())).save(recipeOutput);

        // -- Crafting Recipe -- // -- Shaped Recipe -- // -- Tools and Armor -- //
        // -- Red Sapphire Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_AXE)
                .pattern("cc ")
                .pattern("cd ")
                .pattern(" d ")
                .define('c', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .define('d', Items.STICK)
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_SHOVEL)
                .pattern(" e ")
                .pattern(" f ")
                .pattern(" f ")
                .define('e', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .define('f', Items.STICK)
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_HOE)
                .pattern(" gg")
                .pattern(" f ")
                .pattern(" f ")
                .define('g', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .define('f', Items.STICK)
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_SAPPHIRE_SWORD)
                .pattern(" h ")
                .pattern(" h ")
                .pattern(" i ")
                .define('h', AdvancedValuables_ItemClass.RED_SAPPHIRE.get())
                .define('i', Items.STICK)
                .unlockedBy("has_red_sapphire", has(AdvancedValuables_ItemClass.RED_SAPPHIRE.get())).save(recipeOutput);

        // -- Blue Sapphire Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_PICKAXE)
                .pattern("jjj")
                .pattern(" k ")
                .pattern(" k ")
                .define('j', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .define('k', Items.STICK)
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_AXE)
                .pattern("ll ")
                .pattern("lm ")
                .pattern(" m ")
                .define('l', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .define('m', Items.STICK)
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SHOVEL)
                .pattern(" n ")
                .pattern(" o ")
                .pattern(" o ")
                .define('n', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .define('o', Items.STICK)
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_HOE)
                .pattern(" pp")
                .pattern(" q ")
                .pattern(" q ")
                .define('p', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .define('q', Items.STICK)
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_SAPPHIRE_SWORD)
                .pattern(" p ")
                .pattern(" p ")
                .pattern(" q ")
                .define('p', AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())
                .define('q', Items.STICK)
                .unlockedBy("has_blue_sapphire", has(AdvancedValuables_ItemClass.BLUE_SAPPHIRE.get())).save(recipeOutput);

        // -- Green Sapphire Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_PICKAXE)
                .pattern("jjj")
                .pattern(" k ")
                .pattern(" k ")
                .define('j', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .define('k', Items.STICK)
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_AXE)
                .pattern("ll ")
                .pattern("lm ")
                .pattern(" m ")
                .define('l', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .define('m', Items.STICK)
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SHOVEL)
                .pattern(" n ")
                .pattern(" o ")
                .pattern(" o ")
                .define('n', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .define('o', Items.STICK)
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_HOE)
                .pattern(" pp")
                .pattern(" q ")
                .pattern(" q ")
                .define('p', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .define('q', Items.STICK)
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.GREEN_SAPPHIRE_SWORD)
                .pattern(" p ")
                .pattern(" p ")
                .pattern(" q ")
                .define('p', AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())
                .define('q', Items.STICK)
                .unlockedBy("has_green_sapphire", has(AdvancedValuables_ItemClass.GREEN_SAPPHIRE.get())).save(recipeOutput);

        // -- Red Garnet Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_AXE)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_SHOVEL)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_HOE)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RED_GARNET_SWORD)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RED_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_red_garnet", has(AdvancedValuables_ItemClass.RED_GARNET.get())).save(recipeOutput);

        // -- Blue Garnet Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_AXE)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_SHOVEL)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_HOE)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.BLUE_GARNET_SWORD)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.BLUE_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_blue_garnet", has(AdvancedValuables_ItemClass.BLUE_GARNET.get())).save(recipeOutput);

        // -- Pink Garnet Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_AXE)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_SHOVEL)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_HOE)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.PINK_GARNET_SWORD)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.PINK_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_pink_garnet", has(AdvancedValuables_ItemClass.PINK_GARNET.get())).save(recipeOutput);

        // -- Yellow Garnet Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_PICKAXE.get())
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_AXE.get())
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_SHOVEL.get())
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_HOE.get())
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.YELLOW_GARNET_SWORD.get())
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.YELLOW_GARNET.get())
                .define('b', Items.STICK)
                .unlockedBy("has_yellow_garnet", has(AdvancedValuables_ItemClass.YELLOW_GARNET.get())).save(recipeOutput);

        // -- Fusion Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .define('b', Items.STICK)
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_AXE)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .define('b', Items.STICK)
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_SHOVEL)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .define('b', Items.STICK)
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_HOE)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .define('b', Items.STICK)
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.FUSION_SWORD)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.FUSION_GEM.get())
                .define('b', Items.STICK)
                .unlockedBy("has_fusion_gem", has(AdvancedValuables_ItemClass.FUSION_GEM.get())).save(recipeOutput);

        // -- Ruby Tools -- //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_PICKAXE)
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_AXE)
                .pattern("aa ")
                .pattern("ab ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_SHOVEL)
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_HOE)
                .pattern("aa ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AdvancedValuables_ItemClass.RUBY_SWORD)
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', AdvancedValuables_ItemClass.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(AdvancedValuables_ItemClass.RUBY.get())).save(recipeOutput);

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
}
