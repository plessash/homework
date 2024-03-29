package dz_1.ex03;
public class Task_3 {
static Object[] new_objects = {new House("Chkalova",2), new motorcycles("cross", 120),
            new Auto("black","golf")};

    public static void main(String[] args) {
        for (int i = 0; i < new_objects.length; i++) {
            System.out.println(new_objects[i]);
        }
    }
}
