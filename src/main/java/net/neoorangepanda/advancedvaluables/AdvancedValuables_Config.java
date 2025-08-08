package net.neoorangepanda.advancedvaluables;

import net.neoforged.neoforge.common.ModConfigSpec;

public class AdvancedValuables_Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue VILLAGER_TRADE =
            BUILDER.comment("If enabled you can trade with villagers with 'Advanced Valuables' gemstones").define("AV_VillagerTrades", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}
