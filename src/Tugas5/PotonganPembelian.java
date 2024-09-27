package Tugas5;
import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner beli = new Scanner(System.in);
        
        System.out.print("Total Pembelian: ");
        double total = beli.nextDouble();
        
        double potongan;
        if(total < 50000){
            potongan = 5.0 / 100 * total;
        }else{
            potongan = 20.0 / 100 * total;
        }
        
        double bayar = total - potongan;
        
        System.out.println("===========================");
        System.out.println("Total pembelian Rp." +total);
        System.out.println("Besarnya potongan Rp." +potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp." +bayar);
    }  
}
