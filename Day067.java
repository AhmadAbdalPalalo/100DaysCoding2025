// Day 067 Membuat Pola Vertikal.

import java.util.Scanner;

public class Day067_Membuat_Pola_Horizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan batas: ");
        int batas = sc.nextInt();
        
        for (int i = 0; i <= batas; i++) {
            System.out.print("-");
        }
    }
}
