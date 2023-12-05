public class ArrayBasedList implements OwnList{
    public static void main(String[] args) {
        ArrayBasedList arrayBasedList = new ArrayBasedList();
        arrayBasedList.add(1, 2);
        System.out.println(arrayBasedList.size());
    }
    Integer[] array;
    int size;
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
        array[size++] = element;
    }

    @Override
    public Integer get(int i) {
        return array[i];
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }
}
