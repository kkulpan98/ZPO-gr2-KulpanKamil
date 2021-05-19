package cw1.zad5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kraj> kraje = new ArrayList<>();
        kraje.add(new Niemcy());
        kraje.add(new Polska());
        kraje.add(new WielkaBrytania());

        for (Kraj kraj: kraje) {
            System.out.println(kraj.stawkaPodatkowa());
        }
    }
}
