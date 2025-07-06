package dev.enjarai.capefix.mixin;

import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "nl/enjarai/cicada/util/CapeHandler")
public class CapeHandlerMixin {
	@Dynamic
	@Inject(at = @At("HEAD"), method = "Lnl/enjarai/cicada/util/CapeHandler;loadCape()V", remap = false, cancellable = true)
	private void init(CallbackInfo info) {
		info.cancel();
	}
}