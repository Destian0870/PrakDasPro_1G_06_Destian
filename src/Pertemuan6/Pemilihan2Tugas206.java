package Pertemuan6;
import java.util.Scanner;

public class Pemilihan2Tugas206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        String Jenisbuku;
        int Jumlahbuku;

        System.out.print("Jenis Buku: ");
        Jenisbuku = input06.nextLine();
        System.out.print("Jumlah Buku: ");
        Jumlahbuku = input06.nextInt();

        if (Jenisbuku.equalsIgnoreCase("kamus")&& Jumlahbuku>2) {
            System.out.println("diskon 12%");
        } else if (Jenisbuku.equalsIgnoreCase("kamus")&& Jumlahbuku<=2) {
            System.out.println("diskon 10%");
        } else if (Jenisbuku.equalsIgnoreCase("novel")&& Jumlahbuku>3) {
            System.out.println("diskon 9%");
        } else if (Jenisbuku.equalsIgnoreCase("novel")&& Jumlahbuku<=3) {
            System.out.println("diskon 8%");
        } else if (Jumlahbuku>3) { 
            System.out.println("diskon 5%");
        } else {
            System.out.println("diskon 0%");
        }                      
    }
    
}
