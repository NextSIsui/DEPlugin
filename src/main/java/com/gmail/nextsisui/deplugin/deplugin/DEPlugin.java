package com.gmail.nextsisui.deplugin.deplugin;

import com.gmail.nextsisui.deplugin.deplugin.CommandExecutor.CreateGameCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class DEPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("CreateDEGame").setExecutor(new CreateGameCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
