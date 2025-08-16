package pertemuan_5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    static Scanner input = new Scanner(System.in);

    // Method untuk menampilkan hasil operasi
    public static void tampilkanHasil(String operasi, ArrayList<Integer> hasil) {
        System.out.println("\nHasil " + operasi + ":");
        for (int i = 0; i < hasil.size(); i++) {
            System.out.println("Index ke " + i + " = " + hasil.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        // Input nilai 1
        System.out.println("\nInput Nilai 1");
        for (int i = 0; i < n; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai1.add(input.nextInt());
        }

        // Input nilai 2
        System.out.println("\nInput Nilai 2");
        for (int i = 0; i < n; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai2.add(input.nextInt());
        }

        // Operasi penjumlahan
        ArrayList<Integer> jumlah = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        }
        tampilkanHasil("Penjumlahan", jumlah);

        // Operasi pengurangan
        ArrayList<Integer> kurang = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            kurang.add(nilai1.get(i) - nilai2.get(i));
        }
        tampilkanHasil("Pengurangan", kurang);

        // Operasi perkalian
        ArrayList<Integer> kali = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            kali.add(nilai1.get(i) * nilai2.get(i));
        }
        tampilkanHasil("Perkalian", kali);

        // Operasi pembagian
        ArrayList<Double> bagi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nilai2.get(i) != 0) {
                bagi.add((double) nilai1.get(i) / nilai2.get(i));
            } else {
                bagi.add(Double.NaN); // pembagian dengan 0
            }
        }

        System.out.println("\nHasil Pembagian:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index ke " + i + " = " + bagi.get(i));
        }
    }
}
