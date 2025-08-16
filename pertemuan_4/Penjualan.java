package pertemuan_4;
import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setDataPenjualan(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian(){
        return harga * jumlah;
    }

    public String getBonus(){
        float total = getTotalPembelian();
        if (total >= 500000 && jumlah >= 5) {
            return "Setrika";
        } else if (total >= 100000 && jumlah >= 3) {
            return "Payung";
        } else if( total >= 50000 && jumlah >= 2) {
            return "ball point";
        } else {
            return "Tidak ada bonus";
        }
    }

    public void cetakNota(){
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Terima kasih telah berbelanja di toko kami!");
    }
}