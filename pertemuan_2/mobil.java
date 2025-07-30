package pertemuan_2;

public class mobil {
    int roda = 4;
    int body = 1;
    static int mesin = 1; // class variable
    static void maju(){
        System.out.println("Mobil maju");
    }

    void mundur(){
        System.out.println("Mobil mundur");
    }

    void belok(){
        System.out.println("Mobil belok");
    }
}
