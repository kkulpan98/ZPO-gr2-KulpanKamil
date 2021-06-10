package cw5.zad2;

public class Main {
    public static void main(String[] args) {
        TransportFabryka transportFabryka = new TransportFabryka();

        Transport transport1 = transportFabryka.wybierzTransport(RodzajTransportu.CIEZAROWKA);
        Transport transport2 = transportFabryka.wybierzTransport(RodzajTransportu.PROM);

        transport2.wyslijTransport();
        transport1.wyslijTransport();
    }
}
