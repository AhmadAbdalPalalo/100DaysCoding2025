// Day 043 Menentukan bilangan dengan kelipatan 3, 5 dan kelipatan 3 dan 5

import java.util.Scanner;

public class Day043_Menentukan_Bilangan_Kelipatan_3dan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Berikan angka: ");
        int angka = sc.nextInt();
        
        if (angka %3 == 0) {
            System.out.printf("Angka %d adalah angka dengan kelipatan 3\n", angka);
        }else if (angka %5 == 0) {
            System.out.printf("Angka %d adalah angka dengan kelipatan 5\n", angka);
        }else if (angka %3 == 0 && angka %5 == 0) {
            System.out.printf("Angka %d adalah angka dengan kelipatan 3 dan 5\n", angka);
        }else{
            System.out.println("King Emyu is BACK!!!");
        }   
    }
}
