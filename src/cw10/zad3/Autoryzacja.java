package cw10.zad3;

public class Autoryzacja {

    private String login;
    private String haslo;
    private Stan obecnyStan;

    public Autoryzacja(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public void sprawdzDane(String login, String haslo) {
        obecnyStan.sprawdzDane(login, haslo);
    }
}
