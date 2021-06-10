package cw10.zad3;

import java.time.LocalDateTime;

public class BladAutoryzacji3RazyStan implements Stan {
    private Autoryzacja autoryzacja;
    private LocalDateTime localDateTime;

    public BladAutoryzacji3RazyStan(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
        this.localDateTime = LocalDateTime.now().plusSeconds(30);
    }

    @Override
    public void sprawdzDane(String login, String haslo) {

    }
}
