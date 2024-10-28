package Tugas8;
import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        System.out.println("TOKO SERBA ADA");
        System.out.println("****************************");

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = scanner.nextInt();
        scanner.nextLine();

        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data Ke " + (i + 1));

            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = scanner.nextLine();

            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("****************************");
        System.out.printf("%-4s %-15s %-15s %-10s %-12s %-12s%n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("=========================================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    System.out.printf("%-6d %-16s %-12s %-15d %-10d %-15d%n", (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                    totalBayar += jumlahBayar[i];
                }
            }
        }

        System.out.println("=========================================================================");
        System.out.printf("Total Bayar %57d%n", totalBayar);
        System.out.println("=========================================================================");
    }
}