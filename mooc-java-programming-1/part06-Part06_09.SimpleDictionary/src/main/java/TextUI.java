import java.util.Scanner;

import javax.xml.transform.Source;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                end();
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();

                if (dictionary.translate(toBeTranslated) != null) {
                    System.out.println("Translation: " + dictionary.translate(toBeTranslated));
                } else {
                    System.out.println("Word " + toBeTranslated + " was not found");
                }
            }

            System.out.println("Uknown command");

        }

    }

    public void end() {
        System.out.println("Bye bye!");
    }

}
