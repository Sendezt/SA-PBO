package pertemuan_3;

public class TesStatic1 {
    public static void main(String[] args) {
        // Buat objek dari kelas TesStatic
        TesStatic obj = new TesStatic();

        // Panggil method satu() dari objek
        obj.satu();

        // Panggil method static dua() tanpa objek
        TesStatic.dua();

        // Cetak atribut
        System.out.println("Atribut a: " + obj.a);
        System.out.println("Atribut b: " + TesStatic.b);
        System.out.println("Atribut c: " + obj.c);
        System.out.println("Atribut d: " + obj.d);
        // System.out.println("Atribut e: " + obj.e); // Tidak bisa diakses karena private
    }
}
