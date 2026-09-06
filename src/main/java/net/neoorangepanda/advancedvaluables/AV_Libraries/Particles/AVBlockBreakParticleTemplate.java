package net.neoorangepanda.advancedvaluables.AV_Libraries.Particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import org.jetbrains.annotations.NotNull;

public class AVBlockBreakParticleTemplate extends SingleQuadParticle
{
    private final SingleQuadParticle.Layer layer;

    protected AVBlockBreakParticleTemplate(ClientLevel level, double x, double y, double z,
                                           double xSpeed, double ySpeed, double zSpeed,
                                           SpriteSet sprite)
    {
        super(level, x, y, z, sprite.first());

        this.layer = SingleQuadParticle.Layer.bySprite(sprite.first());

        this.gravity = 1.0F;
        this.quadSize /= 2.0F;

        this.xd = xSpeed;
        this.yd = ySpeed + 0.1D;
        this.zd = zSpeed;
        this.hasPhysics = true;
        this.lifetime = 20 + this.random.nextInt(10);
    }

    @Override
    protected SingleQuadParticle.@NotNull Layer getLayer()
    {
        return this.layer;
    }

    @Override
    public void tick()
    {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;

        if (this.age++ >= this.lifetime) this.remove();
        else
        {
            this.yd -= 0.04 * this.gravity;
            this.move(this.xd, this.yd, this.zd);
            this.xd *= 0.98;
            this.yd *= 0.98;
            this.zd *= 0.98;

            if (this.onGround)
            {
                this.xd *= 0.7;
                this.zd *= 0.7;
            }
        }
    }

    public record Provider(SpriteSet spriteSet) implements ParticleProvider<@NotNull SimpleParticleType>
    {

        @Override
        public @NotNull Particle createParticle(SimpleParticleType simpleParticleType, @NotNull ClientLevel clientLevel,
                                                double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed, @NotNull RandomSource randomSource) {
            return new AVBlockBreakParticleTemplate(clientLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed, this.spriteSet);
        }
    }
}