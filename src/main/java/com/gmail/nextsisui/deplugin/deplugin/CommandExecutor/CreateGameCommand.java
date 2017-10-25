package com.gmail.nextsisui.deplugin.deplugin.CommandExecutor;

import com.gmail.nextsisui.deplugin.deplugin.Game.Game;
import com.gmail.nextsisui.deplugin.deplugin.GameBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CreateGameCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String string, String[] args){
        if(!command.getName().equalsIgnoreCase("CreateDEGame")) return true;
        GameBuilder.CreateGame(new Game());
        return true;
    }
}
