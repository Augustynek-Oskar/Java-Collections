public class Person{
    String name;
    String surname;
    int yearOfBirth;
    float height;

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

    float weight;

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

}
