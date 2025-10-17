import java.util.Scanner;

public class Day040_Mmbuat_kalkulator_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Angka 1 : ");
        int angka1 = sc.nextInt();
        System.out.print("Angka 2 : ");
        int angka2 = sc.nextInt();
        System.out.print("Operator: ");
        char operator = sc.next().charAt(0);
        
        if (operator == '+') {
            System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
        }else if (operator == '-') {
            System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));
        }else if (operator == 'x') {
            System.out.println(angka1 + " x " + angka2 + " = " + (angka1 * angka2));
        }else if (operator == '/') {
            System.out.println(angka1 + " / " + angka2 + " = " + (angka1 / angka2));
        }else if (operator == '%') {
            System.out.println(angka1 + " % " + angka2 + " = " + (angka1 % angka2));
        }else{
            System.out.println("PULANG!!!");
        }
    }
}
