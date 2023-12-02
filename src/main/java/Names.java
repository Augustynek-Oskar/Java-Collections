import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

//        for (String name : names){
//            System.out.println(name);
//        }
        showAllElementsOfArrayList(names);
    }
    public static void showAllElementsOfArrayList (List nameOfArrayList){
        for (Object elements : nameOfArrayList){
            System.out.println(elements);
        }
    }
    public static void showListElementsWithoutDuplicates (List nameOfArrayList){
        for (Object elements : nameOfArrayList){
            if (nameOfArrayList.contains(elements)  ){


            }
        }
    }
}
