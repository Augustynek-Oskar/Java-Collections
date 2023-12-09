import java.util.*;

public class ListOfPeople {
    public static void main(String[] args) {
        HeightComparator heightComparator = new HeightComparator();
        WeightComparator weightComparator = new WeightComparator();


        List <Person> people = new ArrayList<>();

        people.add(new Person("Adam", "Nowak", 1999, 185, 87));
        people.add(new Person("Jan", "Kowalski", 2002, 178, 75));
        people.add(new Person("Kacper", "Bętkowski", 1998, 173, 70));
        people.add(new Person("Michał", "Fąk", 2005, 190, 83));

        Collections.sort(people, heightComparator);
        System.out.println("Sorted from shortest to tallest: " + people);

        Collections.sort(people, weightComparator);
        System.out.println("Sorted from heaviest to lightest: " + people);

    }
}
