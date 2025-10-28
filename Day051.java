// Day 051 Perulangan for.

import java.util.Scanner;

public class Day051_Perulangan_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Tabungan awal: ");
        int tabungan1 = sc.nextInt();
        System.out.print("Lama menabung (hari): ");
        int lama = sc.nextInt();
        
        int total = 0;
        
        System.out.printf("\n= = Rincian tabungan selama %d hari = =\n",lama);
        for (int i = 1; i <= lama; i++) {
            int tabungan2 = tabungan1 + (i - 1) * 2000;
            total += tabungan2;
            
            System.out.println(i + ". Hari ke-" +i+ " : Rp "+tabungan2);
        }
        System.out.println("\nTotal Tabungan: " + total);
        double rataRata = total / lama;
        System.out.println("Rata-rata tabungan: " + rataRata);
    }
}
