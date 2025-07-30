package pertemuan_2;

public class nilai {
    String nim;
    String nama;
    float nilaiUts;
    float nilaiTugas;
    float nilaiUas;
    float pNilaiUts;
    float pNilaiTugas;
    float pNilaiUas;
    float nilaiAkhir;

    void hitungNilai() {
        pNilaiUts = nilaiUts * 0.2f;
        pNilaiTugas = nilaiTugas * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }

    void cetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai UTS: " + nilaiUts + " (Bobot: 20%)" + " = " + pNilaiUts);
        System.out.println("Nilai Tugas: " + nilaiTugas + " (Bobot: 35%)" + " = " + pNilaiTugas);
        System.out.println("Nilai UAS: " + nilaiUas + " (Bobot: 45%)" + " = " + pNilaiUas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
}
}