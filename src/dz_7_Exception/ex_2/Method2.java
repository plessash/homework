package dz_7_Exception.ex_2;
public class Method2 extends Method1 {
    public boolean isEven(int value) throws CustomException2 {

        if (value % 10 == 0) {
            System.out.println("Число " +value+ " делится на 10 целочисленно");
            return true;
        } else {
            throw new CustomException2("Число не делится на 10 целочисленно");



        }
    }

}
