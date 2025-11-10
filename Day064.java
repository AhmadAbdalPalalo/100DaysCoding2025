// Day 064 Latihan: Mencetak hasil M pangkat N.

import java.util.Scanner;

public class Day064_Mencetak_M_pangkat_N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka M: ");
        int m = sc.nextInt();
        System.out.print("Masukkan angka N: ");
        int n = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= m;
        }
        System.out.println(m + " pangkat " + n + "= " + total);
    }
}
