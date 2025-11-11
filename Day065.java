// Day 065 Membuat Bilangan Faktorial.

import java.util.Scanner;

public class Day065_Membuat_Bilangan_Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka Faktorial: ");
        int angka = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= angka; i++) {
            total *= i;
        }
        System.out.println("Hasil dari " + angka + " faktorial (" + angka + "!) adalah: " + total);
    }
}
