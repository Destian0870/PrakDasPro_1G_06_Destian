package Pertemuan6;
import java.util.Scanner;

public class Pemilihan2Tugas306 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        String merk, kategori, ukuran;

        System.out.print("Masukan merk yang di beli: ");
        merk = input06.nextLine();
        System.out.print("Masukan kategori: ");
        kategori = input06.nextLine();

        if (merk.equalsIgnoreCase("Convers")) {
            if (kategori.equalsIgnoreCase("Slip on")) {
                System.out.println("Masukan ukuran (hanya ada 36-40): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 800.000");
            } else if (kategori.equalsIgnoreCase("High top")) {
                System.out.println("Masukan ukuran (hanya ada 40-44): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 1.200.000");
        } else { 
            System.out.println("Kategori yang dimasukan tidak seusai");
        }

        } else if  (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                System.out.println("Masukan ukuran (hanya ada 36-41): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 1.000.000");
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.println("Masukan ukuran (hanya ada 41-44): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 1.800.000");
        } else {
            System.out.println("Kategori yang dimasukan tidak sesuai");
        }
        
        } else if  (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.println("Masukan ukuran (hanya ada 36-40): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 750.000");
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.println("Masukan ukuran (hanya ada 40-44): ");
                ukuran = input06.nextLine();
                System.out.println("Harga = 1.500.000");
        } else {
            System.out.println("Kategori yang dimasukan tidak sesuai");
        }    

        }            
        
    }
    
}
