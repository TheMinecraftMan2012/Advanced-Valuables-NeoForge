package net.neoorangepanda.advancedvaluables.AV_Libraries.Particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import org.jetbrains.annotations.NotNull;

public class AdvancedValuablesParticlesTemplate extends SingleQuadParticle
{
    protected AdvancedValuablesParticlesTemplate(ClientLevel level, double x, double y, double z, SpriteSet spriteSet,
                                                 double xSpeed, double ySpeed, double zSpeed)
    {
        super(level, x, y, z, xSpeed, ySpeed, zSpeed, spriteSet.first());

        this.friction = 0.8f;
        this.lifetime = 80;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 1f;
        this.gCol = 1f;
        this.bCol = 1f;
    }

    @Override
    protected @NotNull Layer getLayer()
    {
        return Layer.TRANSLUCENT;
    }

    public record Provider(SpriteSet spriteSet) implements ParticleProvider<@NotNull SimpleParticleType> {

        @Override
        public @NotNull Particle createParticle(SimpleParticleType simpleParticleType, @NotNull ClientLevel clientLevel,
                                                double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed, @NotNull RandomSource randomSource) {
            return new AdvancedValuablesParticlesTemplate(clientLevel, pX, pY, pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
        }
    }
}