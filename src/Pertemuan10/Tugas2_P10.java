package Pertemuan10;
import java.util.Scanner;

public class Tugas2_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] hargaPesanan = new int[2];
        int jumlah, total=0;
        String [] namaPesanan = new String[2];

        System.out.println("Masukan jumlah pesanan : ");
        jumlah = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan pesanan menu ke-"+(i+1)+" : ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Masukan Harga ke-"+(i+1)+" : ");
            hargaPesanan[i] = sc.nextInt();
            total += hargaPesanan[i];
            sc.nextLine();
        }
        System.out.println();
        System.out.println("Daftar pesanan : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1)+")"+namaPesanan[i]+ "-Harga: " + hargaPesanan[i]);
            
        }
        System.out.println("Total Pembayaran : "+total);
        
    }
}