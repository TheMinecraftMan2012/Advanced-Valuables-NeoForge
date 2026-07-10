package net.neoorangepanda.advancedvaluables.AV_Libraries.Items;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HammerItem extends Item
{
    public HammerItem(Properties properties)
    {
        super(properties);
    }

    // -- Help taken from Kaupenjoe. See https://youtu.be/-EuJTKoLzlM?si=wl433_BoUGwaIJzc -- //

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayer player)
    {
        List<BlockPos> positions = new ArrayList<>();

        BlockHitResult traceResult = player.level().clip(new ClipContext(player.getEyePosition(1f),
                (player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
                ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));

        if (traceResult.getDirection() == Direction.DOWN || traceResult.getDirection() == Direction.UP)
        {
            for (int x = -range - 2; x <= range; x++)
            {
                for (int y = -range - 2; y <= range; y++)
                {
                    positions.add(new BlockPos(initialBlockPos.getX() + (x + 1), initialBlockPos.getY(), initialBlockPos.getZ() + (y + 1)));
                }
            }
        }

        if (traceResult.getDirection() == Direction.NORTH || traceResult.getDirection() == Direction.SOUTH)
        {
            for (int x = -range - 2; x <= range; x++)
            {
                for (int y = -range - 2; y <= range; y++)
                {
                    positions.add(new BlockPos(initialBlockPos.getX() + (x + 1), initialBlockPos.getY() + (y + 1), initialBlockPos.getZ()));
                }
            }
        }

        if (traceResult.getDirection() == Direction.EAST || traceResult.getDirection() == Direction.WEST)
        {
            for (int x = -range - 2; x <= range; x++)
            {
                for (int y = -range - 2; y <= range; y++)
                {
                    positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + (y + 1), initialBlockPos.getZ() + (x + 1)));
                }
            }
        }

        return positions;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltipAdder, TooltipFlag flag)
    {
        tooltipAdder.accept(Component.literal("MINE 5x5 BLOCKS ALTOGETHER!!"));
    }
}
