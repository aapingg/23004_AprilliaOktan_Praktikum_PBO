package Tugas7;

public class SoalC {
    
    // method untuk menampilkan lagu anak ayam
    public void AnakAyam(int i) {

        // loop untuk menurunkan jumlah anak ayam
        for (int a = i; a > 0; a--) {
            System.out.println("\nTek otek otek otek, anak ayam turun berkotek");
            System.out.print("Anak ayam turunlah " + a);
            int o = a - 1;
            
            if (o == 0) {
                System.out.println(" ,mati satu tinggal induknya");
            } else {
                System.out.println(" ,mati satu tinggallah " + o);
            }
        }
    }
}