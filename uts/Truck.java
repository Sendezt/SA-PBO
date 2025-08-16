package uts;

public class Truck extends MotorVehicle {
    private float horsepower;

    public Truck(String name, float horsepower) {
        super(name);
        this.horsepower = horsepower;
    }

    @Override
    public String describe() {
        return "This is a truck with " + horsepower + " horsepower.";
    }

    @Override
    public String honk_horn() {
        return "HONK HONK!";
    }
}
