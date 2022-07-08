import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke ");
            System.out.println("3 - list jokes" + "\n" + "X - stop");

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                this.jokes.addJoke(joke);

            }
            if (command.equals("2")) {
                System.out.println(jokes.drawJoke());
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();

            }

        }

    }

}
