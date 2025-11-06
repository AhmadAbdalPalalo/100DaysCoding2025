// Day 060 Latihan: Mencetak angka ganjil N-1 dan angka genap N-1.

import java.util.Scanner;

public class Day060_Angka_ganjil_N1_angka_genap_N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berikan angka N (batas): ");
        int batas = sc.nextInt();
        
        System.out.println("\n= = Angka GANJIL N (batas) sampai angka 1 = =");
        for (int i = batas; i >= 1; i--) {
            if (i %2 == 1) {
               System.out.print(i + " "); 
            }
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
        
        System.out.println("\n= = Angka GENAP N (batas) sampai angka 1 = =");
        for (int i = batas; i >= 1; i--) {
            if (i %2 == 0) {
               System.out.print(i + " "); 
            }
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
    }
}
