package net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class AdvancedValuables_FoodProperties
{
    public static final FoodProperties RED_SAPPHIRE_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodProperties BLUE_SAPPHIRE_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodProperties GREEN_SAPPHIRE_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f).build();

    public static final FoodProperties RED_GARNET_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodProperties BLUE_GARNET_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodProperties PINK_GARNET_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodProperties YELLOW_GARNET_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 650, 15), 100f).build();

    public static final FoodProperties FUSION_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 800, 25), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 800, 25), 100f).build();

    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 750, 20), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 750, 20), 100f).build();
}
