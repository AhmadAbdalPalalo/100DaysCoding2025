// Menentukan bilangan ganjil dan bilangan genap

import java.util.Scanner;

public class Day37_mnntukanBilangan_ganjil_genap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int nomor = sc.nextInt();

        if(nomor %2 == 0){
            System.out.printf("%d adalah bilangan GENAP!",nomor);
        }else if (nomor %2 == 1){
            System.out.printf("%d  adalah bilangan GANJIL!",nomor);
        }   
    }
}
