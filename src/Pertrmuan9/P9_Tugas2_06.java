package Pertrmuan9;
import java.util.Scanner;

public class P9_Tugas2_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int urutan=1;
        String nama;

       do {System.out.print("Masukan politeknik dengan urutan- "+urutan+" (ketik 'selesai' untuk mengakhiri) = ");
       nama = sc.nextLine();
       System.out.println();
       if (nama.equalsIgnoreCase("selesai")) {
           break;
        }
        for (int i=1; i<=5; i++) {
            if (i==1) {
                System.out.println("Peserta badminton");
                for (int j=1; j<=5; j++) {
                    System.out.println("Masukan peserta dengan urutan-"+j+" = ");
                    nama = sc.nextLine();
                    
                }
                System.out.println();
                }
                if (i==2) {
                    System.out.println("Peserta tenisMeja");
                    for (int j=1; j<=5; j++) {
                        System.out.println("Masukan peserta dengan urutan-"+j+" = ");
                        nama = sc.nextLine();
                        
                    }
                    System.out.println();   
                }
                if (i==3) {
                    System.out.println("Peserta volly");
                    for (int j=1; j<=5; j++) {
                        System.out.println("Masukan peserta dengan urutan-"+j+" = ");
                        nama = sc.nextLine();
                        
                    }
                    System.out.println();   
                }    
                if (i==4) {
                    System.out.println("Peserta basket");
                    for (int j=1; j<=5; j++) {
                        System.out.println("Masukan peserta dengan urutan-"+j+" = ");
                        nama = sc.nextLine();
                            
                        }
                        System.out.println();       
                     }
            
                 }urutan++; 
            } while (true);
        }
    }
                
           

  

