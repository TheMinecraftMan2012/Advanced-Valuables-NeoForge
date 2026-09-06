package net.neoorangepanda.advancedvaluables.AV_Networking.Payloads;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public record SetThunderCountPayload(int count) implements CustomPacketPayload
{
    public static final Type<@NotNull SetThunderCountPayload> TYPE =
            new Type<>(Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "set_thunder_count"));

    public static final StreamCodec<@NotNull ByteBuf, @NotNull SetThunderCountPayload> STREAM_CODEC =
            StreamCodec.composite(ByteBufCodecs.VAR_INT, SetThunderCountPayload::count, SetThunderCountPayload::new);

    @Override
    public Type<? extends @NotNull CustomPacketPayload> type()
    {
        return TYPE;
    }
}
