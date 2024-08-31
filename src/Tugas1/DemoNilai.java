/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;
public class DemoNilai {
    public static void main(String[] args) {
        //objek mahasiswa
        Nilai mahasiswaA = new Nilai();
        mahasiswaA.nim = 2310631170004L;
        mahasiswaA.nama = "April";
        mahasiswaA.nilaiabsen = 100;
        mahasiswaA.nilaitugas = 100;
        mahasiswaA.nilaiuts = 100;
        mahasiswaA.nilaiuas = 100;
        
        //membuat objek siswa
        Nilai mahasiswaB = new Nilai();
        mahasiswaB.nim = 2310631170005L;
        mahasiswaB.nama = "Anggana";
        mahasiswaB.nilaiabsen = 98;
        mahasiswaB.nilaitugas = 97;
        mahasiswaB.nilaiuts = 96;
        mahasiswaB.nilaiuas = 95;
        
        //objek mahasiswa
        Nilai mahasiswaC = new Nilai();
        mahasiswaC.nim = 2310631170005L;
        mahasiswaC.nama = "Aping";
        mahasiswaC.nilaiabsen = 94;
        mahasiswaC.nilaitugas = 93;
        mahasiswaC.nilaiuts = 92;
        mahasiswaC.nilaiuas = 91;

       
        
        //Output tampilan
        mahasiswaA.tampilkan();
        mahasiswaB.tampilkan();
        mahasiswaC.tampilkan();
    }
    
}
