package cw2.zad5;

public class Main {
    public static void main(String[] args) {
        double liczba1 = 2;
        double liczba2 = 3;

        PoliczStrategia strategia = new Dodaj();
        System.out.println(strategia.policz(liczba1, liczba2));

        strategia = new Odejmij();
        System.out.println(strategia.policz(liczba1, liczba2));

        strategia = new Podziel();
        System.out.println(strategia.policz(liczba1, liczba2));

        strategia = new Pomnoz();
        System.out.println(strategia.policz(liczba1, liczba2));

    }
}
