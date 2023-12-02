import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

//        showAllElementsOfArrayList(names);
//        showListElementsWithoutDuplicates(names);
//        showReversedListContent(names);
        changeElementOfTheList(names, "Anna", "Joanna");

    }

    public static void showAllElementsOfArrayList (List nameOfArrayList){
        for (Object elements : nameOfArrayList) {
            System.out.println(elements);
        }
    }
    public static void showListElementsWithoutDuplicates (List nameOfArrayList) {
        Set <String> set = new LinkedHashSet<>();
        set.addAll(nameOfArrayList);
        nameOfArrayList.clear();
        nameOfArrayList.addAll(set);
        System.out.println(nameOfArrayList);
    }
    public static void showReversedListContent (List nameOfArrayList){
        int arrayListLength = nameOfArrayList.size();
        for (int i = arrayListLength; i > 0; i--){
            System.out.println(nameOfArrayList.get(i - 1));
        }
    }
    public static void changeElementOfTheList (List nameOfArrayList, String toDelete, String toAdd){
        for (int i = 0; i < nameOfArrayList.size(); i++){
            if (nameOfArrayList.get(i).equals(toDelete)){
                int index = nameOfArrayList.indexOf(toDelete);
                nameOfArrayList.remove(toDelete);
                nameOfArrayList.add(index, toAdd);
            }
        }
        System.out.println(nameOfArrayList);
    }
}
