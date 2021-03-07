package cw1.zad6;

public class Pracownik {

    private String zawod;

    void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    void pracowac(Pracowac pracowac) {
        pracowac.pracuj();
    }

    void dojezdzac(Dojezdzac dojezdzac) {
        dojezdzac.dojezdzaj();
    }

    public Pracownik(String zawod) {
        this.zawod = zawod;
    }
}
