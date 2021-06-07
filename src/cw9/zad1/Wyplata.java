package cw9.zad1;

public class Wyplata implements OperacjaBankowa {
    private double pieniadze;
    private Konto konto;

    public Wyplata(double pieniadze, Konto konto) {
        this.pieniadze = pieniadze;
        this.konto = konto;
    }

    @Override
    public void wykonaj() {
        this.konto.zmienSaldo(-pieniadze);
        System.out.println(konto.getSaldo());
    }
}
