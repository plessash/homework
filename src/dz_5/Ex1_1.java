package dz_5;

public class Ex1_1 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + "мыла" + "раму";
        str1 = str2;
        if (str1 == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}