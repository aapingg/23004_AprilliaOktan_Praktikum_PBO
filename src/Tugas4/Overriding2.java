package Tugas4;

public class Overriding2 extends Overloading{
   
    @Override
    double Volume(double s) {
        return super.Volume(s);
    }

    @Override
    double LuasPermukaan(double s) {
        return super.LuasPermukaan(s);
    }
}