// Day 078 Menggunakan berbgaia Method String.

import java.util.Scanner;

public class Day078_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String teks = sc.nextLine();

        System.out.println("\n= = Day 078 Menggunakan berbgaia Method String = =");
        
        // isEmpty
        System.out.println(".isEmpty ? \t" + teks.isEmpty());

        // Length
        System.out.println(".length\t\t: " + teks.length());

        // Uppercase
        System.out.println(".toUpperCase\t: " + teks.toUpperCase());

        // Lowercase
        System.out.println(".toLowerCase\t: " + teks.toLowerCase());

        // replace
        System.out.println(".replace\t\t: " + teks.replace(" ", "_"));
        
        // trim
        System.out.println(".trim\t\t: " + teks.trim());
        
        // substring
        if (teks.length() >= 5) {
            System.out.println(".substring(0,5)\t: " + teks.substring(0, 5));
        } else {
            System.out.println(".substring(0,5)\t: Teks terlalu pendek");
        }
    }
}
