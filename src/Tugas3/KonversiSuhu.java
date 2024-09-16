package Tugas3;

public class KonversiSuhu {
    
    // method untuk mengonversi Celcius ke Fahrenheit
    public double celciusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    }

    // method untuk mengonversi Celcius ke Reamur
    public double celciusToReamur(double celcius) {
        double reamur = celcius * 4/5;
        return reamur;
    }
}
