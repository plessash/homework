package dz_4.ArrayListCustom;

public class MyArrayList {
    static Object[] array = new Object[10];
    private int size = 0;

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

    public void addObject(Object[] objects){
        for (int i = 0; i <objects.length ; i++) {
            if (size == array.length) {
                Object[] newArray = new Object[array.length * 2];
                for (int j = 0; j < array.length; j++) {
                    newArray[j] = array[j];
                }
                array = newArray;
            }
            array[size]=objects[i];
            size++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void removeAll() {
        Object[] newArray = new Object[10];
        array = newArray;
    }
}


