// Day 058 Latihan: Mencetak angka 1N dan angka N1.

import java.util.Scanner;

public class Day058_Mencetak_angka_1N_dan_N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berikan angka N (batas): ");
        int batas = sc.nextInt();
        
        System.out.println("\n= = Angka 1 sampai angka N (batas) = =");
        for (int i = 1; i <= batas; i++) {
            System.out.print(i + " ");
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
        
        System.out.println("\n= = Angka N (batas) sampai angka 1 = =");
        for (int i = batas; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
    }
}
