package dz_2;
public class LockKey {
    @Override
    public String toString() {
        return "LockKey{" +
                "PINCODE=" + PINCODE +
                '}';
    }
    private final int PINCODE;
    public int getPINCODE() {
        return PINCODE;
    }
    public LockKey(int pincode) {
        PINCODE = pincode;
    }
}
