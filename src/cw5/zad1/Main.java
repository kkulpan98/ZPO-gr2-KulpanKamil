package cw5.zad1;

public class Main {
    public static void main(String[] args) {
        TransportFabryka transportFabryka = new TransportFabryka();

        Paczka paczka1 = new Paczka("Miś");
        transportFabryka.stworzPaczke(RodzajTransportu.KURIER, paczka1);
    }
}
