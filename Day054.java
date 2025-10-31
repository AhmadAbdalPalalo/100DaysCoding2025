//Day 054 Keyword continue;.

import java.util.Scanner;

public class Day054_Keyword_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berikan angka: ");
        int angka = sc.nextByte();

        for (int i = angka; i <= 10; i++) {
            if (i == 3 || i == 5 || i == 7){
            continue;
            }
            System.out.println(i);
        }
    }
}
