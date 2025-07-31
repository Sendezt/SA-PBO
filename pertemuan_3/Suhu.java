package pertemuan_3;

public class Suhu {
    private float suhuCelsius;
    private float suhuKelvin;
    private float suhuFahrenheit;
    private float suhuRankine;
    private float suhuDelisle;
    private float suhuNewton;
    private float suhuReamur;
    private float suhuRomer;


    public void setSuhuCelsius(float suhuCelsius) {
        this.suhuCelsius = suhuCelsius;
    }
    
    public float getSuhuCelsius() {
        return suhuCelsius;
    }

    public void setSuhuKelvin() {
        this.suhuKelvin = suhuCelsius + 273.15f;
        
    }

    public float getSuhuKelvin() {
        return suhuKelvin;
    }

    public void printSuhuKelvin() {
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);
    }

    public void setSuhuFahrenheit() {
        this.suhuFahrenheit = (suhuCelsius * 1.8f) + 32;
    }

    public float getSuhuFahrenheit() {
        return suhuFahrenheit;
    }

    public void printSuhuFahrenheit() {
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
    }

    public void setSuhuRankine() {
        this.suhuRankine = (suhuCelsius + 1.8f) + 491.67f;
    }

    public float getSuhuRankine() {
        return suhuRankine;
    }

    public void printSuhuRankine() {
        System.out.println("Suhu dalam Rankine: " + suhuRankine);
    }

    public void setSuhuDelisle() {
        this.suhuDelisle = (100 - suhuCelsius) * 1.5f;
    }

    public float getSuhuDelisle() {
        return suhuDelisle;
    }

    public void printSuhuDelisle() {
        System.out.println("Suhu dalam Delisle: " + suhuDelisle);
    }

    public void setSuhuNewton() {
        this.suhuNewton = suhuCelsius * 0.33f;
    }

    public float getSuhuNewton() {
        return suhuNewton;
    }

    public void printSuhuNewton() {
        System.out.println("Suhu dalam Newton: " + suhuNewton);
    }

    public void setSuhuReamur() {
        this.suhuReamur = suhuCelsius * 0.8f;
    }

    public float getSuhuReamur() {
        return suhuReamur;
    }

    public void printSuhuReamur() {
        System.out.println("Suhu dalam Reamur: " + suhuReamur);
    }

    public void setSuhuRomer() {
        this.suhuRomer = (suhuCelsius * 0.525f) + 7.5f;
    }

    public float getSuhuRomer() {
        return suhuRomer;
    }

    public void printSuhuRomer() {
        System.out.println("Suhu dalam Romer: " + suhuRomer);
    }
}
