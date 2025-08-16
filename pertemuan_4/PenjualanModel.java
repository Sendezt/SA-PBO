package pertemuan_4;
import java.util.Scanner;

public class PenjualanModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            Penjualan penjualan = new Penjualan();

            System.out.print("Masukkan Kode Barang: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            float harga = scanner.nextFloat();
            System.out.print("Masukkan Jumlah Barang: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            penjualan.setDataPenjualan(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("Apakah Anda ingin memasukkan data lagi? (ya/tidak): ");
            ulang = scanner.nextLine();
        } while (ulang == "ya");

        scanner.close();
    }
}
