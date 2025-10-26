//Day 050 Program Ganjil Genap dengan Ternary.

import java.util.Scanner;

public class Day050_Ganjil_Genap_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Berikan angka: ");
        int angka = sc.nextInt();
        
        String hasil;
        hasil = (angka %2 == 0) ? "Angka " +angka+ " adalah angka GENAP!" : "Angka " +angka+ " adalah angka GANJIL!";
        System.out.println(hasil);
    }
}
