package Pertemuan6;
import java.util.Scanner;

public class Pemiliha2Percobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        int PilihanMenu;
        String Member;
        double Diskon = 0.10, harga, TotalBayar;

        System.out.println("-----------------------------------------");
        System.out.println("==============MENU KAFE JTI==============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.println("Masukan angka dari menu yang dipiilih = ");
        PilihanMenu = input06.nextInt();
        input06.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        Member = input06.nextLine();
        System.out.println("-------------------------------------------");

        if (Member.equalsIgnoreCase("y")) {
            Diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (PilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (PilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (PilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;           
            }

            TotalBayar = harga - (harga * Diskon);
            System.out.println("Total bayar setelah diskon = " + TotalBayar );
            }

            else if (Member.equalsIgnoreCase("n")) {
                if (PilihanMenu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                } else if (PilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                } else if (PilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
                } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;                    
                }

            System.out.println("Total bayar = " + harga);
            
            } else {
                System.out.println("Member tidak valid");     
            
        } 
        
        System.out.println("---------------------------------------------");

    }
}

