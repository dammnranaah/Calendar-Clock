package com.rana.calendarclock.events;

import net.minecraft.server.MinecraftServer;
import java.util.HashMap;
import java.util.Map;

public class CalendarManager {
    private static CalendarManager instance;
    private MinecraftServer server;
    private int dayOffset = 0;
    private final Map<Integer, String> events = new HashMap<>();
    
    public static CalendarManager getInstance() {
        if (instance == null) {
            instance = new CalendarManager();
        }
        return instance;
    }
    
    public void init(MinecraftServer server) {
        this.server = server;
    }
    
    public void tick() {
        