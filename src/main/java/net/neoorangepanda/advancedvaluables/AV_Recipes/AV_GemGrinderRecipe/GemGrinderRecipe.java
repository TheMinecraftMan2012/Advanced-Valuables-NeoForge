package net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Recipes;

public record GemGrinderRecipe(Ingredient ingredient, ItemStack output) implements Recipe<GemGrinderRecipeInput>
{
    private NonNullList<Ingredient> getIngredients()
    {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(ingredient);
        return list;
    }
    @Override
    public boolean matches(GemGrinderRecipeInput gemGrinderRecipeInput, Level level)
    {
        if (level.isClientSide()) return false;
        return ingredient.test(gemGrinderRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(GemGrinderRecipeInput gemGrinderRecipeInput, HolderLookup.Provider provider)
        {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<GemGrinderRecipeInput>> getSerializer()
    {
        return AdvancedValuables_Recipes.GEM_GRINDER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<GemGrinderRecipeInput>> getType()
    {
        return AdvancedValuables_Recipes.GEM_GRINDER_TYPE.get();
    }

    @Override
    public PlacementInfo placementInfo()
    {
        return PlacementInfo.create(ingredient);
    }

    @Override
    public RecipeBookCategory recipeBookCategory()
    {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<GemGrinderRecipe>
    {
        public static final MapCodec<GemGrinderRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(GemGrinderRecipe::ingredient),
                ItemStack.CODEC.fieldOf("result").forGetter(GemGrinderRecipe::output)
        ).apply(inst, GemGrinderRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, GemGrinderRecipe> STREAM_CODEC = StreamCodec.composite(
                Ingredient.CONTENTS_STREAM_CODEC, GemGrinderRecipe::ingredient,
                ItemStack.STREAM_CODEC, GemGrinderRecipe::output, GemGrinderRecipe::new
        );

        @Override
        public MapCodec<GemGrinderRecipe> codec()
        {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, GemGrinderRecipe> streamCodec()
        {
            return STREAM_CODEC;
        }
    }
}
