package cw2.zad4;

public class Sms implements SrodekPrzekazuStrategia{
    @Override
    public void wyslij(String tlumaczenie) {
        System.out.println("Wysłano sms: " + tlumaczenie);
    }
}
