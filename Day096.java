// Day 096 penugasan_Method_NonVoid

public class penugasan_Method_NonVoid {
public static void main(String[] args) {
            System.out.println(penjumlahan(10,5));
            System.out.println(pengurangan(10,5));
            System.out.println(perkalian(10,5));
        }
        static int penjumlahan(int a, int b){
            System.out.print(a+" + "+b+" = ");
            return a + b;
        }
        static int pengurangan(int a, int b){
            System.out.print(a+" - "+b+" = ");
            return a - b;
        }
        static int perkalian(int a, int b){
            System.out.print(a+" x "+b+" = ");
            return a * b;
        }
}
