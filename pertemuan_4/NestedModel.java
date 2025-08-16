package pertemuan_4;

public class NestedModel {
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.cetakLuar();

        Nested.Tengah tengah = nested.new Tengah();
        tengah.cetakTengah();

        Nested.Tengah.Dalam dalam = tengah.new Dalam();
        dalam.cetakDalam();
    }
}
