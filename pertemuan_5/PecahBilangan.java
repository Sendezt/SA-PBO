package pertemuan_5;

public class PecahBilangan {

    // Menampilkan bilangan 5 per baris
    public void tampilLimaPerBaris(int n) {
        int hitung = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            hitung++;
            if (hitung % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Menampilkan bilangan dipecah sesuai jumlah k per baris
    public void tampilPecah(int n, int k) {
        int hitung = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            hitung++;
            if (hitung % k == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
