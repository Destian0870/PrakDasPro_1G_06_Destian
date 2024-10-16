package Pertemuan7;
import java.util.Scanner;

public class P7_Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        String namaPelanggan;
        double harga = 50000, total = 0, totalHasil = 0;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Tranksaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket>3) {
                harga = harga-(harga * 0.1);
                total = (jumlahTiket * harga);
             }
              else if (jumlahTiket>10) {
                harga = harga-(harga * 0.15);
             }
            else if (jumlahTiket<0) {
                System.out.println("Nilai tidak cocok. coba masukan lagi");
                continue;
             }
            else total = (jumlahTiket * harga);
            System.out.println("Total bayar: " + total);
            
            totalHasil += total;
            totalTiket += jumlahTiket; 
             }

             while(true);
             System.out.println("JUmlah total penghasilan: " + totalHasil);
             System.out.println("Jumlah tiket yang terjual: " + totalTiket);
            
      }
}
