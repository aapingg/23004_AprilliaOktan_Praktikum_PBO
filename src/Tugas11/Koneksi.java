/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author aping
 */
public class Koneksi {
    private static Connection konek;
    public static Connection konek() throws SQLException, ClassNotFoundException{
        try{
            if (konek == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/database3d", "root", "");
                System.out.println("Koneksi berhasil!");
            }
            return konek;
        }catch(SQLException e){
            System.err.println("Error : Koneksi tidak berhasil!" + e.getMessage());
            throw e; //lempar kembali ekspensi untuk  penanganan lebih lanjut
        }
    }
    
}
