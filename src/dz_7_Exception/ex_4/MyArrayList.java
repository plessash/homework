

public class MyArrayList {
    static Object[] array = new Object[10];
    private int size = 0;
    private int index = 0;

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public void add(Object o) {
        array[size] = o;
        size++;
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public int getSize() {
        return size;
    }

    public void addObject(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (size == array.length) {
                Object[] newArray = new Object[array.length * 2];
                for (int j = 0; j < array.length; j++) {
                    newArray[j] = array[j];
                }
                array = newArray;
            }
            array[size] = objects[i];
            size++;
        }
    }

    public Object getIndex(int index) {
        Object o = array[index];
        return o;
    }

    public void removeElement(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void removeAll() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}