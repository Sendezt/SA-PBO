package pertemuan_3;

public class bicycleDemo {
    public static void main(String[] args) {
        // Create an object of bicycle
        bicycle bike = new bicycle();

        bike.speed = 10;
        bike.gear = 2;

        // Call methods to change gear and speed
        bike.changeGear(2);
        bike.speedUp(10);
    }
}
