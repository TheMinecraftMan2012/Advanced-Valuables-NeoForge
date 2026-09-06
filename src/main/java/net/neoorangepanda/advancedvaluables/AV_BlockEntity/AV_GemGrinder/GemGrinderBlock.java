package net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_GemGrinder;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
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
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoorangepanda.advancedvaluables.AV_Registries.AdvancedValuables_Entities;
import org.jetbrains.annotations.NotNull;

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
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec()
    {
        return CODEC;
    }

    @Override
    protected @NotNull RenderShape getRenderShape(@NotNull BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context)
    {
        return VOXEL_SHAPE;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState)
    {
        return new GemGrinderBlockEntity(blockPos, blockState);
    }

    @Override
    public boolean onDestroyedByPlayer(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull  ItemStack toolStack, boolean willHarvest, @NotNull FluidState fluid)
    {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof GemGrinderBlockEntity gemGrinderBlockEntity) gemGrinderBlockEntity.drops();
        return super.onDestroyedByPlayer(state, level, pos, player, toolStack, willHarvest, fluid);
    }

    @Override
    protected@NotNull  InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult)
    {
        if (!level.isClientSide())
        {
            BlockEntity entity = level.getBlockEntity(pos);
            if(entity instanceof GemGrinderBlockEntity gemGrinderBlockEntity)
            {
                player.openMenu(new SimpleMenuProvider(gemGrinderBlockEntity, Component.translatable("block.advancedvaluables.gem_grinder")), pos);
            }
            else
            {
                throw new IllegalStateException("Container provider missing.");
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<@NotNull T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<@NotNull T> blockEntityType)
    {
        if (level.isClientSide()) return null;

        return createTickerHelper(blockEntityType, AdvancedValuables_Entities.GEM_GRINDER_BE.get(),
                (level1, blockPos, blockState, gemGrinderBlockEntity) -> gemGrinderBlockEntity.tick(level1, blockPos, blockState));
    }
}
