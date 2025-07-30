package pertemuan_2;

public class nilaiModel {
    public static void main(String[] args) {
        nilai mahasiswa = new nilai();
        mahasiswa.nim = "A11.2022.14719";
        mahasiswa.nama = "Bima Afkanur Rifqi";
        mahasiswa.nilaiUts = 80;
        mahasiswa.nilaiTugas = 85;
        mahasiswa.nilaiUas = 90;

        mahasiswa.hitungNilai();
        mahasiswa.cetakNilai();
    }
}
