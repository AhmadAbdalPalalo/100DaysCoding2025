// Day 048 Membuar Kalkulator dengan switch-case
import java.util.Scanner;

public class Day048_Kalkulator_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        
        System.out.print("Tambah operator: ");
        char operator = sc.next().charAt(0);
        
        int hasil = 0;
        
        switch (operator){
            case '+' -> System.out.println("Hasil penjumlahan: " + (hasil + (angka1 + angka2)));
            case '-' -> System.out.println("Hasil pengurangan: " + (hasil + (angka1 - angka2)));
            case '*' -> System.out.println("Hasil perkalian: " + (hasil + (angka1 * angka2)));
            case '/' -> System.out.println("Hasil pembagian: " + (hasil + (angka1 / angka2)));
            case '%' -> System.out.println("Hasil modulus: " + (hasil + (angka1 % angka2)));
        }
    }
}
