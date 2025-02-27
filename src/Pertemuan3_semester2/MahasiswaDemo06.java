package Pertemuan3_semester2;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Mahasiswa06[] arrayOfMahasiswa06 = new Mahasiswa06[3];
        
        arrayOfMahasiswa06[0] = new Mahasiswa06();
        arrayOfMahasiswa06[0].nim = "24410706033";
        arrayOfMahasiswa06[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa06[0].kelas = "SIB-1E";
        arrayOfMahasiswa06[0].ipk = (float)3.75;

        arrayOfMahasiswa06[1] = new Mahasiswa06();
        arrayOfMahasiswa06[1].nim = "2341720172";
        arrayOfMahasiswa06[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa06[1].kelas = "TI-2A";
        arrayOfMahasiswa06[1].ipk = (float)3.36;

        arrayOfMahasiswa06[2] = new Mahasiswa06();
        arrayOfMahasiswa06[2].nim = "244107023006";
        arrayOfMahasiswa06[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa06[2].kelas = "TI-2E";
        arrayOfMahasiswa06[2].ipk = (float)3.80;

        System.out.println("NIM   : " + arrayOfMahasiswa06[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa06[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa06[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa06[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa06[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa06[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa06[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa06[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa06[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa06[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa06[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa06[2].ipk);
        System.out.println("-----------------------------------------");

    }
    
}
