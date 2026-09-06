package net.neoorangepanda.advancedvaluables.AV_DataGen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.client.data.ParticleDescriptionProvider;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Particles;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_ParticleDescriptionProvider extends ParticleDescriptionProvider
{
    public AdvancedValuables_ParticleDescriptionProvider(PackOutput output)
    {
        super(output);
    }

    @Override
    protected void addDescriptions()
    {
        spriteSet(AdvancedValuables_Particles.RED_SAPPHIRE_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"));
        spriteSet(AdvancedValuables_Particles.BLUE_SAPPHIRE_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"));
        spriteSet(AdvancedValuables_Particles.GREEN_SAPPHIRE_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"));

        spriteSet(AdvancedValuables_Particles.RED_GARNET_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"));
        spriteSet(AdvancedValuables_Particles.BLUE_GARNET_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"));
        spriteSet(AdvancedValuables_Particles.PINK_GARNET_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"));
        spriteSet(AdvancedValuables_Particles.YELLOW_GARNET_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"));

        spriteSet(AdvancedValuables_Particles.FUSION_GEM_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"));
        spriteSet(AdvancedValuables_Particles.RUBY_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"));

        spriteSet(AdvancedValuables_Particles.SPARKITE_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "sparkite"));


        spriteSet(AdvancedValuables_Particles.RED_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_sapphire"));
        spriteSet(AdvancedValuables_Particles.BLUE_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_sapphire"));
        spriteSet(AdvancedValuables_Particles.GREEN_SAPPHIRE_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "green_sapphire"));

        spriteSet(AdvancedValuables_Particles.RED_GARNET_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "red_garnet"));
        spriteSet(AdvancedValuables_Particles.BLUE_GARNET_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "blue_garnet"));
        spriteSet(AdvancedValuables_Particles.PINK_GARNET_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "pink_garnet"));
        spriteSet(AdvancedValuables_Particles.YELLOW_GARNET_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "yellow_garnet"));

        spriteSet(AdvancedValuables_Particles.FUSION_GEM_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "fusion_gem"));
        spriteSet(AdvancedValuables_Particles.RUBY_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "ruby"));

        spriteSet(AdvancedValuables_Particles.SPARKITE_BLOCK_BREAK_PARTICLES.get(), Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "sparkite"));
    }
}
