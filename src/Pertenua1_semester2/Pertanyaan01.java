package Pertenua1_semester2;

import java.util.Scanner;
public class Pertanyaan01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("=====================");

            System.out.print("Masukkan nilai tugas: ");
            double tugas = input.nextDouble();
            System.out.print("Masukkan nilai kuis: ");
            double kuis = input.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            double uts = input.nextDouble();
            System.out.print("Masukkan nilai UAS: ");
            double uas = input.nextDouble();
            System.out.println("====================");
            System.out.println("====================");

            if (!isValid(tugas) || !isValid(kuis) || !isValid(uts) || !isValid(uas)) {
                System.out.println("Nilai tidak valid");
                System.out.println("======================");
                System.out.println("======================");
            } else {

                double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
                String nilaiHuruf = konversiNilai(nilaiAkhir);
                String status = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                                 nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";

                System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf);
                System.out.println("=================");
                System.out.println("=================");
                System.out.println(" " + status);
            }

            input.close();
        }

    private static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static String konversiNilai(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }
}