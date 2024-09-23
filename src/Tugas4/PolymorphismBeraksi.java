package Tugas4;

public class PolymorphismBeraksi {

    public static void main(String[] args) {
        //membuat objek balok
        Overriding1 balok = new Overriding1();
        double p = 5, l = 3, t = 4;

        System.out.println("Volume Balok adalah : " + balok.Volume(p, l, t));
        System.out.println("Luas Permukaan Balok adalah : " + balok.LuasPermukaan(p, l, t));

        //membuat objek kubus
        Overriding2 kubus = new Overriding2();
        double s = 4;

        System.out.println("Volume Kubus adalah : " + kubus.Volume(s));
        System.out.println("Luas Permukaan Kubus adalah : " + kubus.LuasPermukaan(s));
    }
}