package pertemuan_5;

import java.util.Scanner;

public class MatrixMenu {
    static Scanner input = new Scanner(System.in);

    // method untuk input matriks
    public static int[][] inputMatrix(String name) {
        System.out.print("Input baris matrix " + name + " = ");
        int baris = input.nextInt();
        System.out.print("Input kolom matrix " + name + " = ");
        int kolom = input.nextInt();

        int[][] m = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Input elemen matrix " + name + " [" + i + "," + j + "] = ");
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    // method untuk menampilkan matriks
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // method penjumlahan
    public static int[][] tambahMatrix(int[][] A, int[][] B) {
        int baris = A.length;
        int kolom = A[0].length;
        int[][] C = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    // method transpose
    public static int[][] transposeMatrix(int[][] A) {
        int baris = A.length;
        int kolom = A[0].length;
        int[][] T = new int[kolom][baris];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    // method perkalian
    public static int[][] kaliMatrix(int[][] A, int[][] B) {
        int barisA = A.length;
        int kolomA = A[0].length;
        int kolomB = B[0].length;

        int[][] C = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = null, B = null;

        while (true) {
            System.out.println("\n=== MENU MATRIX ===");
            System.out.println("1. Input Matrix A & B");
            System.out.println("2. Penjumlahan Matrix A + B");
            System.out.println("3. Transpose Matrix A");
            System.out.println("4. Perkalian Matrix A * B");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    A = inputMatrix("A");
                    B = inputMatrix("B");
                    break;
                case 2:
                    if (A != null && B != null) {
                        System.out.println("Hasil penjumlahan matriks A + B:");
                        printMatrix(tambahMatrix(A, B));
                    } else {
                        System.out.println("Matrix belum diinput!");
                    }
                    break;
                case 3:
                    if (A != null) {
                        System.out.println("Hasil transpose matrix A:");
                        printMatrix(transposeMatrix(A));
                    } else {
                        System.out.println("Matrix A belum diinput!");
                    }
                    break;
                case 4:
                    if (A != null && B != null) {
                        if (A[0].length == B.length) {
                            System.out.println("Hasil perkalian matriks A * B:");
                            printMatrix(kaliMatrix(A, B));
                        } else {
                            System.out.println("Perkalian tidak bisa dilakukan (jumlah kolom A != baris B)");
                        }
                    } else {
                        System.out.println("Matrix belum diinput!");
                    }
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
