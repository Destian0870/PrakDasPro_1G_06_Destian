package Pertemuan11;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mynNumbers = new int[3][];

        mynNumbers[0] = new int[5];
        mynNumbers[1] = new int[3];
        mynNumbers[2] = new int[1];

        for (int i = 0; i < mynNumbers.length; i++) {
            System.out.println(Arrays.toString(mynNumbers[i]));
            
        }
        for (int i = 0; i < mynNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+i) + ": " + mynNumbers[i].length);
            
        }
        
    }
    
}
