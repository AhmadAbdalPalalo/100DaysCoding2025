// Day 098 > Deret Fibonacci.

import java.util.Scanner;

public class Day098_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte a = 0;
        byte b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            b = (byte) (a + b);
            a = (byte) (b - a);
        }
    }
}
