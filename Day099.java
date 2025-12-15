// Day 099 Deret Angka Prima.

import java.util.Scanner;

public class Day099_Deret_Angka_Prima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tam = 0;

        for (int i = 2; tam < n;) {
            boolean b = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    b = false;
                    continue;
                }
            }
            if (b) {
                System.out.print(i + " ");
                tam++;
            }
            i++;
        }
    }
}
