package Tugas3;
import Tugas2.Matematika;

public class MatematikaInheritance{
    
    public static void main(String[] args) {
        //memanggil matematika
        Matematika mt = new Matematika();
        mt.pertambahan(20, 10);
        mt.pengurangan(10, 5);
        mt.perkalian(10, 3);
        mt.pembagian(21, 2);
        
        //memanggil matematika2
        Matematika2 mt2 = new Matematika2();
        mt2.modulus(20,3);
    }
}
