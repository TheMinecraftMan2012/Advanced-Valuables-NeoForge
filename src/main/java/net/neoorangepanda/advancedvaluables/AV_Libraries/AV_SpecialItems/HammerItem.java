package net.neoorangepanda.advancedvaluables.AV_Libraries.AV_SpecialItems;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends DiggerItem
{
    public HammerItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Item.Properties properties)
    {
        super(toolMaterial, BlockTags.MINEABLE_WITH_PICKAXE, attackDamage, attackSpeed, properties);
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
}
