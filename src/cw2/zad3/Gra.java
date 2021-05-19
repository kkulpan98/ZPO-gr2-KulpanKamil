package cw2.zad3;

public class Gra {
    public static void main(String[] args) {

        StrategiaRycerza strategiaRycerza = new StrategiaRycerza();
        StrategiaLucznika strategiaLucznika = new StrategiaLucznika();
        StrategiaStrzelca strategiaStrzelca = new StrategiaStrzelca();
        StrategiaKanoniera strategiaKanoniera = new StrategiaKanoniera();

        Postac postac = new Postac();

        postac.wybierzStrategie(strategiaRycerza);
        postac.wybierzBron();

        postac.wybierzStrategie(strategiaLucznika);
        postac.wybierzBron();

        postac.wybierzStrategie(strategiaStrzelca);
        postac.wybierzBron();

        postac.wybierzStrategie(strategiaKanoniera);
        postac.wybierzBron();
    }
}
