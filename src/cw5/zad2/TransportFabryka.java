package cw5.zad2;

public class TransportFabryka {
    public Transport wybierzTransport(RodzajTransportu rodzajTransportu) {

       switch (rodzajTransportu){
           case PROM:
               return new Prom();
           case CIEZAROWKA:
               return new Ciezarowka();
           default:
               throw new IllegalArgumentException("zly rodzaj transportu");
       }
    }
}
