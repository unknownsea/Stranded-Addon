package com.example.addon.modules;

import com.example.addon.Stranded;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.MinecraftClient;

public class AutoWB extends Module {

    public AutoWB() {
        super(Stranded.CATEGORY, "auto-wb", "Responds with '/wb' when a chat message contains '/wb'.");
    }

    @EventHandler
    private void onChatReceived(ReceiveMessageEvent event) {
        String message = event.getMessage().getString();
        if (message.contains("/wb")) {
            MinecraftClient.getInstance().player.networkHandler.sendCommand("/wb");
        }
    }
}
