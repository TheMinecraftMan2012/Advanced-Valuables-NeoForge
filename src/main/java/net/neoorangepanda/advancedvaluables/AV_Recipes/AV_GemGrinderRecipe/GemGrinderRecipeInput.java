package net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record GemGrinderRecipeInput(ItemStack input) implements RecipeInput
{
    @Override
    public ItemStack getItem(int i)
    {
        return input;
    }

    @Override
    public int size()
    {
        return 1;
    }
}
