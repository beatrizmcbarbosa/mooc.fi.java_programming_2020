import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item returnObject = this.items.get(0);
        for (Item i : this.items) {
            if (returnObject.getWeight() < i.getWeight()) {
                returnObject = i;
            }
        }
        return returnObject;
    }

}