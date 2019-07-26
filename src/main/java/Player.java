public class Player {
    String  fullName;
    Integer rating;
    Integer gamesPlayed;
    Integer wins;

    public Player (String name){
        fullName = name;
        rating = 500;
        gamesPlayed = 0;
        wins = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getRating() {
        return rating;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public Integer getWins() {
        return wins;
    }
}
