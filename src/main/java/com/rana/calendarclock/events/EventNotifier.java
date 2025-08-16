package com.rana.calendarclock.events;

import net.minecraft.server.MinecraftServer;
import net.minecraft.text.Text;

public class EventNotifier {
    public static void notifyEvent(MinecraftServer server, String message) {
        server.getPlayerManager().broadcast(Text.literal("📅 Event: " + message), false);
    }
}
