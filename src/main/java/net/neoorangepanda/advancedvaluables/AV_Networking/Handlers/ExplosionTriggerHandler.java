package net.neoorangepanda.advancedvaluables.AV_Networking.Handlers;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoorangepanda.advancedvaluables.AV_Items.SparkiteStaff.SparkiteStaff;
import net.neoorangepanda.advancedvaluables.AV_Networking.Payloads.ExplosionTriggerPayload;

public class ExplosionTriggerHandler
{
    private static final float EXPLOSION_POWER = 6.0F;
    private static final int LIGHTNING_COUNT = 5;

    public static void handleOnServer(ExplosionTriggerPayload payload, IPayloadContext context)
    {
        context.enqueueWork(() -> {
            if (context.player() instanceof ServerPlayer player) trigger(player);
        });
    }

    private static void trigger(ServerPlayer player)
    {
        ServerLevel level = player.level();
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();

        float healthBefore = player.getHealth();

        level.explode(player, x, y, z, EXPLOSION_POWER, false, Level.ExplosionInteraction.TNT);

        if (player.getHealth() < healthBefore) player.setHealth(healthBefore);
        player.setRemainingFireTicks(0);

        RandomSource random = level.getRandom();
        for (int i = 0; i < LIGHTNING_COUNT; i++)
        {
            double angle = random.nextDouble() * Math.PI * 2;
            double radius = 2.0 + random.nextDouble() * 5.0;
            double lx = x + Math.cos(angle) * radius;
            double lz = z + Math.sin(angle) * radius;
            int ly = level.getHeight(Heightmap.Types.MOTION_BLOCKING, (int) lx, (int) lz);

            Vec3 position = new Vec3(lx, ly, lz);

            LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(level, EntitySpawnReason.TRIGGERED);
            if (bolt != null)
            {
                bolt.move(MoverType.PLAYER, position);
                bolt.setVisualOnly(true);
                bolt.getPersistentData().putBoolean(SparkiteStaff.FROM_STAFF_KEY, true);
                level.addFreshEntity(bolt);
            }
        }
    }
}
