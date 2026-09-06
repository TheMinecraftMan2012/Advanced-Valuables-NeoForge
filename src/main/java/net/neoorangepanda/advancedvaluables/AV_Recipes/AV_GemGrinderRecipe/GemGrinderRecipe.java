package net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Recipes;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record GemGrinderRecipe(List<Ingredient> inputItems, ItemStackTemplate output) implements Recipe<@NotNull GemGrinderRecipeInput>
{
    public static MapCodec<GemGrinderRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Ingredient.CODEC.listOf().fieldOf("ingredients").forGetter(GemGrinderRecipe::inputItems),
            ItemStackTemplate.CODEC.fieldOf("result").forGetter(GemGrinderRecipe::output)
    ).apply(inst, GemGrinderRecipe::new));

    public static StreamCodec<@NotNull RegistryFriendlyByteBuf, @NotNull GemGrinderRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()), GemGrinderRecipe::inputItems,
                    ItemStackTemplate.STREAM_CODEC, GemGrinderRecipe::output,
                    GemGrinderRecipe::new);

    public NonNullList<@NotNull Ingredient> getIngredients()
    {
        NonNullList<@NotNull Ingredient> list = NonNullList.create();
        list.addAll(inputItems);
        return list;
    }

    @Override
    public boolean matches(GemGrinderRecipeInput pInput, Level pLevel)
    {
        if(pLevel.isClientSide()) return false;
        for (int i = 0; i < inputItems.size(); i++) if(!inputItems.get(i).test(pInput.getItem(i))) return false;
        return true;
    }

    @Override
    public @NotNull ItemStack assemble(GemGrinderRecipeInput pInput)
    {
        return output.create().copy();
    }

    @Override
    public boolean showNotification()
    {
        return true;
    }

    @Override
    public@NotNull  String group()
    {
        return "Grinding";
    }


    @Override
    public @NotNull RecipeSerializer<@NotNull GemGrinderRecipe> getSerializer()
    {
        return AdvancedValuables_Recipes.GEM_GRINDER_SERIALIZER.get();
    }

    @Override
    public @NotNull RecipeType<? extends @NotNull Recipe<@NotNull GemGrinderRecipeInput>> getType()
    {
        return AdvancedValuables_Recipes.GEM_GRINDER_TYPE.get();
    }

    @Override
    public @NotNull PlacementInfo placementInfo()
    {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory()
    {
        return RecipeBookCategories.CRAFTING_MISC;
    }
}