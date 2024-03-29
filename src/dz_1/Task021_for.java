package dz_1;
public class Task021_for { // с помощью for
    public static void main(String[] args) {
        String str1 = "первый";
        String str2 = "второй";
        String str3 = "третий";
        String str4 = null;
        String str5 = "пятый";
        String[] strings = new String[]{str1,str2,str3,str4,str5};
        int length = strings.length;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        }
    }


