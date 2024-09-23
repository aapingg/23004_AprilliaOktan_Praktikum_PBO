package Tugas4;

public class Overloading {
    
    //method untuk menghitung volume (overloading)
    double Volume(double p, double l, double t) {
        return p * l * t;
    }

    double Volume(double s) {
        return s * s * s;
    }

    //method untuk menghitung luas permukaan (overloading)
    double LuasPermukaan(double p, double l, double t) {
        return 2 * (p * l + p * t + l * t);
    }

    double LuasPermukaan(double s) {
        return 6 * s * s;
    }
}