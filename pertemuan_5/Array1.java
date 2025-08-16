package pertemuan_5;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jumlah data
        System.out.print("Jumlah Data : ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        // input nilai array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt();
        }

        // tampilkan isi array
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }

        input.close();
    }
}
