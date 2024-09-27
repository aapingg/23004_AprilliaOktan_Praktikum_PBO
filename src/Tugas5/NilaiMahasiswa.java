package Tugas5;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner mhsw = new Scanner(System.in);

        System.out.print("NPM: ");
        String NPM = mhsw.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = mhsw.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiabsen = mhsw.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaitugas = mhsw.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = mhsw.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = mhsw.nextDouble();

        double nilaiakhir = (10.0 / 100 * nilaiabsen) +
                            (20.0 / 100 * nilaitugas) +
                            (30.0 / 100 * nilaiUTS) +
                            (40.0 / 100 * nilaiUAS);

        String grade;
        String keterangan;  
        if (nilaiakhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiakhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiakhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiakhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("==========================================");
        System.out.println("NPM Mahasiswa   : " + NPM);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Akhir     : " + nilaiakhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}