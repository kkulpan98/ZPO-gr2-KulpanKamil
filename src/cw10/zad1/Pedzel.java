package cw10.zad1;

public class Pedzel implements Stan {
    private Edytor edytor;

    public Pedzel(Edytor edytor) {
        this.edytor = edytor;
    }

    @Override
    public void wykonaj() {
        System.out.println("Pędzluje");
    }
}
