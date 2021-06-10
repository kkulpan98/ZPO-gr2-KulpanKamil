package cw5.zad1;

import java.time.LocalDate;

public class Listonosz extends Transport {
    public Listonosz(Paczka paczka) {
        this.czasDoreczenia = LocalDate.now().plusDays(5);
        this.koszt = 7;
        this.paczka = paczka;
    }
}
