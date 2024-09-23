package Tugas4;

public class Overriding1 extends Overloading{
    
    @Override
    double Volume(double p, double l, double t) {
        return super.Volume(p, l, t);
    }

    @Override
    double LuasPermukaan(double p, double l, double t) {
        return super.LuasPermukaan(p, l, t);
    }
}