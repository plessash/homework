package dz_1.ex03;
public class House {
    String street;
    int number;
    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
    public House(String street, int number) {
        this.street = street;
        this.number = number;
    }
}
