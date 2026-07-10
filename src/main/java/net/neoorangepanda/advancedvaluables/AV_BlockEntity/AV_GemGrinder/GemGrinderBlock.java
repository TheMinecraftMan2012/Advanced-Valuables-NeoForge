package net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_GemGrinder;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import javax.annotation.Nullable;

public class GemGrinderBlock extends BaseEntityBlock
{
    public static final MapCodec<GemGrinderBlock> CODEC = simpleCodec(GemGrinderBlock::new);
    public static final VoxelShape VOXEL_SHAPE = Block.box(1.0, 0, 1.0, 15.0, 11.0, 15.0);

    public GemGrinderBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec()
    {
        return CODEC;
    }

    @Override
    protected RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return VOXEL_SHAPE;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        return new GemGrinderBlockEntity(blockPos, blockState);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult)
    {
        if (!level.isClientSide())
        {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof GemGrinderBlockEntity gemGrinderBlockEntity)
            {
                ((ServerPlayer) player).openMenu(new SimpleMenuProvider(gemGrinderBlockEntity, Component.literal("Gem Grinder")), pos);
            }
            else
            {
                throw new IllegalStateException("container provider missing");
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType)
    {
        if (level.isClientSide()) return null;

        return createTickerHelper(blockEntityType, AdvancedValuables_Entities.GEM_GRINDER_BE.get(),
                (level1, blockPos, blockState, gemGrinderBlockEntity) -> gemGrinderBlockEntity.tick(level1, blockPos, blockState));
    }
}
