package Pertemuan6;
import java.util.Scanner;

public class Pemilihan2Tugas106 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        int Bil1, Bil2, Bil3;

        System.out.print("Masukan Bilangan1: ");
        Bil1 = input06.nextInt();
        System.out.print("Masukan Bilangan2: ");
        Bil2 = input06.nextInt();
        System.out.print("Masukan Bilangan3: ");
        Bil3 = input06.nextInt();

        if (Bil1>Bil2) {
            if (Bil1>Bil3) {
            System.out.println("Bilangan Terbesar : " + Bil1); 
            } else {
            System.out.println("Bilangan Terbesar : " + Bil3);
            } 
            } else {
            if (Bil2>Bil3) {
                System.out.println("Bilangan Terbesar : " + Bil2);
            } else {     
                System.out.println("Bilangan Terbesar : " + Bil3);
            }       

         }          
    }
    
}
