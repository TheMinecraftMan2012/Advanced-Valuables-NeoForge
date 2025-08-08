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

public record PoisonShardEnchantmentEffect() implements EnchantmentEntityEffect
{
    public static final MapCodec<PoisonShardEnchantmentEffect> CODEC = MapCodec.unit(PoisonShardEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel, int level, EnchantedItemInUse enchantedItemInUse, Entity entity, Vec3 vec3)
    {
        if (entity instanceof LivingEntity livingEntity)
        {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 400, 200));
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec()
    {
        return CODEC;
    }
}
