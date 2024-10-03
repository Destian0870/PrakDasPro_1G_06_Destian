package Pertemuan5;
import java.util.Scanner;

public class SIAKAD06 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

          String NAMA, NIM, KELAS;
          byte ABSEN;
          double NILAIKUIS, NILAITUGAS, NILAIAKHIR, NILAIUTS, NILAIUAS;

        System.out.println("                       KARTU RENCANA STUDI (KRS)                      ");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Masukan NAMA      : ");
        NAMA = sc.nextLine();
        System.out.print("Masukan NIM       : ");
        NIM = sc.nextLine();
        System.out.print("Masukan KELAS     : ");
        KELAS = sc.nextLine();
        System.out.print("Masukan ABSEN     : ");
        ABSEN = sc.nextByte();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|  KODE MK  |           MATA KULIAH                  |  SKS  |  JAM  |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("| RTI241001 | Pancasila                              |   2   |   2   |");
        System.out.println("| RTI241002 | Konsep Teknologi Informasi             |   2   |   4   |");
        System.out.println("| RTI241003 | Critical Thinking dan Problem Solving  |   2   |   4   |");
        System.out.println("| RTI241004 | Matematika Dasar                       |   3   |   6   |");
        System.out.println("| RTI241005 | Rekayasa Perangkat Lunak               |   2   |   4   |");
        System.out.println("| RTI241006 | Dasar Pemrograman                      |   2   |   4   |");
        System.out.println("| RTI241007 | Praktikum Dasar Pemrograman            |   3   |   6   |");
        System.out.println("| RTI241008 | Keselamatan dan Kesehatan Kerja        |   2   |   4   |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|           |                JUMLAH                  |  18   |   34  |");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Nilai KUIS: ");
        NILAIKUIS = sc.nextDouble();
        System.out.print("Nilai TUGAS: ");
        NILAITUGAS = sc.nextDouble();
        System.out.print("Nilai UTS: ");
        NILAIUTS = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        NILAIUAS = sc.nextDouble();

        NILAIAKHIR = ((NILAIKUIS*0.2) + (NILAITUGAS*0.15) + (NILAIUTS*0.30) + (NILAIUAS*0.35));

                  System.out.println("Mahasiswa dengan nama " +NAMA+ " NIM " +NIM+ " KELAS " +KELAS+ " Nomor Absen " +ABSEN);
                  System.out.println("NILAIAKHIR: "+NILAIAKHIR);


          if (NILAIAKHIR>80 && NILAIAKHIR<= 100) {
            System.out.println("nilai akhir huruf : A");
            System.out.println("kualifikasi : sangat baik ");
          } else if (NILAIAKHIR>73 && NILAIAKHIR<= 80) {
            System.out.println("nilai akhir huruf : B+");
            System.out.println("kualifikasi : lebih dari baik ");
          } else if (NILAIAKHIR>65 && NILAIAKHIR<= 73) {
            System.out.println("nilai akhir huruf : B");
            System.out.println("kualifikasi : baik ");
          } else if (NILAIAKHIR>60 && NILAIAKHIR<= 65) {
            System.out.println("nilai akhir huruf : c+");
            System.out.println("kualifikasi : lebih dari cukup ");
          } else if (NILAIAKHIR>50 && NILAIAKHIR<= 60) {
            System.out.println("nilai akhir huruf : c");
            System.out.println("kualifikasi : cukup ");
          } else if (NILAIAKHIR>39 && NILAIAKHIR<=50) {
            System.out.println("nilai akhir huruf : D");
            System.out.println("kualifikasi : kurang ");
          } else if (NILAIAKHIR<= 39) {
            System.out.println("nilai akhir huruf : E");
            System.out.println("kualifikasi : gagal ");
          }
          

    }
}