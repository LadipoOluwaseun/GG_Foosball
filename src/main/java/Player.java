public class Player implements Comparable<Player> {
    String  fullName;
    String nickName;
    Integer rating;
    Integer wins;
    Integer losses;

    public Player (String name, String nickName){
        fullName = name;
        this.nickName = nickName;
        rating = 500;
        wins = 0;
        losses = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getWins() {
        return wins;
    }

    public void incrementWins() {
        this.wins++;
    }

    public Integer getLosses() {
        return losses;
    }

    public void incrementLosses() {
        this.losses++;
    }

    public int compareTo(Player other) {
        return other.getRating() - this.getRating();
    }
}

