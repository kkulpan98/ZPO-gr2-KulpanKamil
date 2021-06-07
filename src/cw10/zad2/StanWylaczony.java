package cw10.zad2;

public class StanWylaczony implements Stan {
    private Telewizor telewizor;

    public StanWylaczony(Telewizor telewizor) {
        this.telewizor = telewizor;
    }

    @Override
    public void zmienkanal(short numerKanalu) {
        throw new IllegalArgumentException("nie mozna zmienic kanalu wylaczonego tv");
    }

    @Override
    public void wlacznik() {
        System.out.println("Wylaczam");
        telewizor.setObecnyStan(new StanWlaczony(telewizor));
    }

    @Override
    public short obecnyKanal() {
        throw new IllegalArgumentException("nie mozna zwrocic obecnego kanalu wylaczonego tv");
    }
}
