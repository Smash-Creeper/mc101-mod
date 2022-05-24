package net.smashcreeper.mcsmp.screens;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.smashcreeper.mcsmp.ModInit;

public class DimensionalPropertyFuserScreen extends HandledScreen<DimensionalPropertyFuserScreenHandler>{

    private static final Identifier TEXTURE = new Identifier(ModInit.MOD_ID, "textures/gui/inventory/dimensional_property_fuser.png");

    public DimensionalPropertyFuserScreen(DimensionalPropertyFuserScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
    
    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        if(handler.isCrafting()) {
            drawTexture(matrices, x + 151, y + 24, 193, 25 + 38 - handler.getScaledProgress(), 7, handler.getScaledProgress());
        }

        if(handler.hasFuel()) {
            drawTexture(matrices, x + 19, y + 24 + 14 - handler.getScaledFuelProgress(), 184, 63 - handler.getScaledFuelProgress(), 7, handler.getScaledFuelProgress());
        }
    }
    
    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
