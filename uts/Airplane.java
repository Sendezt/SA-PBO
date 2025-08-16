package uts;

public class Airplane extends Vehicle {
    private float wingspan;
    private int capacity;

    public Airplane(String name, float wingspan, int capacity) {
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
    }

    private void landing_gear(boolean set) {
        if (set) {
            System.out.println("Landing gear deployed.");
        } else {
            System.out.println("Landing gear retracted.");
        }
    }

    @Override
    public float move(float distance) {
        return distance / (speed + 200); // contoh implementasi
    }

    @Override
    public String describe() {
        return "This is an airplane with capacity of " + capacity + " passengers.";
    }
}
