package com.rana.calendarclock.mixin;

import com.rana.calendarclock.util.TimeUtils;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class HudOverlayMixin {
    @Inject(method = "render", at = @At("TAIL"))
    private void renderCustomOverlay(MatrixStack matrices, float tickDelta, CallbackInfo ci) {
    }
}
