
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);

            if (quantity == 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first >= 100) {
                    first = 100;
                } else if (first + quantity >= 100) {
                    first = 100;
                } else {
                    first += quantity;
                }
            }

            if (command.equals("move")) {

                if (second + quantity >= 100) {
                    second = 100;
                } else if (quantity >= first) {
                    second += first;
                    first = 0;
                } else {
                    second += quantity;
                    first -= quantity;
                }
            }

            if (command.equals("remove")) {
                if (quantity >= second) {
                    second = 0;
                } else {
                    second -= quantity;
                }
            }
        }
    }
}

