import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personArrayList;

    public Room() {
        this.personArrayList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personArrayList.add(person);
    }

    public boolean isEmpty() {
        boolean isRoomEmpty = false;

        if (this.personArrayList.isEmpty()) {
            isRoomEmpty = true;
        }
        return isRoomEmpty;
    }

    public ArrayList<Person> getPersons() {
        return this.personArrayList;
    }

    public Person shortest() {
        if (personArrayList.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.personArrayList.get(0);
        for (Person e : personArrayList) {
            if (e.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = e;
            }

        }

        return shortestPerson;
    }
    public Person take() {
        if (this.personArrayList.isEmpty()) {

            return null;
        }

        Person shortestPerson = shortest();

        this.personArrayList.remove(shortestPerson);

        return shortestPerson;

    }

}
