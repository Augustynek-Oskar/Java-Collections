import java.util.*;

public class ListOfPeople {
    public static void main(String[] args) {
        LinkedList <Person> person = new LinkedList<>();
        person.add(new Person("Adam", "Nowak", 1999, 185, 87));
        person.add(new Person("Jan", "Kowalski", 2002, 178, 75));
        person.add(new Person("Kacper", "Bętkowski", 1998, 173, 70));
        person.add(new Person("Michał", "Fąk", 2005, 190, 83));

        List <Person> people = new ArrayList<>();
        people.add(new Person("Adam", "Nowak", 1999, 185, 87));
        people.add(new Person("Jan", "Kowalski", 2002, 178, 75));
        people.add(new Person("Kacper", "Bętkowski", 1998, 173, 70));
        people.add(new Person("Michał", "Fąk", 2005, 190, 83));

        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println(people.get(2));
        System.out.println(people.get(3));

    }
}
class PersonComparator implements java.util.Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getAge() - b.getAge();
    }
}
