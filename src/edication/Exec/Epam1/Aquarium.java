package edication.Exec.Epam1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private int height;
    private int width;
    private int length;
    private String model;
    private List<String> fishes;

    public void addFish(String name) {
        List<String> packet = this.getFishes();
//        packet.add(name);
        setFishes(packet);
    }

    public List<String> getFishes() {
        return fishes;
    }

    public void setFishes(List<String> fishes) {
        this.fishes = fishes;
    }

    public Aquarium(int height, int width, int length, String model) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.model = model;
    }
    public Aquarium(){

    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", model='" + model + '\'' +
                ", fishes=" + fishes +
                '}';
    }
}

