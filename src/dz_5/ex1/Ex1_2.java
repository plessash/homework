package dz_5.ex1;

import static java.lang.System.*;

public class Ex1_2 {
    public static void main(String[] args) {
String str = "Вывести в консоль строку посимвольно";
char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        }
    }
