package pertemuan_4;

public class nilaiModel {
    public static void main(String[] args) {
        nilai nilai = new nilai();
        String nim = "123456789";
        String nama = "John Doe";
        nilai.nilaiUts = 80.0f;
        nilai.nilaiTugas = 75.0f;
        nilai.nilaiUas = 90.0f;


        // Cetak nilai, nilai huruf, dan predikat
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        nilai.cetakNilai();

    }
}
