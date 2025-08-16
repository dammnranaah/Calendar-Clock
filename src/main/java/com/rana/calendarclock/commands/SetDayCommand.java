package com.rana.calendarclock.commands;

import com.rana.calendarclock.events.CalendarManager;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class SetDayCommand {
    public static void register(com.mojang.brigadier.CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("setday")
            .requires(source -> source.hasPermissionLevel(2))
            .then(argument("day", IntegerArgumentType.integer(1))
                .executes(context -> {
                    int newDay = IntegerArgumentType.getInteger(context, "day");
                    CalendarManager.getInstance().setCurrentDay(newDay);
                    context.getSource().sendMessage(Text.literal("Set world day to " + newDay));
                    return 1;
                })
            )
        );
    }
}
