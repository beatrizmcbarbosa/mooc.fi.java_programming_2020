
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput = "The collection " + this.name;

        if (elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        int s = this.elements.size();
        String elementsOfCollection = "";

        int i = 0;
        for (String element : elements) {

            if (i < s - 1) {
                elementsOfCollection = elementsOfCollection + element + "\n";
            } else {
                elementsOfCollection = elementsOfCollection + element;
            }
        }
        if (s == 1) {
            return printOutput + " has " + s + " element:" + "\n" + elementsOfCollection;

        } else {
            return printOutput + " has " + s + " elements:" + "\n" + elementsOfCollection;

        }

    }

}
