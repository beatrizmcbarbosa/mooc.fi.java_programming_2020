import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> todoList = new ArrayList<>();

    public TodoList() {

    }

    public void add(String task) {

        this.todoList.add(task);
    }

    public void print() {
        for (String todoString : todoList) {
            System.out.println((todoList.indexOf(todoString) + 1) + ": " + todoString);
        }
    }

    public void remove(int number) {
        this.todoList.remove(todoList.get(number - 1));
    }

}
