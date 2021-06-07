package cw10.zad1;

public class Gumka implements Stan {
    private Edytor edytor;

    public Gumka(Edytor edytor) {
        this.edytor = edytor;
    }

    @Override
    public void wykonaj() {
        System.out.println("Gumkuje");
    }

}
