public class ArrayBasedList implements OwnList{
    public static void main(String[] args) {
        ArrayBasedList array = new ArrayBasedList();
        System.out.println(array.size);
    }
    Integer[] array;
    int size;
    final int ARRAY_CAPACITY = 5;


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
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }
}
