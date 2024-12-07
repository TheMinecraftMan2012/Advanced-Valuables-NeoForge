package net.theminecraftman.advancedvaluables.AV_Libraries.FoodComponents;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class AdvancedValuables_FoodConsumables
{
    public static final Consumable RED_SAPPHIRE_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f)).build();
    public static final Consumable BLUE_SAPPHIRE_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f)).build();
    public static final Consumable GREEN_SAPPHIRE_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 10), 100f)).build();

    public static final Consumable RED_GARNET_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final Consumable BLUE_GARNET_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final Consumable PINK_GARNET_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 15), 100f)).build();
    public static final Consumable YELLOW_GARNET_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 15), 100f)).build();

    public static final Consumable FUSION_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(
            List.of(
                new MobEffectInstance(MobEffects.ABSORPTION, 800, 100),
                new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 100),
                new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 100),
                new MobEffectInstance(MobEffects.ABSORPTION, 800, 100)
            )
    )).build();

    public static final Consumable RUBY_APPLE = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(
            List.of(
                    new MobEffectInstance(MobEffects.ABSORPTION, 800, 100),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 100),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 100),
                    new MobEffectInstance(MobEffects.ABSORPTION, 800, 100)
            )
    )).build();
}