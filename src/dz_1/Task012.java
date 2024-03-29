package dz_1;
import java.util.Scanner;
public class Task012 { /*Перемножить числа от 1 до числа (включительно)
введенного через аргумент к исполняемой программе*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.print(result + " ");
    }
}
