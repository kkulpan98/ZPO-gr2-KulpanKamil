package cw9.zad2;

public class Wplata implements OperacjaBankowa {
    private double pieniadze;
    private Konto konto;

    public Wplata(double pieniadze, Konto konto) {
        this.pieniadze = pieniadze;
        this.konto = konto;
    }

    @Override
    public void wykonaj() {
        this.konto.zmienSaldo(pieniadze);
        System.out.println(konto.getSaldo());
    }
}
