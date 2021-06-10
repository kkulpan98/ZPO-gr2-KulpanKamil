package cw5.zad1;

import java.util.Random;

public class Paczka {
    private String numerPaczki;
    private String zawartosc;

    public Paczka(String zawartosc) {
        this.zawartosc = zawartosc;
        this.numerPaczki = String.valueOf(new Random().nextInt(1000000));
    }

    public String getNumerPaczki() {
        return numerPaczki;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void wyslij() {
        System.out.println("Wysylam");
    }

    public void zglosReklamacje(String powodReklamacji) {
        System.out.println("Reklamacja: " + powodReklamacji);
    }
}
