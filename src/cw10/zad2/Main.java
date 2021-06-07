package cw10.zad2;

public class Main {
    public static void main(String[] args) {
        Telewizor telewizor = new Telewizor();
        telewizor.wlacznik();
        System.out.println(telewizor.getKanal());
        telewizor.setKanal((short) 111);
        telewizor.wlacznik();
        System.out.println(telewizor.getKanal());
    }
}
