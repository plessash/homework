package dz_5.ex1;
public class Ex1_1 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 =  "Мама" + " мыла " + "раму";
        if (str1 == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
