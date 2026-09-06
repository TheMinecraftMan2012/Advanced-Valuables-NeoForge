package net.neoorangepanda.advancedvaluables.AV_BlockEntity.AV_FusionGemStation;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FusionGemStationBlockEntityRenderer implements BlockEntityRenderer<@NotNull FusionGemStationBlockEntity, @NotNull FusionGemStationRenderState>
{
    private final ItemModelResolver itemModelResolver;

    public FusionGemStationBlockEntityRenderer(BlockEntityRendererProvider.Context context)
    {
        itemModelResolver = context.itemModelResolver();
    }

    @Override
    public FusionGemStationRenderState createRenderState()
    {
        return new FusionGemStationRenderState();
    }

    @Override
    public void extractRenderState(FusionGemStationBlockEntity blockEntity, FusionGemStationRenderState renderState, float partialTick,
                                   @NotNull Vec3 cameraPosition, @Nullable ModelFeatureRenderer.CrumblingOverlay breakProgress)
    {
        BlockEntityRenderer.super.extractRenderState(blockEntity, renderState, partialTick, cameraPosition, breakProgress);

        renderState.blockEntityLevel = blockEntity.getLevel();
        renderState.rotation = blockEntity.getRenderingRotation();

        itemModelResolver.updateForTopItem(renderState.itemStackRenderState,
                blockEntity.inventory.getResource(4).toStack(), ItemDisplayContext.FIXED, blockEntity.getLevel(), null, 0);
    }

    @Override
    public void submit(FusionGemStationRenderState renderState, PoseStack poseStack, @NotNull SubmitNodeCollector submitNodeCollector, @NotNull CameraRenderState cameraRenderState)
    {
        poseStack.pushPose();

        poseStack.translate(0.5f, 1.30f, 0.5f);
        poseStack.scale(0.5f, 0.5f, 0.5f);
        poseStack.mulPose(Axis.YP.rotationDegrees(renderState.rotation));

        renderState.itemStackRenderState.submit(poseStack, submitNodeCollector, renderState.lightCoords, OverlayTexture.NO_OVERLAY, 0);

        poseStack.popPose();
    }
}