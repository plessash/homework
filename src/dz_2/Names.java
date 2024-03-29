package dz_2;
public abstract class Names {    // абстрактный класс для Engine И Wheels
    private String name;
    public Names(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
