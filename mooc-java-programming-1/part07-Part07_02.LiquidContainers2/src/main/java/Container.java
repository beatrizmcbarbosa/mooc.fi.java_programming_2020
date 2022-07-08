public class Container {
    private int liquidAmount = 0;

    public Container() {
    }

    public int contains() {
        return liquidAmount;

    }

    public void add(int amount) {
        if (this.liquidAmount >= 100) {
            this.liquidAmount = 100;
        } else {
            this.liquidAmount += amount;
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquidAmount -= amount;
        }
        if (this.liquidAmount <= 0) {
            liquidAmount = 0;
        }
    }

    @Override
    public String toString() {
        return liquidAmount + "/100";
    }
}
