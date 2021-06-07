package cw10.zad2;

public class Telewizor {
    private Stan obecnyStan;
    public short kanal;

    public Telewizor() {
        obecnyStan = new StanWylaczony(this);
        kanal = 123;
    }

    public void setObecnyStan(Stan obecnyStan) {
        this.obecnyStan = obecnyStan;
    }

    public void wlacznik() {
        obecnyStan.wlacznik();
    }

    public short getKanal() {
        return obecnyStan.obecnyKanal();
    }

    public void setKanal(short kanal) {
        this.obecnyStan.zmienkanal(kanal);
    }
}
