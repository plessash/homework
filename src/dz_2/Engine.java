package dz_2;

public class Engine extends Names {
    private int volume;
    private String benzin;

    public Engine(String name, int volume, String benzin) {
        super(name);
        this.volume = volume;
        this.benzin = benzin;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", benzin='" + benzin + '\'' +
                '}';
    }

}
