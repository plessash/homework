package dz_1;
import java.util.Scanner;
class Task013 { //умножение цифр из числа между собой
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 1;
        while (number > 0) {
            sum *= number % 10;
            number /= 10;
        }
        System.out.println("Произведение цифр: " + sum);
    }
}