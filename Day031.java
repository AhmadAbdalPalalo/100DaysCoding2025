import java.util.Scanner;

public class Perbandingan_AND {
public static void main (String [] args) { 

Scanner sc = new Scanner (System.in);

System.out.print("Masukkan nilai tugas\t: ");
        byte tugas = sc.nextByte();

        System.out.print("Masukkan nilai ujian\t: ");
        byte ujian = sc.nextByte();
        
        boolean hasil = (tugas >= 75 && ujian >= 75);
        System.out.println("Keterangan kelulusan\t: " + hasil);  
    }
}
