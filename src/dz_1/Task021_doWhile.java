package dz_1;
public class Task021_doWhile {       // do while
    public static void main(String[] args) {
        String str1 = "первый";
        String str2 = "второй";
        String str3 = "третий";
        String str4 = null;
        String str5 = "пятый";
        String[] strings = new String[]{str1,str2,str3,str4,str5};
        int length = strings.length;
    int i=0;
    do{
        System.out.println(strings[i]);
        i++;
        }
    while (i<strings.length);
    }
}
