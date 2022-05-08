package net.mcsmp.mod.registry.gui.screens;

import com.mojang.blaze3d.systems.RenderSystem;

import net.mcsmp.mod.mcsmp;
import net.mcsmp.mod.registry.blocks.entity.dimensional_property_fuser_entity;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class dimensional_property_fuser_screen extends HandledScreen<dimensional_property_fuser_screenhandler>{

    private static final Identifier TEXTURE = new Identifier(mcsmp.MOD_ID, "textures/gui/inventory/dimensional_property_fuser.png");
    private dimensional_property_fuser_entity entity;

    public dimensional_property_fuser_screen(dimensional_property_fuser_screenhandler handler,PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }
    
    @Override
    protected void init() {
        super.init();
        // Center the title
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        int venergy = 1;//entity.venergy;
        
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
        this.textRenderer.draw(matrices, String.valueOf(venergy), x + 44, y + 53, 4210752);
    //    if(handler.isLightningStorm()) {
    //        this.drawTexture(matrices, x + 26, y + 31, 176, 0, 28, 36);
    //    }
    
        if(handler.isCrafting()) {
            int progress = handler.getScaledProgress();
            this.drawTexture(matrices, x + 151, y + 24, 192, 63, 7, progress);
        }
        ///TODO Fix this so it displays VEnergy Properly
        this.drawTexture(matrices, x + 19, y + 24, 184, 25, 7, venergy);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
    
}
