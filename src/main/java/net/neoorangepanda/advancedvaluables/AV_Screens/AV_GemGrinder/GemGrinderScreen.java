package net.neoorangepanda.advancedvaluables.AV_Screens.AV_GemGrinder;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.neoorangepanda.advancedvaluables.AdvancedValuables;
import org.jetbrains.annotations.NotNull;

public class GemGrinderScreen extends AbstractContainerScreen<@NotNull GemGrinderMenu>
{
    public static final Identifier GUI_TEXTURE = Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "textures/gui/gem_grinder/gem_grinder_gui.png");
    public static final Identifier ARROW_TEXTURE = Identifier.fromNamespaceAndPath(AdvancedValuables.MOD_ID, "textures/gui/arrow_progress.png");

    public GemGrinderScreen(GemGrinderMenu menu, Inventory playerInventory, Component title)
    {
        super(menu, playerInventory, title);

        this.inventoryLabelY = 50;
    }

    @Override
    public void extractBackground(@NotNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a)
    {
        super.extractBackground(graphics, mouseX, mouseY, a);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        graphics.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256, 256);
        renderProgressArrow(graphics, x, y);
    }

    private void renderProgressArrow(GuiGraphicsExtractor guiGraphics, int x, int y)
    {
        if(menu.isCrafting())
        {
            guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ARROW_TEXTURE, x + 73, y + 22, 0, 0, menu.getScaledArrowProgress(), 16, 24, 16);
        }
    }
}
