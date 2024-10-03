package Pertemuan5;
import java.util.Scanner;

public class FLOWCHART06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String NamaMakanan;
        int Nasigoreng, Mierebus, Fuyunghai;
        double hargatotal, harganasigoreng, hargamierebus, hargafuyunghai;

        System.out.print("Masukan nama makanan: ");
        NamaMakanan = sc.nextLine();

        System.out.print("harga nasi goreng: ");
        harganasigoreng = sc.nextDouble();
        System.out.print("jumlah nasi goreng: ");
        Nasigoreng = sc.nextInt();

        System.out.print("harga mierebus: ");
        hargamierebus = sc.nextInt();
        System.out.print("jumlah mie rebus: ");
        Mierebus = sc.nextInt();

        System.out.print("harga fuyunghai: ");
        hargafuyunghai = sc.nextDouble();
        System.out.print("jumlah fuyunghai: ");
        Fuyunghai = sc.nextInt();

        hargatotal = (harganasigoreng*Nasigoreng)+(hargamierebus*Mierebus)+(hargafuyunghai*Fuyunghai);
        System.out.println("harga sesbelum diskon "+hargatotal);

             if (hargatotal>100000 && hargatotal<= 200000) 
             {System.out.println("total harga setelah diskon "+(hargatotal*0.02));}
             else if (hargatotal>=200000 && hargatotal<500000) 
             {System.out.println("total harga setelah diskon "+(hargatotal*0.05));}
             else if (hargatotal>500000) 
             {System.out.println("total harga makanan stelah diskon "+(hargatotal*0.1));} 




        
    }
    
}
