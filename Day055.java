//Day 055 Evaluasi

import java.util.Scanner;

public class Day055_Evaluasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka = sc.nextInt();
        
        if (angka %2 == 1) {
            System.out.printf("Angka %d adlah angka ganjil!",angka);
        }else if (angka %2 ==0){
            System.out.printf("Angka %d adlah angka genap!",angka);
        }else{
            System.out.println("Arsenal 0 ucl");
        }
    }
}
