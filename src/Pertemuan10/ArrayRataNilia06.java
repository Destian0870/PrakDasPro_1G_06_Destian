package Pertemuan10;
import java.util.Scanner;

public class ArrayRataNilia06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiMHS = new int[5], lulus, tidakLulus;
        double totalLulus = 0, totaltidakLulus = 0, Lulus = 0, Tidaklulus = 0;
        double rata2Lulus, rata2tidakLulus; 
        String jumlahMahasiswa;

        System.out.println("Masukan jumlah mahasiswa : ");
        jumlahMahasiswa = sc.nextLine();

        for (int i = 0; i< nilaiMHS.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = sc.nextInt();
            
        }
        for (int i = 0; i< nilaiMHS.length; i++) {
            if (nilaiMHS[i] > 70) {
                totalLulus += nilaiMHS[i];
                Lulus++;
            }else{
                totaltidakLulus += nilaiMHS[i]; 
                Tidaklulus++;   
            }
               
        }
        rata2Lulus = totalLulus/Lulus;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        rata2tidakLulus = totaltidakLulus/Tidaklulus;
        System.out.println("Rata-rata nilai Tidak lulus = "+rata2tidakLulus);
    }
   
    
}
