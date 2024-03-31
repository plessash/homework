package dz_5.ex1;

public class Ex1_3 {
    public static void main(String[] args) {
        String number = "012312";
        long num = Long.parseLong(number);
        System.out.println(num);

        Long numberLong = Long.valueOf(number);
        long num2 = numberLong.longValue();
        System.out.println(num2);
    }
}