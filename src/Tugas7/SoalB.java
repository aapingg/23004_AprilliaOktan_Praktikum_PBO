package Tugas7;

public class SoalB {
    
    //method bilangan ganjil
    public void Ganjil(int i) {
        System.out.println("Bilangan ganjil dari 0 sampai " + i + " adalah : ");
    
        //loop ganjil
        for (int a = 1; a <= i; a++){ 
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
    
    

    // method bilangan genap
    public void Genap(int i) {
        System.out.println("\nBilangan genap dari 0 sampai " + i + " adalah : ");
        
        //loop genap
        for (int a = 1; a <= i; a++) {  
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }   
        System.out.println();
    }    
}