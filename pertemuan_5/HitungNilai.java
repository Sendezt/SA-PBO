package pertemuan_5;

import java.util.Scanner;

// Class untuk menyimpan data nilai
class Nilai {
    String nama;
    int nilai;

    // constructor
    Nilai(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class HitungNilai {
    private Nilai[] daftar;
    private int jumlah;

    // constructor
    public HitungNilai(int jumlah) {
        this.jumlah = jumlah;
        daftar = new Nilai[jumlah];
    }

    // method input data
    public void inputData() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " : ");
            String nama = input.nextLine();
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            int nilai = input.nextInt();
            input.nextLine(); // buang newline

            daftar[i] = new Nilai(nama, nilai);
        }
    }

    // method daftarNilai untuk menampilkan data
    public void daftarNilai() {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + daftar[i].nama + " = " + daftar[i].nilai);
        }
    }

    // main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        input.nextLine(); // buang newline

        HitungNilai program = new HitungNilai(jml);
        program.inputData();
        program.daftarNilai();
    }
}
