package com.rana.calendarclock.commands;

import com.rana.calendarclock.events.CalendarManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import static net.minecraft.server.command.CommandManager.literal;

public class TodayCommand {
    public static void register(com.mojang.brigadier.CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("today")
            .executes(context -> {
                String date = CalendarManager.getInstance().getFormattedDate();
                context.getSource().sendMessage(Text.literal(date));
                return 1;
            })
        );
    }
}
