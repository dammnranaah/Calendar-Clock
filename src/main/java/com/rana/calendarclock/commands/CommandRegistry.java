package com.rana.calendarclock.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;

public class CommandRegistry {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            DayCountCommand.register(dispatcher);
            TodayCommand.register(dispatcher);
            SetDayCommand.register(dispatcher);
        });
    }
}
