import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.getMaxWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suicase (" + totalWeight() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
