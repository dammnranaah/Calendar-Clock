package com.rana.calendarclock.commands;

import com.rana.calendarclock.events.CalendarManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import static net.minecraft.server.command.CommandManager.literal;

public class DayCountCommand {
    public static void register(com.mojang.brigadier.CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("daycount")
            .executes(context -> {
                int day = CalendarManager.getInstance().getCurrentDay();
                context.getSource().sendMessage(Text.literal("This world is on Day " + day));
                return 1;
            })
        );
    }
}
