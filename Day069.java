// Evaluasi

import java.util.Scanner;

public class soal_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int hitung = 0;
        
        for (int i = 1; i <= n; i++) {
            int angka = sc.nextInt();
            if (angka > 0) {
                hitung += i;
            }
        }        
            System.out.println("\n" + hitung);
    }
}
