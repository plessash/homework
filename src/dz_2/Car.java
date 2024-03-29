package dz_2;
public class Car {
    private float fuelTank;
    public float getFuelTank() {
        return fuelTank;
    }
    @Override
    public String toString() {
        return "Car{" +
                "fuelTank=" + fuelTank +
                ", category='" + category + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", seeds=" + seeds +
                ", lock=" + lock +
                '}';
    }
    public Car(float fuelTank, String category, Engine engine, Wheels wheels, Seeds seeds, Lock lock) {
        this.fuelTank = fuelTank;
        this.category = category;
        this.engine = engine;
        this.wheels = wheels;
        this.seeds = seeds;
        this.lock = lock;
    }
    public String getCategory() {
        return category;
    }
    private String category;
    private Engine engine;
    private Wheels wheels;
    private Seeds seeds;
    private Lock lock;

    public boolean isKeyValid(Driver driver) {
        int a = this.lock.getKeyValueLock();
        int b = driver.getKeyValue();
        return a == b;
    }
    public String IsValueCategory() {
        String a = this.getCategory();
        return getCategory();
    }
    public boolean isDriverCanDriveACar(Driver driver) {
        String c = this.getCategory();
        String e = driver.getCategory();
        return c == e;
    }
    public int amountSeeds() {
        int z = seeds.getNumberOfSeeds();
        return seeds.getNumberOfSeeds();
    }
    public float amountFuel() {
        float v = this.getFuelTank();
        return getFuelTank();
    }
}

