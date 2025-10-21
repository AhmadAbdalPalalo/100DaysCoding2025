// Day 044 Program predikat nilai A,B,C,D,E.

import java.util.Scanner;

public class Day044_Program_Predikat_Nialai_ABCDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nilai: ");
        byte nilai = sc.nextByte();
        
        System.out.println("\n= = Grade Anda = =");
      
        //Pemeriksaan Grade
        if (nilai < 0 && nilai >100) {
            System.out.println("Ada masalah! Input ulang nilai Anda.");
        }else if (nilai <= 100) {
            System.out.println("Grade: A");
        }else if (nilai < 90) {
            System.out.println("Grade: B");
        }else if (nilai < 80) {
            System.out.println("Grade: C");
        }else if (nilai < 70) {
            System.out.println("Grade: D");
        }else if (nilai < 60) {
            System.out.println("Grade: E");
        }
    }
}
