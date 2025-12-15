// Day 099 Deret Angka Prima.

import java.util.Scanner;

public class Day099_Deret_Angka_Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int pembagi = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }

            if (pembagi == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
