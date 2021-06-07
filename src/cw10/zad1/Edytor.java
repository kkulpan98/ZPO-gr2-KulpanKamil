package cw10.zad1;

public class Edytor {
    Stan stan;

    public Edytor() {
        stan = new Gumka(this);
    }

    public void wykonaj() {
        stan.wykonaj();
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }

}
