import java.util.*;

public class Scoreboard {

    List<Player> competitors;
    Set<Team> teams;

    public Scoreboard(){
        competitors = new ArrayList<>();
        teams = new HashSet<>();
    }

    public void newPlayer(String name, String nickName){
        Player player = new Player(name, nickName);
        competitors.add(player);
    }

    public void newTeam(Player offense, Player defense){
        Team team = new Team(offense, defense);
    }

    public void twoVsTwo(Team yellow, Team black, Boolean yellowWinner){
        if(yellowWinner){
            calculateWin(yellow.offense);
            calculateWin(yellow.defense);
            calculateLoss(black.offense);
            calculateLoss(black.defense);
        }
        else{
            calculateWin(black.offense);
            calculateWin(black.defense);
            calculateLoss(yellow.offense);
            calculateLoss(yellow.defense);
        }
    }

    public void calculateWin(Player winner){
        winner.incrementWins();
        winner.setRating(winner.getRating() + 3);
    }

    public void calculateLoss(Player loser){
        loser.incrementLosses();
        loser.setRating(loser.getRating() - 1);
    }

    public List<Player> arrangeByRating(){
        List arrangedCompetitors = new ArrayList();
        //TODO arrange competitors for display
        return competitors;
    }
}
