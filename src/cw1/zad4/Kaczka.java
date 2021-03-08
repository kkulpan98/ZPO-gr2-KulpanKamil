package cw1.zad4;

public class Kaczka {

    private SposobKwakania sposobKwakania;
    private SposobLatania sposobLatania;

    public void setSposobKwakania(SposobKwakania sposobKwakania) {
        this.sposobKwakania = sposobKwakania;
    }

    public void setSposobLatania(SposobLatania sposobLatania) {
        this.sposobLatania = sposobLatania;
    }

    void kwacz(){
        sposobKwakania.kwacz();
    }

    void lataj() {
        sposobLatania.lataj();
    };

}
