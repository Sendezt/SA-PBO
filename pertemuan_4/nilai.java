package pertemuan_4;

public class nilai {
    float nilaiUts;
    float nilaiTugas;
    float nilaiUas;
    private String nHuruf;
    private String predikat;
    private float pNilaiUts;
    private float pNilaiTugas;
    private float pNilaiUas;
    private float nilaiAkhir;

    void hitungNilai() {
        pNilaiUts = nilaiUts * 0.2f;
        pNilaiTugas = nilaiTugas * 0.35f;
        pNilaiUas = nilaiUas * 0.45f;
        nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }

    char getNilaiHuruf() {
        if (nilaiAkhir >= 85) {
            nHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nHuruf = "D";
        } else {
            nHuruf = "E";
        }
        return nHuruf.charAt(0);
    }

    String getPredikat() {
        switch (getNilaiHuruf()) {
            case 'A':
                predikat = "Sangat Baik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Kurang";
                break;
            default:
                predikat = "Sangat Kurang";
        }
        return predikat;
    }

    public void cetakNilai() {
        hitungNilai();
        System.out.println("Nilai UTS: " + nilaiUts + " (Bobot: 20%)" + " = " + pNilaiUts);
        System.out.println("Nilai Tugas: " + nilaiTugas + " (Bobot: 35%)" + " = " + pNilaiTugas);
        System.out.println("Nilai UAS: " + nilaiUas + " (Bobot: 45%)" + " = " + pNilaiUas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + getNilaiHuruf());
        System.out.println("Predikat: " + getPredikat());
    }
}
