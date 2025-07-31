package pertemuan_3;

public class Matematika {
    int hasil;
    float hasilFloat;
    double hasilDouble;

    void pertambahan(int a, int b) {
        hasil = a + b;
        System.out.println("Pertambahan : " + " + " + a  + " + " + b + " = " + hasil);
    }

    void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Pengurangan: " + " + " + a  + " - " + b + " = " + hasil);
    }

    void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Perkalian: " + " + " + a  + " X " + b + " = " + hasil);
    }

    void pembagian(int a, int b) {
        if (b != 0) {
            hasil = a / b;
            System.out.println("Pembagian: " + " + " + a  + " : " + b + " = " + hasil);
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    void pertambahan(float a, float b) {
        hasilFloat = a + b;
        System.out.println("Penjumlahan float: " + " + " + a  + " + " + b + " = " + hasilFloat);
    }

    void pengurangan(float a, float b) {
        hasilFloat = a - b;
        System.out.println("Pengurangan float: " + " + " + a  + " - " + b + " = " + hasilFloat);
    }

    void perkalian(float a, float b) {
        hasilFloat = a * b;
        System.out.println("Perkalian float: " + " + " + a  + " X " + b + " = " + hasilFloat);
    }

    void pembagian(float a, float b) {
        if (b != 0) {
            hasilFloat = a / b;
            System.out.println("Pembagian float: " + " + " + a  + " : " + b + " = " + hasilFloat);
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    void pertambahan(double a, double b) {
        hasilDouble = a + b;
        System.out.println("Penjumlahan double: " + " + " + a  + " + " + b + " = " + hasilDouble);
    }

    void pengurangan(double a, double b) {
        hasilDouble = a - b;
        System.out.println("Pengurangan double: " + " + " + a  + " - " + b + " = " + hasilDouble);
    }

    void perkalian(double a, double b) {
        hasilDouble = a * b;
        System.out.println("Perkalian double: " + " + " + a  + " X " + b + " = " + hasilDouble);
    }

    void pembagian(double a, double b) {
        if (b != 0) {
            hasilDouble = a / b;
            System.out.println("Pembagian double: " + " + " + a  + " : " + b + " = " + hasilDouble);
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }
}
}