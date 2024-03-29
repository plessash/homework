package dz_1.ex03;
public class motorcycles {
    String type;
    @Override
    public String toString() {
        return "motorcycles{" +
                "type='" + type + '\'' +
                ", max_speed='" + maxSpeed + '\'' +
                '}';
    }
    int maxSpeed;
    public motorcycles(String type, int max_speed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
