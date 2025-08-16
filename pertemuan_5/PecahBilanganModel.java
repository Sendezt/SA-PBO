package pertemuan_5;
import java.util.Scanner;

public class PecahBilanganModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Bilangan : ");
            int n = scanner.nextInt();

            PecahBilangan pb = new PecahBilangan();

            // Menampilkan 5 per baris
            pb.tampilLimaPerBaris(n);

            System.out.println("--------------------");

            System.out.print("Dipecah : ");
            int k = scanner.nextInt();

            pb.tampilPecah(n, k);

            System.out.print("Apakah Anda ingin mengulang? (ya/tidak): ");
            scanner.nextLine(); // buang newline
            ulang = scanner.nextLine();

        } while (ulang.equalsIgnoreCase("ya"));

        scanner.close();
    }
}
