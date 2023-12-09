import java.util.*;

public class ListOfPeople {
    public static void main(String[] args) {

//
//
//        LinkedList <Person> person = new LinkedList<>();
//
//        person.add(new Person("Adam", "Nowak", 1999, 185, 87));
//        person.add(new Person("Jan", "Kowalski", 2002, 178, 75));
//        person.add(new Person("Kacper", "Bętkowski", 1998, 173, 70));
//        person.add(new Person("Michał", "Fąk", 2005, 190, 83));

        List <Person> people = new ArrayList<>();

        people.add(new Person("Adam", "Nowak", 1999, 185, 87));
        people.add(new Person("Jan", "Kowalski", 2002, 178, 75));
        people.add(new Person("Kacper", "Bętkowski", 1998, 173, 70));
        people.add(new Person("Michał", "Fąk", 2005, 190, 83));

        System.out.println("unsorted: " + people);

        HeightComparator heightComparator = new HeightComparator();

        Collections.sort(people, heightComparator);

        System.out.println("sorted " + people);

    }
}
