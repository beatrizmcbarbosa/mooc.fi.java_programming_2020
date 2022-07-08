import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add: ");
                String addWord = scanner.nextLine();
                this.todoList.add(addWord);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equals("remove")) {
                System.out.println("which one is removed? ");
                int remove = scanner.nextInt();
                this.todoList.remove(remove);

            }

        }

    }

}
