package cw9.zad2;

public class Main {
    public static void main(String[] args) {
        Konto konto1 = new Konto(42345, true);
        Konto konto2 = new Konto(500, false);

        Przelew przelew = new Przelew(konto1, konto2, 100);
        przelew.wykonaj();
    }
}
