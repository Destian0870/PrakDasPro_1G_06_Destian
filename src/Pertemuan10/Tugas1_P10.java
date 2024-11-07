package Pertemuan10;
import java.util.Scanner;

public class Tugas1_P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMahasiswa = new int[5];
        int nilaiTertinggi = 0, nilaiTerendah = 100, totalnilai = 0, jumlahMahasiswa;
        double rataNilai;

        System.out.print("Masukan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        for (int i= 0; i< nilaiMahasiswa.length; i++) {
            System.out.println("Masukan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMahasiswa[i] = sc.nextInt();
            totalnilai += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
                
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
                
            }
            
        }
        rataNilai = totalnilai/jumlahMahasiswa;
        System.out.println("Rata rata nilai mahasiswa : "+rataNilai);
        System.out.println("Nilai tertingii : "+nilaiTertinggi);
        System.out.println("Nilai terendah : "+nilaiTerendah);

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(" ");
            System.out.print(nilaiMahasiswa[i]);
            
        }

        
    }
    
}
