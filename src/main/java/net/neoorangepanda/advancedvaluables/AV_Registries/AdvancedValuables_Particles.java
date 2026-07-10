package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

import java.util.function.Supplier;

public class AdvancedValuables_Particles
{
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPE = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, AdvancedValuables.MOD_ID);

    public static final Supplier<SimpleParticleType> RED_SAPPHIRE_PARTICLES = PARTICLE_TYPE.register("red_sapphire_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> BLUE_SAPPHIRE_PARTICLES = PARTICLE_TYPE.register("blue_sapphire_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> GREEN_SAPPHIRE_PARTICLES = PARTICLE_TYPE.register("green_sapphire_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> RED_GARNET_PARTICLES = PARTICLE_TYPE.register("red_garnet_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> BLUE_GARNET_PARTICLES = PARTICLE_TYPE.register("blue_garnet_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> PINK_GARNET_PARTICLES = PARTICLE_TYPE.register("pink_garnet_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> YELLOW_GARNET_PARTICLES = PARTICLE_TYPE.register("yellow_garnet_particles", () -> new SimpleParticleType(true));

    public static final Supplier<SimpleParticleType> FUSION_GEM_PARTICLES = PARTICLE_TYPE.register("fusion_gem_particles", () -> new SimpleParticleType(true));
    public static final Supplier<SimpleParticleType> RUBY_PARTICLES = PARTICLE_TYPE.register("ruby_particles", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus)
    {
        PARTICLE_TYPE.register(eventBus);
    }
}
