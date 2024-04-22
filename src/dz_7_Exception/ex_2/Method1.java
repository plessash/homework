package dz_7_Exception.ex_2;
public class Method1 {
    public boolean isEven(int value) throws CustomException, CustomException2 {
        boolean isEven;
        if (isEven = (value % 2) == 0) {
            return isEven;
        } else {
            throw new CustomException("Число не четное!");
        }
    }
}