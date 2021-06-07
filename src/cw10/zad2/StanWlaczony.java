package cw10.zad2;

public class StanWlaczony implements Stan {
    private Telewizor telewizor;

    public StanWlaczony(Telewizor telewizor) {
        this.telewizor = telewizor;
    }

    @Override
    public void zmienkanal(short numerKanalu) {
        telewizor.kanal = numerKanalu;
    }

    @Override
    public void wlacznik() {
        System.out.println("Wlaczam");
        telewizor.setObecnyStan(new StanWylaczony(telewizor));
    }

    @Override
    public short obecnyKanal() {
        return telewizor.kanal;
    }
}
