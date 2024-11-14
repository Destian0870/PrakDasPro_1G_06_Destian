package Pertemuan11;
import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        int pilihan;

        String [][] penonton = new String[4][2];

        while (true) {
        
            System.out.println("\nMenu: ");
            System.out.println("1. Input data penonton: ");
            System.out.println("2. Tampilkan daftar penonton: ");
            System.out.println("3. Exit");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukan nama: ");
                nama = sc.nextLine();
                while (true) {
                    System.out.print("Masukan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.println("Masukan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc. nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid. Silahkan masukan ulang. ");
                        
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi. silahkan pilih kursi lain");
                        
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        break;
                    }  
                }
                
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.println(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();   
                }
            } else if (pilihan == 3) {
                System.out.println("Terimakasih sudah menggunakan program ini.");
                break;
            } else {
                System.out.println("pilihan tidak valid. Silahkan pilih 1, 2, atau 3.");
            }
        }
    } 
}
