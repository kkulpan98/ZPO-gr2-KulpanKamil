package cw5.zad1;

public class TransportFabryka {

    public Transport stworzPaczke(RodzajTransportu rodzajTransportu, Paczka paczka) {
        switch (rodzajTransportu) {
            case DRON:
                return new Dron(paczka);
            case KURIER:
                return new Dron(paczka);
            case LISTONOSZ:
                return new Listonosz(paczka);
            default:
                throw new IllegalArgumentException("Zly transport");
        }
    }
}
