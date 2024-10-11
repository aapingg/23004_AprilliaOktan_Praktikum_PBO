package Tugas7;

public class SoalA {
    
    //method bilangan prima
    public void Prima(int i) {
        System.out.println("Bilangan prima dari 0 sampai " + i + " adalah : ");
    
        //loop prima
        for (int a = 2; a <= i; a++) {
            boolean prima = true;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
    
    

    // method bilangan bukan prima
    public void Bprima(int i) {
        System.out.println("\nBilangan bukan prima dari 0 sampai " + i + " adalah : ");
        for (int a = 0; a <= i; a++) {
            boolean prima = true;
            if (a == 0 || a == 1) { 
                prima = false;
            } else {
                for (int j = 2; j <= a / 2; j++) { 
                    if (a % j == 0) {
                        prima = false;
                        break;
                    }
                }
            }

            if (!prima) { 
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
} 