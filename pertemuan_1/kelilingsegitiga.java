public class kelilingsegitiga {
    public static void main(String[] args) {
        float sisiA = 5f; // Ganti dengan panjang sisi A segitiga
        float sisiB = 4f; // Ganti dengan panjang sisi B segitiga
        float sisiC = 3f; // Ganti dengan panjang sisi C segitiga

        if(sisiA + sisiB > sisiC && sisiA + sisiC > sisiB & sisiB + sisiC > sisiA) {
            float keliling = sisiA + sisiB + sisiC;
            System.out.println("panjang sisi A: " + sisiA + "cm");
            System.out.println("panjang sisi B: " + sisiB + "cm");
            System.out.println("panjang sisi C: " + sisiC + "cm");
            System.out.println("Keliling segitiga: " + keliling + "cm");
        } else {
            System.out.println("Tidak dapat membentuk segitiga dengan panjang sisi yang diberikan.");
        }
}
}