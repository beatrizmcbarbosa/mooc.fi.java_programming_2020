import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public void add(String value) {
        this.values.add(value);
    }

    public boolean isEmpty() {
        if (this.values.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {
        return this.values.remove(values.size() - 1);
    }

}
