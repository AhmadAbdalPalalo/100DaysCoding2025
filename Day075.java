// Day 075 
import java.util.Scanner;

public class Day075_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan kata/kalimat: ");
        String nama = sc.nextLine();
        
        // Menghitung jumlah karakter yang diinput.
        System.out.println("Length: " + nama.length());
        
        // Mengubah karakter menjadi capslk.
        System.out.println("toUppercase: " + nama.toUpperCase());
        
        // Mengubah karakter menjadi Lower wCase.
        System.out.println("toLowercase: " + nama.toLowerCase());
    }
}
