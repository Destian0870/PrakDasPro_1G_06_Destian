package Pertemuan5;
import java.util.Scanner;

public class PemilihanHariDenganIf06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayName;

        System.out.print("input day number: ");
        dayName = sc.nextInt();

            if (dayName>0 && dayName<6) {System.out.println("weekday");}
            else if (dayName>5 && dayName<8) {System.out.println("weekend");}
            else {System.out.println("invalid number");}
    }
    
}
