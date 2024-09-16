package Tugas3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // nilai input untuk konversi
        double celcius = 25.0;
        double fahrenheit = 77.0;

        // memanggil method dari KonversiSuhu
        double hasilFahrenheit = konversi.celciusToFahrenheit(celcius);
        double hasilReamur = konversi.celciusToReamur(celcius);

        // memanggil method dari KonversiSuhu2
        double hasilReamurDariFahrenheit = konversi.fahrenheitToReamur(fahrenheit);

        // menampilkan hasil
        System.out.println("Konversi Celcius ke Fahrenheit: " + celcius + "°C = " + hasilFahrenheit + "°F");
        System.out.println("Konversi Celcius ke Reamur: " + celcius + "°C = " + hasilReamur + "°R");
        System.out.println("Konversi Fahrenheit ke Reamur: " + fahrenheit + "°F = " + hasilReamurDariFahrenheit + "°R");
    }
}
