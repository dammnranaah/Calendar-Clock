package com.rana.calendarclock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class CalendarClockMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            CalendarManager.getInstance().init(server);
        });
        
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            CalendarManager.getInstance().tick();
        });
        
        CommandRegistry.registerCommands();
    }
}
