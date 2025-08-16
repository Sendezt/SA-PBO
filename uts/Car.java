package uts;

public class Car extends MotorVehicle {
    private int num_doors;

    public Car(String name, float engine_volume, int num_doors) {
        super(name);
        this.engine_volume = engine_volume;
        this.num_doors = num_doors;
    }

    @Override
    public String describe() {
        return "This is a car with " + num_doors + " doors.";
    }

    @Override
    public String honk_horn() {
        return "Beep Beep!";
    }

    public int getNumDoors() {
        return num_doors;
    }

    public float getEngineVolume() {
        return engine_volume;
    }
}
