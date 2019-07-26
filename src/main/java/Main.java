import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        String temp = "Hello, GG";

        get("/users/:id", (req, res) -> {
            return "hello, world!";
        });
        get("/teams/:id", (req, res) -> {
            return "hello, slightly different world!";
        });
        post("/teams/:id", (req, res) -> {
            return "posted, yo" + temp;
        });

    }
}
