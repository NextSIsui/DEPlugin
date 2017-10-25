package com.gmail.nextsisui.deplugin.deplugin.Game;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {

    private List<String> teamNameList;
    private Map<String , List<Player>> teamMember = new HashMap<>();
    private int amountOfMember;

    public Team(List<String> teamNameList, int amountOfMenber){
        this.teamNameList = teamNameList;
        this.amountOfMember = amountOfMenber;
    }

    public List<String> getTeamNameList() {
        return teamNameList;
    }

    public int getAmountOfMenber() {
        return amountOfMember;
    }

    public List<Player> getTeamMember(String teamName) {
        return teamMember.get(teamName);
    }

    public void addTeamMember(String teamName, Player player){
        if(teamMember.get(teamName) != null){
            teamMember.get(teamName).add(player);
        }else{
            teamMember.put(teamName, new ArrayList<>());
            teamNameList.add(teamName);
            teamMember.get(teamName).add(player);
        }
    }

    public void addTeam(String teamName) {
        teamNameList.add(teamName);
    }
}
