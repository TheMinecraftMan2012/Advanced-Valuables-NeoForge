package net.neoorangepanda.advancedvaluables.AV_Registries;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public class AdvancedValuables_DataComponent
{
    public static final DeferredRegister.DataComponents DATA_COMPONENTS_TYPES =
            DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, AdvancedValuables.MOD_ID);

    public static final DeferredHolder<@NotNull DataComponentType<?>, @NotNull DataComponentType<@NotNull Integer>> THUNDER_COUNT =
            DATA_COMPONENTS_TYPES.registerComponentType("thunder_count", builder -> builder
                    .persistent(Codec.INT).networkSynchronized(ByteBufCodecs.VAR_INT));


    public static void register(IEventBus eventBus)
    {
        DATA_COMPONENTS_TYPES.register(eventBus);
    }
}
