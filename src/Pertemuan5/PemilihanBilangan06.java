package Pertemuan5;
import java.util.Scanner;

public class PemilihanBilangan06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        //if (angka % 2 == 0)
        //{
            //System.out.println("Angka " + angka + " termasuk bilangan genap");
        //}
        //else
        //{ 
            //System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        //}

        System.out.print("Masukan sebuah angka: ");
        angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println(angka+" adalah "+hasil);
               
    }
}
