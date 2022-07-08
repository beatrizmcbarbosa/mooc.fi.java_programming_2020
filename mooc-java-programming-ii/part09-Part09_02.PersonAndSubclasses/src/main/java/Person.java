public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getAddress(String address) {
        return this.address;
    }

    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
}
