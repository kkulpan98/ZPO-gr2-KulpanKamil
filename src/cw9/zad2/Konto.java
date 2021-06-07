package cw9.zad2;

import java.util.ArrayList;

public class Konto {
    private double saldo = 0;
    private ArrayList<String> powiadomienia;
    private boolean czyPowiadomienia = false;

    public Konto(double saldo, boolean czyPowiadomienia) {
        this.saldo = saldo;
        this.czyPowiadomienia = czyPowiadomienia;
    }

    public void zmienSaldo(double ile) {
        saldo += ile;
    }

    public double getSaldo() {
        return saldo;
    }
}
