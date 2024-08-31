/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

public class Mahasiswa {
    String nama;

    //method untuk status membaca
    void baca(){
        System.out.println(nama + " adalah mahasiswa yang sedang membaca");
    }

    //method untuk status menyontek
    void nyontek(){
        System.out.println(nama + " adalah mahasiswa yang sedang nyontek");
    }
    
    //method untuk status memodifikasi
    void modif(){
        System.out.println(nama + " adalah mahasiswa yang sedang modifikasi");
    }

}