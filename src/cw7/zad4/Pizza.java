package cw7.zad4;


import java.util.List;

public class Pizza {

    private List<Skladnik> skladnikList;
    private Ciasto ciasto;

    public void setSkladnikList(List<Skladnik> skladnikList) {
        this.skladnikList = skladnikList;
    }

    public void setCiasto(Ciasto ciasto) {
        this.ciasto = ciasto;
    }

    public Pizza(Ciasto ciasto, List<Skladnik> skladnikList) {
        this.setCiasto(ciasto);
        this.setSkladnikList(skladnikList);
    }
}
