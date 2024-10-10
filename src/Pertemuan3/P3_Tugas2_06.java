package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahjamkerja, upahperjam;
        double gajikaryawan, bonusgaji, gajisebelumpajak, gajisesudahpajak, gajibersih;

        System.out.print("Masukan berapa Jumlah jam kerja karyawa: ");
        jumlahjamkerja = input.nextInt();
        System.out.print("Masukan berapa upah perjam: ");
        upahperjam = input.nextInt();
        
        gajikaryawan = jumlahjamkerja * upahperjam;

        System.out.println("Gaji karyawan: " + gajikaryawan);
        bonusgaji = gajikaryawan * 0.1;
        System.out.println("Bounus gaji: " + bonusgaji);

        gajisebelumpajak = gajikaryawan + bonusgaji;

        System.out.println("Gaji sebelum pajak: " + gajisebelumpajak);
        gajisesudahpajak = bonusgaji * 0.05;
        System.out.println("Gaji sesudah pajak: " + gajisesudahpajak);

        gajibersih = (int) (gajikaryawan - gajisesudahpajak);
        System.out.println("Gaji bersih sebesar: " + gajibersih);
        
    }
    
}
