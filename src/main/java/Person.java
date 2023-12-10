import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name;
    String surname;
    int yearOfBirth;
    float height;
    float weight;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }


    public Person(String name, String surname, int yearOfBirth, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }
    public String toString() {
        return "\nName: " + name + "\nsurname: " + surname + "\nyear of birth: " + yearOfBirth + "\nheight: " + height + "\nweight: " + weight + "\n";
    }


    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.getYearOfBirth(),getYearOfBirth());
    }
}
