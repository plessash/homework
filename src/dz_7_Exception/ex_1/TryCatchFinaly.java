package dz_7_Exception.ex_1;

public class TryCatchFinaly {
    public static void main(String[] args) throws ArithmeticException {
        task1();
       // task2();
       // task3();
    }

    private static int task1() {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль");
        }
        return 0;
    }

    private static int task2() {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
        } finally {
            b = 1;
            int result2 = a / b;
            System.err.println("Ошибка! Деление на 0 невозможно!");
            System.out.println("Значение 0 заменено на 1. Результат = " + result2);
        }
        return 0;
    }

    private static int task3() {
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Введите число отличное от 0");
        }
        return 0;
    }
}
