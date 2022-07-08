import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap = new HashMap<>();

    public VehicleRegistry() {

    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.hashmap.containsKey(licensePlate)) {
            this.hashmap.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        if (!(this.hashmap.containsKey(licensePlate))) {
            return null;
        }
        return this.hashmap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.hashmap.containsKey(licensePlate)) {
            return false;
        } else {
            this.hashmap.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate i : this.hashmap.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {

        ArrayList<String> printed = new ArrayList<>();

        for (String owner : this.hashmap.values()) {
            if (printed.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            printed.add(owner);
        }
    }

}
