// Day 089 Method Void
import java.util.Scanner;

public class Day089_Latihan_Method_Void
public static void main(String[] args) {
       ganjilGenap();
    }
    public static void ganjilGenap(){
       Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        short angka = sc.nextShort();
        if (angka %2 == 0) {
            System.out.println(angka + " adalah angka GENAP!");
        }else if (angka %2 == 1) {
            System.out.println(angka + " adalah angka GANJIL!");
        }
    }
}
