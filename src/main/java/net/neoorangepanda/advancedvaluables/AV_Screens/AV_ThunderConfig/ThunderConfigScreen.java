package net.neoorangepanda.advancedvaluables.AV_Screens.AV_ThunderConfig;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoorangepanda.advancedvaluables.AV_Networking.Payloads.SetThunderCountPayload;

public class ThunderConfigScreen extends Screen
{
    private final int initialValue;
    private EditBox countBox;

    public ThunderConfigScreen(int initialValue)
    {
        super(Component.literal("Sparkite Staff Settings"));
        this.initialValue = initialValue;
    }

    @Override
    protected void init()
    {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        this.countBox = new EditBox(this.font, centerX - 100, centerY - 10, 200, 20, Component.literal("Thunder Count"));
        this.countBox.setValue(Integer.toString(initialValue));
        this.countBox.setMaxLength(3);
        this.countBox.setFilter(s -> s.isEmpty() || s.matches("\\d{0,3}"));
        this.addRenderableWidget(this.countBox);
        this.setInitialFocus(this.countBox);

        this.addRenderableWidget(Button.builder(Component.literal("Save"), _ -> save()).bounds(centerX - 100, centerY + 20, 95, 20).build());
        this.addRenderableWidget(Button.builder(Component.literal("Cancel"), _ -> onClose()).bounds(centerX + 5, centerY + 20, 95, 20).build());
    }

    private void save()
    {
        int value;
        try {
            value = Integer.parseInt(this.countBox.getValue().trim());
        } catch (NumberFormatException e) {
            value = 1;
        }
        value = Mth.clamp(value, 1, 64);

        ClientPacketDistributor.sendToServer(new SetThunderCountPayload(value));
        this.onClose();
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick)
    {
        super.extractBackground(graphics, mouseX, mouseY, partialTick);
    }

    @Override
    public void extractRenderState(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick)
    {
        super.extractRenderState(graphics, mouseX, mouseY, partialTick);
        graphics.centeredText(this.font, this.title, this.width / 2, this.height / 2 - 30, 0xFFFFFF);
    }

    @Override
    public boolean isPauseScreen()
    {
        return false;
    }
}