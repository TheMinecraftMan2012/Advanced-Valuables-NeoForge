package net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import org.jetbrains.annotations.NotNull;

public record GemGrinderRecipeInput(ItemStack input) implements RecipeInput
{
    @Override
    public @NotNull ItemStack getItem(int i)
    {
        return input;
    }

    @Override
    public int size()
    {
        return 1;
    }
}
