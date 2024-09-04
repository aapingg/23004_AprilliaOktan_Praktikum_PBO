package Tugas2;

public class Matematika implements MatematikaInterface{
    
    //method pertambahan
    public int pertambahan(int a, int b){
        int p = a + b;
        System.out.println("Pertambahan: 20 + 10 = " + p);
        return p = a + b;
    }

    //method pengurangan
    public int pengurangan(int a, int b){
        int i = a - b;
        System.out.println("Pengurangan: 10 - 5 = " + i);
        return i = a - b;
    }

    //method perkalian
    public int perkalian(int a, int b) {
        int n = a * b;
        System.out.println("Perkalian: 10 * 3 = " + n);
        return n = a * b;
    }

    //method pembagian
    public int pembagian(int a, int b) {
        int g = a / b;
        System.out.println("Pembagian: 21 * 2 = " + g);
        return g = a / b;
    }
}