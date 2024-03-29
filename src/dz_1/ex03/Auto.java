package dz_1.ex03;
public class Auto {
    String colour;
    String model;
    @Override
    public String toString() {
        return "Auto{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public Auto(String colour, String model) {
        this.colour = colour;
        this.model = model;
    }
}
