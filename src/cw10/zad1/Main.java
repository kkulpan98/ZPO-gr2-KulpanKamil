package cw10.zad1;

public class Main {
    public static void main(String[] args) {
        Edytor edytor = new Edytor();

        edytor.wykonaj();
        edytor.setStan(new Pedzel(edytor));
        edytor.wykonaj();
    }
}
