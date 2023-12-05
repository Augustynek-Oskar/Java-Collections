import java.util.Arrays;

public class ArrayBasedList implements OwnList{
    public static void main(String[] args) {
        ArrayBasedList arrayBasedList = new ArrayBasedList();
        System.out.println("Czy tablica jest pusta: " + arrayBasedList.isEmpty());
        arrayBasedList.add(1);
        arrayBasedList.add(1, 2);
        System.out.println("Wielkość tablicy: " + arrayBasedList.size());
        System.out.println("Wyswietl element spod ideksu zero: " + arrayBasedList.get(0) + ", i indeksu jeden: "+ arrayBasedList.get(1));
        System.out.println("Czy tablica jest pusta: " + arrayBasedList.isEmpty());
        arrayBasedList.remove(0);
        System.out.println("Wyswietl element spod ideksu zero: " + arrayBasedList.get(0));
        System.out.println("Wielkosc tablicy: " + arrayBasedList.size());
        System.out.println("Pod indeksem jeden jest: " + arrayBasedList.get(1));


    }
    Integer[] array;
    public int size;
    final int ARRAY_CAPACITY = 5;

    public ArrayBasedList() {
        array = new Integer[ARRAY_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        guaranteeCapacityOfArray();
        array[size++] = element;
    }

    @Override
    public Integer get(int i) {
        checkIndex(i);
        return array[i];
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > size) throw  new IndexOutOfBoundsException("Wrong index!");
        guaranteeCapacityOfArray();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[size++] = element;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index > size) throw  new IndexOutOfBoundsException("Wrong index!");
        Integer removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size--] = null;
        return removedElement;
    }

    public void guaranteeCapacityOfArray() {
        if (size == array.length) {
            int newCapacity = array.length + 10;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
    public void checkIndex(int index){
        if (index >= size || index < 0) throw new IndexOutOfBoundsException("Wrong index!");
    }
}
