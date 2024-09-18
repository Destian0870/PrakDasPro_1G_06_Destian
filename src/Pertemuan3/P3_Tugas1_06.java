package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah penggunaan listrik KWH: ");

        int jumlahpenggunaanlistrik = input.nextInt();
        boolean lebihdari500 = jumlahpenggunaanlistrik > 500; 
        int totaltagihan = jumlahpenggunaanlistrik * 1500;

        System.out.println("Penggunaan listrik lebih dari 500 KWH: " + lebihdari500);
        System.out.println("Total tagihan listrik: Rp " + totaltagihan);
    }
    
}
