package Pertemuan11;

import java.util.Scanner;

public class Tugas1_P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];
        int nilaiSurvey;

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("Masukkan nilai survey untuk pertanyaan " + (j + 1) + " (nilai survey 1 - 5): ");
                    nilaiSurvey = sc.nextInt();
                    if (nilaiSurvey < 1 || nilaiSurvey > 5) {
                        System.out.println("Nilai tidak valid, mohon coba lagi ");
                    }
                } while (nilaiSurvey < 1 || nilaiSurvey > 5);
                hasilSurvey[i][j] = nilaiSurvey;
            }
        }
        System.out.println("\nBerikut adalah hasil survey dari pelanggan ini: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.println("Pertanyaan " + (j +1) + ": " + hasilSurvey[i][j]);                
            }
            System.out.println();
        }
        System.out.println("\nNilai rata rata untuk setiap responden : ");
        for (int i = 0; i < 10; i++) {
            double totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += hasilSurvey[i][j];
            }
            double rataRataResponden = totalResponden / 6;
            System.out.println("Responden " + (i + 1)+": " + rataRataResponden);       
        }
        System.out.println("\nNilai rata rata untuk setiap pertanyaan: ");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i< 10 ; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }
        double totalkeseluruhan = 0;
        int jumlahData = 10 * 6;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalkeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalkeseluruhan / jumlahData;
        System.out.println("\nNilai rata rata keseluruhan: " + rataRataKeseluruhan);
    }
}
