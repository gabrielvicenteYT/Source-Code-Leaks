package com.ihl.client.module;

import com.ihl.client.event.EventHandler;

@EventHandler(events = {})
public class Console extends Module {

    public Console(String name, String desc, Category category, String keybind) {
        super(name, desc, category, keybind);
        initCommands(name.toLowerCase().replaceAll(" ", ""));
    }
}
