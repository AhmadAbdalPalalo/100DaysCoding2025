// Day 059 Latihan: Mencetak angka ganjil 1-N dan angka genap N-1.

import java.util.Scanner;

public class Day059_angka_ganjil_1N_genap_N1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berikan angka N (batas): ");
        int batas = sc.nextInt();
        
        System.out.println("\n= = Angka GANJIL 1 sampai angka N (batas) = =");
        for (int i = 1; i <= batas; i++) {
            if (i %2 == 1) {
               System.out.print(i + " "); 
            }
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
        
        System.out.println("\n= = Angka N (batas) GENAP sampai angka 1 = =");
        for (int i = batas; i >= 1; i--) {
            if (i %2 == 0) {
               System.out.print(i + " "); 
            }
        }
        System.out.println(""); //Pemisah agar tidak berdempet.
    }
}
