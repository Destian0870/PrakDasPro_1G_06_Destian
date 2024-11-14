package Pertemuan10;
import java.util.Scanner;

public class SearchingNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai = new int[6];
        int key;
        int hasil = 0;
        String banayakNiali;

        System.out.println("Masukan Banyak niali yang akan diinput: ");
        banayakNiali = sc.nextLine();

        for (int i= 0; i< arrNilai.length; i++) {
            System.out.println("Masukan nilai mahasiswa ke-"+(i+1)+" :");
            arrNilai[i] = sc.nextInt();
            
        }
        System.out.println("Masukan nilai yang ingin dicari");
        key = sc.nextInt();

        for (int i= 0; i< arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
                System.out.println();
            }else{
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan");
                System.out.println();
                break;

           
            }            
        }
      
        
    }

    
}
