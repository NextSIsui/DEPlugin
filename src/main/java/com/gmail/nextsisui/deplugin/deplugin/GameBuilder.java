package com.gmail.nextsisui.deplugin.deplugin;

import com.gmail.nextsisui.deplugin.deplugin.Game.Game;
import com.gmail.nextsisui.deplugin.deplugin.Game.GameInfo;
import com.gmail.nextsisui.deplugin.deplugin.Game.Team;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBuilder {

    private World world;
    private String gameName;
    private Team team;
    private List<String> teamNameList;

    public enum TeamNames {
        RedTeam("RedTeam"),
        BlueTeam("BlueTeam"),
        YellowTeam("YellowTeam"),
        GreenTeam("GreenTeam"),
        ;

        private final String teamName;

        TeamNames(final String teamName) {
            this.teamName = teamName;
        }

        @Override
        public String toString() {
            return this.teamName;
        }
    }

    public GameBuilder(World world, String gameName, int amountTeam, int amountTeamMember){
        this.world = world;
        this.gameName = gameName;

        TeamMaker(amountTeam);

        this.team = new Team(teamNameList, amountTeamMember);

        GameInfo gameInfo = new GameInfo(world, gameName, team);
        Game game = new Game(gameInfo);
    }

    public TeamNames getRandomTeam(){
        TeamNames teamName = null;
        while(teamName == null) {
            for (TeamNames tempTeamName : TeamNames.values()) {
                Random random = new Random();
                int ran = random.nextInt(TeamNames.values().length);
                if(ran == 1) teamName = tempTeamName;
            }
        }
        return teamName;
    }

    public void CreateGame(){



    }

    public void TeamMaker(int amountTeam){
        List<String> teamNameList = new ArrayList<>();
        while(teamNameList.size() < amountTeam) {
            String tempTeam = getRandomTeam().toString();
            if(!teamNameList.contains(tempTeam))
                teamNameList.add(tempTeam);
            else
                continue;
        }
        this.teamNameList = teamNameList;
    }

    public void StartGame() {

    }
}
