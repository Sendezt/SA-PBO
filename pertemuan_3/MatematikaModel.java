package pertemuan_3;

public class MatematikaModel {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        // Operasi dengan bilangan bulat
        matematika.pertambahan(10, 5);
        matematika.pengurangan(10, 5);
        matematika.perkalian(10, 5);
        matematika.pembagian(10, 5);
        matematika.pembagian(10, 0); // Test pembagian dengan nol

        System.out.println("=====================");

        // Operasi dengan bilangan pecahan
        matematika.pertambahan(10.5f, 5.2f);
        matematika.pengurangan(10.5f, 5.2f);
        matematika.perkalian(10.5f, 5.2f);
        matematika.pembagian(10.5f, 5.2f);
        matematika.pembagian(10.5f, 0); // Test pembagian dengan nol

        System.out.println("=====================");

        // Operasi dengan bilangan desimal
        matematika.pertambahan(10.5, 5.2);
        matematika.pengurangan(10.5, 5.2);
        matematika.perkalian(10.5, 5.2);
        matematika.pembagian(10.5, 5.2);
        matematika.pembagian(10.5, 0); // Test pembagian dengan
    }
}
