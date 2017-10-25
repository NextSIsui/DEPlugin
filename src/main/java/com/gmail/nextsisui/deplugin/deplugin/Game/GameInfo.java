package com.gmail.nextsisui.deplugin.deplugin.Game;

import org.bukkit.World;

public class GameInfo {

    private World world;
    private String gameName;
    private Team team;
    private int currentTime;


    public GameInfo(World world, String gameName, Team team){
        this.world = world;
        this.gameName = gameName;
        this.team = team;
    }
}
