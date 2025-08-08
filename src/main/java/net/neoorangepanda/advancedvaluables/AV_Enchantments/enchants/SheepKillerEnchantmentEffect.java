package net.neoorangepanda.advancedvaluables.AV_Enchantments.enchants;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record SheepKillerEnchantmentEffect() implements EnchantmentEntityEffect
{
    public static final MapCodec<SheepKillerEnchantmentEffect> CODEC = MapCodec.unit(SheepKillerEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel, int level, EnchantedItemInUse enchantedItemInUse, Entity entity, Vec3 vec3)
    {
        if (entity instanceof Sheep sheep)
        {
            if (level == 1)
            {
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
            }

            if (level == 2)
            {
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
            }

            if (level == 3)
            {
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
            }

            if (level == 4)
            {
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
            }

            if (level == 5)
            {
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
                EntityType.WOLF.spawn(serverLevel, sheep.getOnPos().above(), EntitySpawnReason.TRIGGERED);
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec()
    {
        return CODEC;
    }
}
