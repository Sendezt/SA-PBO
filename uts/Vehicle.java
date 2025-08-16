package uts;

public class Vehicle {
    protected String name;
    protected float speed;

    public Vehicle(String name) {
        this.name = name;
    }

    public float move(float distance) {
        return distance / speed;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "This is a vehicle named " + name;
    }
}
