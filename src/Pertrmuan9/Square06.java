package Pertrmuan9;
import java.util.Scanner;

public class Square06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan Masukan nilai N = ");
        int N = sc.nextInt();
       for (int iOuter=1; iOuter<=N; iOuter++) {
       for (int i=1; i<=N; i++) {
        System.out.print("*");  
       }
       System.out.println();
       } 
   }
    
}
