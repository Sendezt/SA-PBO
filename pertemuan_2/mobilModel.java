package pertemuan_2;

public class mobilModel {
    public static void main(String[] args) {
        mobil avanza = new mobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Jumlah roda: " + avanza.roda);
        System.out.println("Jumlah body: " + avanza.body);
        System.out.println("Jumlah mesin: " + avanza.mesin);
        
    }
}
