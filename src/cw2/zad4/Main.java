package cw2.zad4;

public class Main {
    public static void main(String[] args) {
        Klient adamKowalski = new Klient(new Sms(), new JezykAngielski());
        Klient ewaKowalska = new Klient(new WiadomoscGlosowa(), new JezykPolski());

        adamKowalski.rozeslijReklame(TrescReklamy.GRZEBIEN_DLA_JEZA);
        adamKowalski.rozeslijReklame(TrescReklamy.KUP_MARCHEWKE_W_LIDELKU);
        adamKowalski.rozeslijReklame(TrescReklamy.KUP_BUTY_W_BIEDRZE);

        ewaKowalska.rozeslijReklame(TrescReklamy.GRZEBIEN_DLA_JEZA);
        ewaKowalska.rozeslijReklame(TrescReklamy.KUP_BUTY_W_BIEDRZE);
        ewaKowalska.rozeslijReklame(TrescReklamy.KUP_MARCHEWKE_W_LIDELKU);
    }
}
