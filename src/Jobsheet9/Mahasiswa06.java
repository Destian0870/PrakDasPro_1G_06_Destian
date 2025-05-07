package Jobsheet9;
import java.util.Scanner;
public class Mahasiswa06 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa06(String nama, String Nim, String Kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai06(int nilai){
        this.nilai = nilai;
    }
}
