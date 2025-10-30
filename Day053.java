//Day 053 Keyword break.

import java.util.Scanner;

public class Day053_Keyword_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pilih angka (1 - 7) : ");
        byte angka = sc.nextByte();
        
        switch (angka){
            case 1: //Menggunakan 'break'.
                System.out.println("Anda memilih angka 1.");
                break;
            case 2: //Menggunakan 'break'.
                System.out.println("Anda memilih angka 2.");
                break;
            case 3: //TIDAK menggunakan 'break'.
                System.out.println("Anda memilih angka 3.");
            
            case 4: //Menggunakan 'break'.
                System.out.println("Anda memilih angka 4.");
                break;
            case 5: //Menggunakan 'break'.
                System.out.println("Anda memilih angka 5.");
                break;
            case 6: //TIDAK menggunakan 'break'.
                System.out.println("Anda memilih angka 6.");
                
            case 7: //Menggunakan 'break'.
                System.out.println("Anda memilih angka 7.");
                break;
            default:
                System.out.println("Angka yang Anda diluar dari ketentuan.");
        } 
    }
}
