// Day 052 Perulangan while.

import java.util.Scanner;

public class Day052_Perulangan_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka (0 agar selesai): ");
        int angka = sc.nextInt();
        
        int hitung = 0;
        int jumlah = 0;
        
        while (angka != 0){
            jumlah += angka;
            hitung++;
            
            System.out.print("Masukkan angka (0 agar selesai): ");
            angka = sc.nextInt();
        }
        
        if (hitung == 0) {
            System.out.println("Tidak ada angka yang dihitung!");
        }else{
            double rata = jumlah / hitung;
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Banyak angka: " + hitung);
            System.out.println("Rata-rata: " + rata);
        }
    }
}
