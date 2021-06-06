package cw3.zad5;

public class GraczGieldowy implements Obserwator {

    private Double start;
    private Double koniec;

    public GraczGieldowy(Double start, Double koniec) {
        this.start = start;
        this.koniec = koniec;
    }

    @Override
    public void update(Double kursSpolki) {
        if (kursSpolki < start) {
            System.out.println("Super spolka, kupie wiecej");
        } else if (kursSpolki > koniec) {
            System.out.println("Ale duzo urosla, sprzedam to zarobie");
        } else {
            System.out.println("a teraz to ja nie wiem, chyba poczekam az wzrosnie lub spadnie");
        }
    }
}
