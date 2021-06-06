package cw3.zad5;

import java.util.ArrayList;
import java.util.List;

public class Spolka {

    private double kurs = 0d;
    private final List<GraczGieldowy> graczeGieldowe = new ArrayList<>();

    public void addObserver(GraczGieldowy graczGieldowy) {
        this.graczeGieldowe.add(graczGieldowy);
    }

    public void removeObserver(GraczGieldowy graczGieldowy) {
        this.graczeGieldowe.remove(graczGieldowy);
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public void notifyObservers() {
        for (GraczGieldowy graczGieldowy : this.graczeGieldowe) {
            graczGieldowy.update(this.kurs);
        }
    }
}
