package pertemuan_4;

import java.util.Scanner;

public class RumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            // Input nilai a, b, dan c
            System.out.print("Masukkan nilai a: ");
            double a = input.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = input.nextDouble();
            System.out.print("Masukkan nilai c: ");
            double c = input.nextDouble();

            // Hitung determinan
            double D = b * b - 4 * a * c;

            System.out.println("Diskriminan (D) = " + D);

            // Hitung akar-akar berdasarkan nilai D
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Akar-akar real dan berbeda:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println("Akar-akar real dan kembar:");
                System.out.println("x1 = x2 = " + x);
            } else {
                double realPart = -b / (2 * a);
                double imagPart = Math.sqrt(-D) / (2 * a);
                System.out.println("Akar-akar imajiner:");
                System.out.println("x1 = " + realPart + " + " + imagPart + "i");
                System.out.println("x2 = " + realPart + " - " + imagPart + "i");
            }

            // Tanya apakah ingin input data lagi
            System.out.print("Input data lagi [Y/T]? ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");
        input.close();
    }
}
