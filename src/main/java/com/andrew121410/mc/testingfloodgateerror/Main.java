package com.andrew121410.mc.testingfloodgateerror;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register HasFloodgateCMD
        new HasFloodgateCMD(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
