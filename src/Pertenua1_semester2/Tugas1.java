package Pertenua1_semester2;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' '}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (A, B, D, E, F, G, H, L, N, T): ");
        char inputCode = scanner.next().toUpperCase().charAt(0); 

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputCode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Kota yang sesuai dengan kode plat nomor " + inputCode + " adalah: ");
            
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.print(KOTA[index][i]);
            }
            System.out.println(); 
        } else {
            System.out.println("Kode tidak valid. Silakan masukkan kode yang valid dari A, B, D, E, F, G, H, L, N, T.");
        }

        scanner.close(); 
    }
}
