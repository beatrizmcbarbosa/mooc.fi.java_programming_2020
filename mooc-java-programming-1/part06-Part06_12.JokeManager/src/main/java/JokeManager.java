import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {

    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int random = rand.nextInt(jokes.size());

        return jokes.get(random);

    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);

        }
    }

}