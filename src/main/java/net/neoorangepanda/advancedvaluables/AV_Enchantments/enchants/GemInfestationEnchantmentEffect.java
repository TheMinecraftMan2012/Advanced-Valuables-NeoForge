package net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Particles;

public record GemInfestationEnchantmentEffect() implements EnchantmentEntityEffect
{
    public static final MapCodec<GemInfestationEnchantmentEffect> CODEC = MapCodec.unit(GemInfestationEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel, int enchantmentLevel, EnchantedItemInUse item, Entity entity, Vec3 origin)
    {
        if (entity instanceof LivingEntity livingEntity)
        {
            if (enchantmentLevel == 1)
            {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE));
                serverLevel.sendParticles(AdvancedValuables_Particles.RED_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.GREEN_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
            }

            if (enchantmentLevel == 2)
            {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE));
                serverLevel.sendParticles(AdvancedValuables_Particles.RED_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.GREEN_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);

                serverLevel.sendParticles(AdvancedValuables_Particles.RED_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.BLUE_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.PINK_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.YELLOW_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
            }
            if (enchantmentLevel == 3)
            {
                livingEntity.addEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE));
                serverLevel.sendParticles(AdvancedValuables_Particles.RED_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.GREEN_SAPPHIRE_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);

                serverLevel.sendParticles(AdvancedValuables_Particles.RED_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.BLUE_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.PINK_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.YELLOW_GARNET_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);

                serverLevel.sendParticles(AdvancedValuables_Particles.FUSION_GEM_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
                serverLevel.sendParticles(AdvancedValuables_Particles.RUBY_PARTICLES.get(),
                        livingEntity.getX() + 0.5, livingEntity.getY() + 1.5, livingEntity.getZ() + 0.5,
                        2, 0, 0, 0, 3);
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec()
    {
        return CODEC;
    }
}
