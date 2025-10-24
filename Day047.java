// Day 047 Latihan: Menentukan Hari.

import java.util.Scanner;

public class Day047_Mnntukan_Hari {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Hari ke-: ");
        byte hariKe = sc.nextByte();
        
        switch (hariKe){
            case 1 -> System.out.println("Al-Ahad");
            case 2 -> System.out.println("Al-Itsnayn");
            case 3 -> System.out.println("Ath-Tsulaatsa'");
            case 4 -> System.out.println("Al-Arbi'aa'");
            case 5 -> System.out.println("Al-Khamiis");
            case 6 -> System.out.println("Al-Jumu'ah");
            case 7 -> System.out.println("As-Sabt");
            default -> System.out.println("Angka tidak valid! Masukkan angka 1-7.");
        }
    }
}
