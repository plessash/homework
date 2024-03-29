package dz_2;

public class Wheels extends Names {
private int radius;

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", season=" + season +
                '}';
    }

    public Wheels(String name, int radius, Season season) {
        super(name);
        this.radius = radius;
        this.season = season;
    }

    private Season season;
    public Wheels(String name) {
        super(name);
    }
}


