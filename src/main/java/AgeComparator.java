import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Float.compare(o2.getYearOfBirth(), o1.getYearOfBirth());
    }
}
