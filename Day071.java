// Day 071 Membuat Pola Segitiga siku-siku.

import java.util.Scanner;

public class Day071_Membuat_Pola_Segitiga_sikuSiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("");
        
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
