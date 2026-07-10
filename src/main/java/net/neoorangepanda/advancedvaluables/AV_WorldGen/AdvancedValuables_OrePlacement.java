package net.neoorangepanda.advancedvaluables.AV_WorldGen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class AdvancedValuables_OrePlacement
{
    public static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange)
    {
        return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange)
    {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
