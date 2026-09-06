package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public class AdvancedValuables_Recipes
{
    public static final DeferredRegister<@NotNull RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, AdvancedValuables.MOD_ID);
    public static final DeferredRegister<@NotNull RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<@NotNull RecipeSerializer<?>, @NotNull RecipeSerializer<@NotNull GemGrinderRecipe>> GEM_GRINDER_SERIALIZER =
            SERIALIZERS.register("grinding", () -> new RecipeSerializer<>(GemGrinderRecipe.CODEC, GemGrinderRecipe.STREAM_CODEC));

    public static final DeferredHolder<@NotNull RecipeType<?>, @NotNull RecipeType<@NotNull GemGrinderRecipe>> GEM_GRINDER_TYPE =
            TYPES.register("grinding", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "grinding";
                }
            });

    public static void register(IEventBus eventBus)
    {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
