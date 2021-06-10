package cw5.zad2;

abstract public class Transport {
    protected String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void wyslijTransport() {
        System.out.println("wyslano transport: " + this.nazwa);
    }
}
