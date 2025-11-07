// Day061_Bilangan_Kelipatan_M_dari_1N.

import java.util.Scanner;

public class Day061_Bilangan_Kelipatan_M_dari_1N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tambahkan angka N: ");
        int n = sc.nextInt();
        System.out.print("Tambahkan angka M: ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
