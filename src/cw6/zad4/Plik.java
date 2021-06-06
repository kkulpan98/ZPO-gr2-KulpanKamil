package cw6.zad4;

public class Plik {
    public Plik(Czcionka... czcionki) {
        for (Czcionka czcionka : czcionki) {
            czcionka.aplikuj();
        }
    }
}
