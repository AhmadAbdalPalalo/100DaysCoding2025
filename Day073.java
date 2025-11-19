//Day 073 Penjumlahan angka (berhenti ketika menginput angka negatif).

import java.util.Scanner;

public class Day073_Perulangan_BerhentiJika_Mines {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka;
        int total = 0;
        int hitung = -1;
        
        do{
            System.out.print("Masukkan angka (angka - agar selesai): ");
            angka = sc.nextInt();
            hitung++;
            total+=angka;
        }
        while (angka >= 0);
        System.out.println("\nProgram selesai!");
        System.out.println("Jumlah angka\t: "+hitung);
        System.out.println("Total\t\t: "+total);
    }
}
