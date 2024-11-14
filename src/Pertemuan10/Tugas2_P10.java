package Pertemuan10;
import java.util.Scanner;

public class Tugas2_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPesanan, total=0;

        System.out.print("Masukan jumlah pesanan : ");
        jumlahPesanan = sc.nextInt();
        sc.nextLine();

        int [] hargaPesanan = new int[jumlahPesanan];
        String [] namaPesanan = new String[jumlahPesanan];


        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukan pesanan menu ke-"+(i+1)+" : ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Masukan Harga ke-"+(i+1)+" : ");
            hargaPesanan[i] = sc.nextInt();
            total += hargaPesanan[i];
            sc.nextLine();
        }
        System.out.println();
        System.out.println("Daftar pesanan : ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i+1)+")"+namaPesanan[i]+ "-Harga: " + hargaPesanan[i]);
            
        }
        System.out.println("Total Pembayaran : "+total);
        
    }
}