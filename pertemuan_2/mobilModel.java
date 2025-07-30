package pertemuan_2;

public class mobilModel {
    public static void main(String[] args) {
        mobil avanza = new mobil();
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        avanza.cetakRoda("Avanza", 4);
        avanza.cetakRoda("Xenia", 4);
        avanza.cetakMesin("Avanza", 1);
        avanza.cetakMesin("Xenia", 1);
        avanza.cetakRoda("Avanza", 5);
        avanza.cetakRoda("Xenia", 4);
        avanza.cetakMesin("Avanza", 9);
        avanza.cetakMesin("Xenia", 9);
        avanza.cetakMesin("Avanza", 9);
        avanza.cetakMesin("Xenia", 9);
        avanza.matikanMobil("Avanza Silver");
    }
}
