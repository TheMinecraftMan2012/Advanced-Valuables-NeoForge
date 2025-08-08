package net.neoorangepanda.advancedvaluables.AV_Registries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation.FusionGemStationBlockEntity;
import net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_GemGrinder.GemGrinderBlockEntity;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class AdvancedValuables_Entities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GemGrinderBlockEntity>> GEM_GRINDER_BE =
            BLOCK_ENTITIES.register("gem_grinder_be", () -> new BlockEntityType<GemGrinderBlockEntity>(GemGrinderBlockEntity::new, AdvancedValuables_BlockClass.GEM_GRINDER.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FusionGemStationBlockEntity>> FUSION_GEM_STATION_BE =
            BLOCK_ENTITIES.register("fusion_gem_station_be", () -> new BlockEntityType<FusionGemStationBlockEntity>(FusionGemStationBlockEntity::new, AdvancedValuables_BlockClass.FUSION_GEM_STATION.get()));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
