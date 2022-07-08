import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestpPerson = this.persons.get(0);

        for (Person prs : this.persons) {
            if (shortestpPerson.getHeight() > prs.getHeight()) {
                shortestpPerson = prs;
            }
        }
        return shortestpPerson;

    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestpPerson = this.persons.get(0);

        for (Person prs : this.persons) {
            if (shortestpPerson.getHeight() > prs.getHeight()) {
                shortestpPerson = prs;
            }
        }
        this.persons.remove(shortestpPerson);
        return shortestpPerson;

    }

}
