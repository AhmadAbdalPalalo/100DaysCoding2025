// Day 047 Latihan: Menentukan Hari.

import java.util.Scanner;

public class Day047_Mnntukan_Hari {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Hari ke-: ");
        byte hariKe = sc.nextByte();
        String hari = null;
        
        switch (hariKe){
            case 1 -> hari = "Al-Ahad";
            case 2 -> hari = "Al-Itsnayn";
            case 3 -> hari = "Ath-Tsulaatsa'";
            case 4 -> hari = "Al-Arbi'aa'";
            case 5 -> hari = "Al-Khamiis";
            case 6 -> hari = "Al-Jumu'ah";
            case 7 -> hari = "As-Sabt";
        }
        System.out.printf("Hari ke-%d adalah hari %s\n",hariKe,hari);
    }
}
