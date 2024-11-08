package Pertemuan10;
import java.util.Scanner;

public class Tugas3_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key;
        String daftarMenu[] = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappuchino ice"};
        System.out.println("Daftar Menu");

      for (int i = 0; i < daftarMenu.length; i++) {
           System.out.println((i+1)+")"+daftarMenu[i]);
        
      }
      System.out.println("Menu yang dipesan: ");
      key = sc.nextLine();

      for (int i = 0; i < daftarMenu.length; i++) {
        if (key.equalsIgnoreCase(daftarMenu[i])) {
            System.out.println("Menu pesanan "+key+" diterima");
            break;
            
        }
        if (key!=daftarMenu[i] && i==(daftarMenu.length-1)) {
            System.out.println("Menu yang dimasukan tidak ditemukan");
            System.out.println();
            
        }
        
      }
        
      }
 }
