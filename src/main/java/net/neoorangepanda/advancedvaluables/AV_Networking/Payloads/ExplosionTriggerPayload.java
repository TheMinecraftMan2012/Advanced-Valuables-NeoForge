package net.neoorangepanda.advancedvaluables.AV_Networking.Payloads;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public record ExplosionTriggerPayload() implements CustomPacketPayload
{
    public static final Type<@NotNull ExplosionTriggerPayload> TYPE =
            new Type<>(Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "explosion_trigger"));

    public static final StreamCodec<@NotNull ByteBuf, @NotNull ExplosionTriggerPayload> STREAM_CODEC =
            StreamCodec.unit(new ExplosionTriggerPayload());

    @Override
    public @NotNull Type<? extends @NotNull CustomPacketPayload> type()
    {
        return TYPE;
    }
}
