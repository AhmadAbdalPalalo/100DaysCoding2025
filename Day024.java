// DAY 024 Latihan: Program luas lingkaran.
import java.util.Scanner;

public class Abdallagiigalau {
  public static void main (String [] args) {
        Scanner E = new Scanner (System.in);
        
        System.out.print("Masukkan jari-jari lingkaran (r): ");
        int r = E.nextInt();
        
        final double phi = 3.14;
        System.out.println("Nilai phi: " + phi);
        
        System.out.println("\n= = Penyelesaian = =\n");
        
        System.out.println("Untuk mencari luas lingkaran tersebut\nkita menggunakan rumus 'phi x r x r' \n");
        
        System.out.println("Dik: r = " + r);
        System.out.println("     phi = " + phi);
        System.out.println("Dit: luas = ...?\n");
        
        System.out.println("Penye: phi x r x r");
     
        double luas = (phi * r * r);
        System.out.println("Maka luas lingkarannya yaitu = " + luas);
        
        
    }
}
