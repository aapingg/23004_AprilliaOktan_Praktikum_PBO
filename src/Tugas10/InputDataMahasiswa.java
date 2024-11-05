/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import java.util.ArrayList;

/**
 *
 * @author Aping
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputDataMahasiswa(){
        listmahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String mataKuliah, String nilai1, String nilai2, String nilai3, String nilai4, String nilai5){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getAll(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
    
