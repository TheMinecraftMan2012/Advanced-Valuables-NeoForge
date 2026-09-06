package net.neoorangepanda.advancedvaluables.AV_ClientExtension;

import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.extensions.common.IClientBlockExtensions;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public record OnBreakParticleSpawn(Supplier<? extends ParticleOptions> particle) implements IClientBlockExtensions
{
    @Override
    public boolean addDestroyEffects(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull ParticleEngine manager) {
        RandomSource randomSource = level.getRandom();
        for (int i = 0; i < 15; i++) {
            double px = pos.getX() + randomSource.nextDouble();
            double py = pos.getY() + randomSource.nextDouble();
            double pz = pos.getZ() + randomSource.nextDouble();
            level.addParticle(this.particle.get(), px, py, pz, 0, 0, 0);
        }

        return true;
    }
}
