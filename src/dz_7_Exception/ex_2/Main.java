package dz_7_Exception.ex_2;

public class Main {
    public static void main(String[] args) throws CustomException, CustomException2 {
        Method1 method1 = new Method1(); //является ли число четным
        Method2 method2 = new Method2();//если четное, делится ли на 10 без остатка?
        boolean even = method2.isEven(21);
        System.out.println ("Число четное? = " + even);
    }
}