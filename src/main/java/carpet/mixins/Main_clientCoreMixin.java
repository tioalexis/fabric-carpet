package carpet.mixins;

import carpet.CarpetServer;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public class Main_clientCoreMixin
{
    @Inject(method = "main", at = @At("HEAD"))
    private static void onServerStarted(String[] args, CallbackInfo ci)
    {
        CarpetServer.onGameStarted();
    }
}
