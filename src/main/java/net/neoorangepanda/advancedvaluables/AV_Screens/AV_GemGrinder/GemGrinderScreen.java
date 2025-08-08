package net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;

public class GemGrinderScreen extends AbstractContainerScreen<GemGrinderMenu>
{
    public static final ResourceLocation GUI_TEXTURE = ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "textures/gui/gem_grinder/gem_grinder_gui.png");
    public static final ResourceLocation ARROW_TEXTURE = ResourceLocation.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "textures/gui/arrow_progress.png");

    public GemGrinderScreen(GemGrinderMenu menu, Inventory playerInventory, Component title)
    {
        super(menu, playerInventory, title);

        this.inventoryLabelY = 50;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1)
    {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(RenderType.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256, 256);
        renderProgressArrow(guiGraphics, x, y);
    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y)
    {
        if(menu.isCrafting())
        {
            guiGraphics.blit(RenderType.GUI_TEXTURED, ARROW_TEXTURE, x + 73, y + 22, 0, 0, menu.getScaledArrowProgress(), 16, 24, 16);
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick)
    {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
