package Tugas7;

public class SoalNo2 {

// method untuk menampilkan tabel perkalian
public void tampilkanTabel(int n) {
    System.out.println("Tabel Perkalian " + n + " x " + n + ":");

    // loop untuk baris
    for (int i = 1; i <= n; i++) {
        // loop untuk kolom
        for (int j = 1; j <= n; j++) {
            System.out.print(i * j + "\t");
        }
        System.out.println();
    }
}

}