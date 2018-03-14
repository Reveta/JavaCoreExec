package edication.Exec.Moon2;

public class User{

    public String name;
    public double mass;

    public double moonMass() {
        double mass = this.getMass();
        mass = mass / 100 * 17;

        return mass;
    }

    public User(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private double getMass() {
        return mass;
    }

    private void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
