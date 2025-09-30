// DAY 023 Latihan: Program luas persegi panjang.
 
import java.util.Scanner;
public class Abdalllll {
    public static void main(String[] args) {
      
        Scanner D = new Scanner (System.in);
         System.out.print("Masukkan panjang: ");
         int panjang = D.nextInt();
         
         System.out.print("Masukkan lebar: ");
         int lebar = D.nextInt();
         
         long luas = panjang*lebar;
         System.out.println("Luas persegi panjang: " + luas);
    }
}
