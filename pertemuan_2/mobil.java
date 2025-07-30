package pertemuan_2;

public class mobil {
    String namaMobil;
    int roda;
    int body;
    static int mesin = 1; // class variable
    static void maju(){
        System.out.println("Mobil maju..................");
    }

    void mundur(){
        System.out.println("Mobil mundur................");
    }

    void belok(){
        System.out.println("Mobil belok.................");
    }

    void hidupkanMobil(String namaMobil) {
        System.out.println("Mobil " + namaMobil + " dinyalakan");
    }

    void matikanMobil(String namaMobil) {
        System.out.println("Mobil " + namaMobil + " dimatikan");
    }

    void ubahGigi(String namaMobil) {
        System.out.println("Gigi mobil " + namaMobil + " diubah");
    }

    void cetakRoda(String namaMobil, int roda) {
        String label = String.format("%-15s", "Roda " + namaMobil);
    System.out.printf("%s: %2d\n", label, roda);
    }

    void cetakMesin(String namaMobil, int mesin) {
        String label = String.format("%-15s", "Mesin " + namaMobil);
    System.out.printf("%s: %2d\n", label, mesin);
    }
}
