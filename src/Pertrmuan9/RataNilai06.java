package Pertrmuan9;
import java.util.Scanner;

public class RataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilaiMhs;
        float nilai, totalNilai, rataNilia;

        i=1;
        while (i<=5) {
            System.out.println("Input nilai mahasiswa ke "+ i);
            totalNilai=0; 
            for (j=1; j<=5; j++) {
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            
        }
        rataNilia=totalNilai/5;
        System.out.println("Rata-rata nilai mahasiswa ke " + i +" adalah " + rataNilia);
        i++;
        }
    }  
}
