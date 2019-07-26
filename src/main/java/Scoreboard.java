import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Scoreboard {

    Set<Player> competitors;
    Set<Team> teams;

    public Scoreboard(){
        competitors = new HashSet<>();
        teams = new HashSet<>();
    }

    public void newPlayer(String name){
        Player player = new Player(name);
        competitors.add(player);
    }

    public void newTeam(Player offense, Player defense){
        Team team = new Team(offense, defense);
    }

    public void twoVsTwo(Team yellow, Team black){

    }

    public void calculateWin(){

    }
    public void calulateLoss(){
        
    }
}
