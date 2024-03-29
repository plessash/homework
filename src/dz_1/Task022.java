package dz_1;
public class Task022 {  //каждый второй
    public static void main(String[] args) {
        String str1 = "первый";
        String str2 = "второй";
        String str3 = "третий";
        String str4 = null;
        String str5 = "пятый";
        String[] strings = new String[]{str1,str2,str3,str4,str5};
        int length = strings.length;
        for (int i = 0; i <strings.length ; i=i+2) {
            System.out.println(strings[i]);
        }
    }
}
