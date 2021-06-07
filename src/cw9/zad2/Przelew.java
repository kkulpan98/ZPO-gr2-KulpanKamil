package cw9.zad2;

public class Przelew implements OperacjaBankowa {
    private Konto skad;
    private Konto dokad;
    private double ile;

    public Przelew(Konto skad, Konto dokad, double ile) {
        this.skad = skad;
        this.dokad = dokad;
        this.ile = ile;
    }

    @Override
    public void wykonaj() {
        skad.zmienSaldo(-ile);
        dokad.zmienSaldo(ile);

        System.out.println(skad.getSaldo());
        System.out.println(dokad.getSaldo());
    }
}
