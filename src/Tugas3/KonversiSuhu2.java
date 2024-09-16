package Tugas3;

public class KonversiSuhu2 extends KonversiSuhu {
    
    // method untuk mengonversi Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        //konversi Fahrenheit ke Celcius terlebih dahulu
        double celcius = (fahrenheit - 32) * 5/9;
        //lalu konversi dari Celcius ke Reamur
        double reamur = celcius * 4/5;
        return reamur;
    }
}
