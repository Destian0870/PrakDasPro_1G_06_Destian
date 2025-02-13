package Pertenua1_semester2;

import java.util.Scanner;

public class Pertanyaan04 {

    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int[][] stokBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    // Menampilkan pendapatan setiap cabang
    public static void displayIncome() {
        System.out.println("\n============= Tampilan TOTAL PENGHASILAN =============");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-15s%n", "Branch", "Aglonema", "Keladi", "Alocasia", "Mawar", "Total Penghasilan");

        for (int i = 0; i < cabang.length; i++) {
            int totalPendapatan = 0;
            System.out.printf("%-15s", cabang[i]); // Printing branch name
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.printf("%-10d", stokBunga[i][j]); // Printing flower stock
                totalPendapatan += stokBunga[i][j] * hargaBunga[j]; // Calculating total income
            }
            System.out.printf("Rp. %-10d%n", totalPendapatan); // Displaying total income
        }

        System.out.println("\nHarga Masing-Masing   Rp. 75000   Rp. 50000   Rp. 60000   Rp. 10000");
    }

    // Menampilkan stok setiap jenis bunga
    public static void displayStock() {
        System.out.println("\n=========== Tampilan Stok Bunga ===========");
        System.out.printf("%-15s", "Cabang");
        for (String bunga : namaBunga) {
            System.out.printf("%-10s", bunga); // Displaying flower names
        }
        System.out.println();

        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-15s", cabang[i]); // Displaying branch name
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.printf("%-10d", stokBunga[i][j]); // Displaying flower stock
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Royal Garden Flower Shop =====");
            System.out.println("Selamat datang di Royal Garden");
            System.out.println("Silahkan pilih Menu:");
            System.out.println("1. Menampilkan pendapatan setiap cabang");
            System.out.println("2. Jumlah Stok Setiap jenis Bunga");
            System.out.println("3. Exit");
            System.out.print("Silahkan pilih Menu: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayIncome();
                    break;
                case 2:
                    displayStock();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan Tidak Valid! Silahkan Pilih yang Benar.");
            }
        }
    }
}
