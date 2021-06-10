package cw5.zad1;

import java.time.LocalDate;

public class Kurier extends Transport {
    public Kurier(Paczka paczka) {
        this.czasDoreczenia = LocalDate.now().plusDays(3);
        this.koszt = 17;
        this.paczka = paczka;
    }
}
