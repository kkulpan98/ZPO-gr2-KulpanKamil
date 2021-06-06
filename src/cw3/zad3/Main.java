package cw3.zad3;

public class Main {
    public static void main(String[] args) {
        Wczytywanie wczytywanie = new Wczytywanie();

        PodzielnaPrzez2 podzielnaPrzez2 = new PodzielnaPrzez2();
        WiekszaOdZera wiekszaOdZera = new WiekszaOdZera();
        RownaTrzy rownaTrzy = new RownaTrzy();

        wczytywanie.addObserver(podzielnaPrzez2);
        wczytywanie.addObserver(wiekszaOdZera);
        wczytywanie.addObserver(rownaTrzy);

        wczytywanie.addLiczbe(1);
        wczytywanie.addLiczbe(2);
        wczytywanie.addLiczbe(3);
        wczytywanie.addLiczbe(4);
        wczytywanie.addLiczbe(5);
        wczytywanie.addLiczbe(6);
        wczytywanie.addLiczbe(7);
        wczytywanie.notifyObservers();

    }
}
