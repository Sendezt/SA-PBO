package uts;

public class MotorVehicle extends Vehicle {
    protected int number_of_wheels;
    protected float engine_volume;

    public MotorVehicle(String name) {
        super(name);
    }

    public String honk_horn() {
        return "Beep!";
    }
}
