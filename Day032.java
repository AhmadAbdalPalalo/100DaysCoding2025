import java.util.Scanner;
public class Day032 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
        System.out.print("Masukkan angka 1: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka 2: ");
        int angka2 = sc.nextInt();
        
        if (angka1 >= 21 || angka2 >= 21) {
            System.out.println("Kamu fans emyu!");
        }else{
            System.out.println("Aku cinta Emyuu!");
         }
    }
}
