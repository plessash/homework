package dz_7_Exception.ex_1;
public class TryCatchFinaly {
    public static void main(String[] args) throws ArithmeticException{
        int num = 0;
        int num1 = 5;
        int result;
        try {
            result = num1/num;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
//    try {
//        result = num1/num;
//        System.out.println(result);
//    } finally{
//        if (num==0){
//            num=1;
//        }
//        result = num1/num;
//        System.out.println("Выполняем деление на 1. Результат = " + result);
//    }
        try{
            result = num1/num;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Введите число отличное от 0");
        }
    }

    }

