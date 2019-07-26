import java.util.List;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        Scoreboard scoreboard = new Scoreboard();

        // Get all of the users
        get("/users/", (req, res) -> {
            List<Player> players = scoreboard.getAllPlayers();
            res.status(200);
            return convertPlayersToJson(players);
        });

        // Add a user
        post("/user/", (req, res) -> {
            if(scoreboard.getPlayerByName(req.queryParams("name")).getFullName() != "not") {
                res.status(403);
                return "{ \"status\": \"failure\" }";
            }

            scoreboard.newPlayer(req.queryParams("name"), req.queryParams("nickname"));
            res.status(201);
            return convertPlayerToJson(scoreboard.getPlayerByName(req.queryParams("name")));
        });

        // Add a game
        post("/game/", (req, res) -> {
            Player p1 = scoreboard.getPlayerByName(req.queryParams("id1"));
            Player p2 = scoreboard.getPlayerByName(req.queryParams("id2"));
            Player p3 = scoreboard.getPlayerByName(req.queryParams("id3"));
            Player p4 = scoreboard.getPlayerByName(req.queryParams("id4"));
            if(scoreboard.isValidGame(p1, p2, p3, p4)) {
                scoreboard.game(p1, p2, p3, p4);
                res.status(201);
                return "{ \"status\": \"acknowledged\" }";
            }
            else {
                res.status(2403);
                return "{ \"status\": \"failure\" }";
            }

        });

    }

    private static String convertPlayerToJson(Player p) {
        String json = "{ ";
        json += "\"fullName\": \"";
        json += p.getFullName() + "\", ";
        json += "\"nickName\": \"";
        json += p.getNickName() + "\", ";
        json += "\"rating\": ";
        json += p.getRating() + ", ";
        json += "\"wins\": ";
        json += p.getWins() + ", ";
        json += "\"losses\": ";
        json += p.getLosses() + ", ";
        json += "}";

        return json;
    }

    private static String convertPlayersToJson(List<Player> playerList) {
        String json = "{ \"players\": [ ";
        for (Player player: playerList) {
            json += convertPlayerToJson(player);
            json += ", ";
        }
        json += "] }";
        return json;
    }
}
