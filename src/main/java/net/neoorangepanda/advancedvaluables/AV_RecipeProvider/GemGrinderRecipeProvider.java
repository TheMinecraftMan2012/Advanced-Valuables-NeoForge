package net.neoorangepanda.advancedvaluables.AV_RecipeProvider;

import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GemGrinderRecipeProvider implements RecipeBuilder
{
    private final List<Ingredient> inputItems = new ArrayList<>();
    private final ItemStackTemplate result;
    private final RecipeCategory category;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();

    public GemGrinderRecipeProvider(ItemStackTemplate result, RecipeCategory category)
    {
        this.result = result;
        this.category = category;
    }

    public static GemGrinderRecipeProvider grinding(ItemStackTemplate result, RecipeCategory category)
    {
        return new GemGrinderRecipeProvider(result, category);
    }

    public GemGrinderRecipeProvider addIngredient(Ingredient ingredient)
    {
        this.inputItems.add(ingredient);
        return this;
    }

    @Override
    public @NotNull GemGrinderRecipeProvider unlockedBy(@NotNull String name, @NotNull Criterion<?> criterion)
    {
        this.advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    @Override
    public @NotNull GemGrinderRecipeProvider group(@Nullable String group)
    {
        return this;
    }

    @Override
    public @NotNull ResourceKey<@NotNull Recipe<?>> defaultId()
    {
        return RecipeBuilder.getDefaultRecipeId(this.result);
    }

    @Override
    public void save(RecipeOutput output, @NotNull ResourceKey<@NotNull Recipe<?>> id)
    {
        GemGrinderRecipe recipe = new GemGrinderRecipe(List.copyOf(this.inputItems), this.result);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, this.category));
    }
}