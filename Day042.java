
import java.util.Scanner;

public class Day042_Latihan_PenentuanGajiBersih {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("= = Pemasukan = =");
        System.out.print("Masukkan Gaji: ");
        int gaji = sc.nextInt();
        System.out.println("\n= = Pengeluaran Bulanan = =");
        System.out.print("Masukkan Biaya hidup: ");
        int bulanan = sc.nextInt();
        System.out.print("Masukkan Tagihan Listrik: ");
        int listrik = sc.nextInt();
        System.out.print("Masukkan Tagihan PDAM: ");
        int pdam = sc.nextInt();
        
        System.out.println("\n= = Gaji Bersih = =");
        int gajiBersih = gaji - (bulanan + listrik + pdam);
        System.out.println("Gaji Bersih: " + gajiBersih);          
    }
}
