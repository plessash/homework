package dz_2;

public class DriverKey {

    @Override
    public String toString() {
        return "DriverKey{" +
                ", KEY=" + KEY +
                '}';
    }
    private int KEY;

    public void setKEY(int KEY) {
        this.KEY = KEY;
    }

    public DriverKey(int key) {
        this.KEY = key;
    }

    public int getKey() {
        return KEY;
    }
}
