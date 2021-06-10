package cw5.zad1;

import java.time.LocalDate;

public class Dron extends Transport {
    public Dron(Paczka paczka) {
        this.czasDoreczenia = LocalDate.now().plusDays(1);
        this.koszt = 12;
        this.paczka = paczka;
    }
}
