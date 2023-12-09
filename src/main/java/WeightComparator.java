import java.util.Collections;
import java.util.Comparator;

public class WeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Float.compare(o2.getWeight(), o1.getWeight());
    }
}
