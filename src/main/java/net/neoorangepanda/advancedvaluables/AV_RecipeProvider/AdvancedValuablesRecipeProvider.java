package net.neoorangepanda.advancedvaluables.AV_RecipeProvider;

import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AdvancedValuablesRecipeProvider implements RecipeBuilder
{
    protected final ItemStack result;
    protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    protected String group;

    public AdvancedValuablesRecipeProvider(ItemStack result)
    {
        this.result = result;
    }

    @Override
    public RecipeBuilder unlockedBy(String name, Criterion<?> criterion)
    {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String group)
    {
        this.group = group;
        return this;
    }

    @Override
    public Item getResult()
    {
        return this.result.getItem();
    }
}
