// Day 063 Mengalikan angka 1-N.

import java.util.Scanner;

public class Day063_Mengalikan_angka_1N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
        int total = 0;
      
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            total *= i;
        }
        System.out.println("\nTotal jumlah 1 - " + n + " = " + total);
    }
}
