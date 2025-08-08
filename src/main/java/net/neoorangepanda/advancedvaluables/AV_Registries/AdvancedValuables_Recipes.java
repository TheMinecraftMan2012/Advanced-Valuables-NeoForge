package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Recipes.AV_GemGrinderRecipe.GemGrinderRecipe;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_Recipes
{
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, AdvancedValuables.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<GemGrinderRecipe>> GEM_GRINDER_SERIALIZER =
            SERIALIZERS.register("gem_grinder", GemGrinderRecipe.Serializer::new);

    public static final DeferredHolder<RecipeType<?>, RecipeType<GemGrinderRecipe>> GEM_GRINDER_TYPE =
            TYPES.register("gem_grinder", () -> new RecipeType<GemGrinderRecipe>() {
                @Override
                public String toString() {
                    return "gem_grinder";
                }
            });

    public static void register(IEventBus eventBus)
    {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
