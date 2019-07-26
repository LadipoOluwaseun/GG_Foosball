

import static spark.Spark.get;

import spark.Request;
import spark.Response;
import spark.Route;

public class Main {
    public static void main(String[] args) {
        get("/users/:id", (req, res) -> {
            return "hello, world!";
        });
        get("/teams/:id", (req, res) -> {
            return "hello, slightly different world!";
        });

    }
}
