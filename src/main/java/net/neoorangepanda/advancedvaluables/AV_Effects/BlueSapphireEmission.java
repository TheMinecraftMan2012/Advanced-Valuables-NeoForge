package net.neoorangepanda.advancedvaluables.AV_Effects;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Particles;

public class BlueSapphireEmission extends MobEffect
{
    public BlueSapphireEmission(MobEffectCategory category, int color)
    {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier)
    {
        level.sendParticles(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(), entity.getX(), entity.getY() + 2, entity.getZ(), 1, 0, 0, 0, 2);

        return super.applyEffectTick(level, entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier)
    {
        return true;
    }
}
