// Day 071 Membuat  Segitiga siku-siku TERBALIK.

import java.util.Scanner;

public class Day072_Membuat_Segitiga_siku2_TERBALIK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("");
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
