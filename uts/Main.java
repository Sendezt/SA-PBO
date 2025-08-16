package uts;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Yaris", 1.5f, 4);

        System.out.println("Nama           : " + car.getName());
        System.out.println("Volume Mesin   : " + car.getEngineVolume() + "L");
        System.out.println("Deskripsi      : " + car.describe());
        System.out.println("Jumlah Pintu   : " + car.getNumDoors());
    }
}
