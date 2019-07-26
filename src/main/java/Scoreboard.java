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

    public void game(Player yellowOffense,
                         Player yellowDefense,
                         Player blackOffense,
                         Player blackDefense){
        calculateWin(yellowOffense);
        calculateWin(yellowDefense);
        calculateLoss(blackOffense);
        calculateLoss(blackDefense);
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

    public List<Player> getAllPlayers(){
        return competitors;
    }

    public Player getPlayerByName(String fullName){
        Player playerToReturn = new Player("not", "found");
        for(int i = 0; i < competitors.size(); i++){
            if(competitors.get(i).getFullName().equals(fullName)){
                playerToReturn = competitors.get(i);
            }
        }
        return playerToReturn;
    }
}
