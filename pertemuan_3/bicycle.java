package pertemuan_3;

public class bicycle {
    int speed;
    int gear;

    // Method
    void changeGear(int newValue) {
        gear = gear + newValue;
        System.out.println("\nGear " + gear);
    }

    void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("\nSpeed " + speed);
    }
}
