package dz_7_Exception.ex_2;

public class CustomException2 extends CustomException {
    int value;

    public CustomException2(String message, int value) {
        super(message);
        this.value = value;
    }
}

