/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        //membuat objek mahasiswa
        Mahasiswa mhsw1 = new Mahasiswa();
        mhsw1.nama = "Aping";
        mhsw1.baca();
        
        Mahasiswa mhsw2 = new Mahasiswa();
        mhsw2.nama= "Hilnu";
        mhsw2.nyontek();

        Mahasiswa mhsw3 = new Mahasiswa();
        mhsw3.nama = "Lia";
        mhsw3.modif();
    }
}