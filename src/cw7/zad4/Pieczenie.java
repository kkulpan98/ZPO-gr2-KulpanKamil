package cw7.zad4;

public abstract class Pieczenie {

    public Pizza zacznijPiec(Pizza pizza) {
        nagrzejPiec();
        przygotujPizze();
        return wyjmijGotowaPizze(pizza);
    }

    abstract void nagrzejPiec();
    abstract Pizza przygotujPizze();
    abstract Pizza wyjmijGotowaPizze(Pizza pizza);
}
