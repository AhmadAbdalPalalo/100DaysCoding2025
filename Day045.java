// Day045 Percabangan menggunakan switch-case

import java.util.Scanner;

public class Day045_Percabangan_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan pilihan: ");
        byte pilihan = sc.nextByte();
        
        switch (pilihan){ 
            case 1: //Kondisi 1 (if).
                System.out.println("Aku ganteng!");
            break; //Pemisah antar case.
            case 2: //Kondisi 2 (else if).
                System.out.println("Emyu jago!");
            break; //Pemisah antar case.
            case 3: //Kondisi 3 (else if).
                System.out.println("Aku, kamu, king emyu!");
            break; //Pemisah antar case.
            default: //Apabila ketiga kondisi diatas tidak terpenuhi (else).
                System.out.println("Tiada king selain king emyuuu!");
        }
    }
}
