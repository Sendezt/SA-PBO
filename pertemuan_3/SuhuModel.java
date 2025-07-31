package pertemuan_3;

public class SuhuModel {
    public static void main(String[] args) {
        Suhu suhu = new Suhu();

        suhu.setSuhuCelsius(25.0f); // Mengatur suhu dalam Celsius
        System.out.println("Suhu dalam Celsius: " + suhu.getSuhuCelsius());

        // Mengatur dan mencetak suhu dalam Celsius
        suhu.setSuhuKelvin();
        suhu.printSuhuKelvin();

        // Mengatur dan mencetak suhu dalam Fahrenheit
        suhu.setSuhuFahrenheit();
        suhu.printSuhuFahrenheit();

        // Mengatur dan mencetak suhu dalam Rankine
        suhu.setSuhuRankine();
        suhu.printSuhuRankine();

        // Mengatur dan mencetak suhu dalam Delisle
        suhu.setSuhuDelisle();
        suhu.printSuhuDelisle();

        // Mengatur dan mencetak suhu dalam Newton
        suhu.setSuhuNewton();
        suhu.printSuhuNewton();

        // Mengatur dan mencetak suhu dalam Réaumur
        suhu.setSuhuReamur();
        suhu.printSuhuReamur();

        // Mengatur dan mencetak suhu dalam Romer
        suhu.setSuhuRomer();
        suhu.printSuhuRomer();
    }
}
