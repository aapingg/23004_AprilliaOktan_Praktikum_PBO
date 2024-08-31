/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class Nilai {
    long nim;
    String nama;
    float nilaiabsen;
    float nilaitugas;
    float nilaiuts;
    float nilaiuas;
    float nilaiakhir;
    
    //method untuk menghitung nilai akhir
    float Nilai(){
        nilaiakhir = (this.nilaiabsen*10/100)+(this.nilaitugas*20/100)+(this.nilaiuts*30/100)+(this.nilaiuas*40/100);
        return nilaiakhir;  
    }
    //membuat method untuk menampilkan data nilai
    void tampilkan(){
        System.out.println();
        System.out.println("NIM                    : "+nim);
        System.out.println("Nama                   : "+nama);
        System.out.println("NIlai Absen [10%]      : "+Math.round(nilaiabsen));
        System.out.println("Nilai Tugas [20%]      : "+Math.round(nilaitugas));
        System.out.println("Nilai UTS [30])        : "+Math.round(nilaiuts));
        System.out.println("Nilai UAS [40])        : "+Math.round(nilaiuas));
        System.out.println("Nilai Akhir            : "+Math.round(Nilai()));
    }
}
