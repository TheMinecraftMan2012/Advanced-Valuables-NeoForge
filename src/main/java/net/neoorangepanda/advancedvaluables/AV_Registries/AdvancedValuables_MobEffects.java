package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_Effects.*;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("all")
public class AdvancedValuables_MobEffects
{
    public static final DeferredRegister<@NotNull MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> RED_SAPPHIRE_EMISSION = registerMobEffect("red_sapphire_emission", new RedSapphireEmission(MobEffectCategory.BENEFICIAL, 0xdc143c), Attributes.MOVEMENT_SPEED, 0.20, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> BLUE_SAPPHIRE_EMISSION = registerMobEffect("blue_sapphire_emission", new BlueSapphireEmission(MobEffectCategory.BENEFICIAL, 0x0f52ba), Attributes.MOVEMENT_SPEED, 0.20, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> GREEN_SAPPHIRE_EMISSION = registerMobEffect("green_sapphire_emission", new GreenSapphireEmission(MobEffectCategory.BENEFICIAL, 0x80bc8a), Attributes.MOVEMENT_SPEED, 0.20, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> RED_GARNET_EMISSION = registerMobEffect("red_garnet_emission", new RedGarnetEmission(MobEffectCategory.BENEFICIAL, 0x733635), Attributes.MOVEMENT_SPEED, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> BLUE_GARNET_EMISSION = registerMobEffect("blue_garnet_emission", new BlueGarnetEmission(MobEffectCategory.BENEFICIAL, 0x0037b8), Attributes.MOVEMENT_SPEED, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> PINK_GARNET_EMISSION = registerMobEffect("pink_garnet_emission", new PinkGarnetEmission(MobEffectCategory.BENEFICIAL, 0xc42d5b), Attributes.MOVEMENT_SPEED, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> YELLOW_GARNET_EMISSION = registerMobEffect("yellow_garnet_emission", new YellowGarnetEmission(MobEffectCategory.BENEFICIAL, 0xf0a516), Attributes.MOVEMENT_SPEED, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> FUSION_GEM_EMISSION = registerMobEffect("fusion_gem_emission", new FusionGemEmission(MobEffectCategory.BENEFICIAL, 0x5a62cd), Attributes.MOVEMENT_SPEED, 0.5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    public static final DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> RUBY_EMISSION = registerMobEffect("ruby_emission", new RubyEmission(MobEffectCategory.BENEFICIAL, 0xd60000), Attributes.MOVEMENT_SPEED, 0.4, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    private static DeferredHolder<@NotNull MobEffect, @NotNull MobEffect> registerMobEffect(String name, MobEffect mobEffect, Holder<Attribute> attributeHolder, double amount, AttributeModifier.Operation operation)
    {
        return MOB_EFFECTS.register(name, () -> mobEffect.addAttributeModifier(attributeHolder, Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, name), amount, operation));
    }

    public static void register(IEventBus eventBus)
    {
        MOB_EFFECTS.register(eventBus);
    }
}
