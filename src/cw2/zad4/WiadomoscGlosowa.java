package cw2.zad4;

public class WiadomoscGlosowa implements SrodekPrzekazuStrategia {
    @Override
    public void wyslij(String tlumaczenie) {
        System.out.println("Odtworzono wiadomość głosową: " + tlumaczenie);
    }
}
