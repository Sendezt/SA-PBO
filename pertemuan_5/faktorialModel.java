package pertemuan_5;
import java.util.Scanner;

public class faktorialModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Bilangan : ");
            int n = scanner.nextInt();

            int hasil = 1;
            for (int i = 1; i <= n; i++) {
                hasil *= i;
                if (i > 1) {
                    System.out.println((hasil / i) + " x " + i + " = " + hasil);
                }
            }

            System.out.print("Apakah Anda ingin menghitung faktorial lagi? (ya/tidak): ");
            scanner.nextLine(); // buang newline
            ulang = scanner.nextLine();

        } while (ulang.equalsIgnoreCase("ya"));

        scanner.close();
    }
}
