package net.neoorangepanda.advancedvaluables.AV_RecipeProvider.AV_GemGrinder;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.neoorangepanda.advancedvaluables.AV_RecipeProvider.AdvancedValuablesRecipeProvider;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;

public class GemGrinderRecipeProvider extends AdvancedValuablesRecipeProvider
{
    private final Ingredient ingredient;
    private final ItemStack itemStack;

    public GemGrinderRecipeProvider(ItemStack result, Ingredient ingredient)
    {
        super(result);
        this.ingredient = ingredient;
        this.itemStack = result;
    }

    @Override
    public void save(RecipeOutput recipeOutput, ResourceKey<Recipe<?>> resourceKey)
    {
        Advancement.Builder advancement = recipeOutput.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(resourceKey))
                .rewards(AdvancementRewards.Builder.recipe(resourceKey))
                .requirements(AdvancementRequirements.Strategy.OR);
        this.criteria.forEach(advancement::addCriterion);
        GemGrinderRecipe recipe = new GemGrinderRecipe(this.ingredient, this.itemStack);
        recipeOutput.accept(resourceKey, recipe, advancement.build(resourceKey.location().withPrefix("gem_grinder_recipe/")));
    }
}
