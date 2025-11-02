//Day  056 Perulangan do-while.

import java.util.Scanner;

public class Day056_Perulangan_do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka;
        int total = 0;
        int hitung = -1;
        
        do{
            System.out.print("Masukkan angka (0 agar selesai): ");
            angka = input.nextInt();
            hitung++;
            total+=angka;
        }
        while (angka != 0);
        System.out.println("\nProgram selesai!");
        System.out.println("Jumlah angka: "+hitung);
        System.out.println("Total: "+total);
    }
}
