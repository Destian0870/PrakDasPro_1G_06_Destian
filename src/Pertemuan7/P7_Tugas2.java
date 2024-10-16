package Pertemuan7;
import java.util.Scanner;

public class P7_Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, totalAkhir = 0, total = 0;

        do {
            System.out.print("Masukan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar): ");
            jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("masukan durasi : ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                System.out.println("Total pembayaran : 12500");
                totalAkhir += 12500;
            }
            else if (jenis == 1) {
                System.out.println("total pembayaran : "+(durasi * 3000));
                totalAkhir += durasi * 3000;
            }
            else if (jenis == 2) {
                System.out.println("total pembayaran : "+(durasi * 2000));
                totalAkhir += durasi * 2000;
            }
            }continue;

    }while(jenis != 0);
    System.out.println("Totall penghasilan: " + totalAkhir);    
    
    }
}
