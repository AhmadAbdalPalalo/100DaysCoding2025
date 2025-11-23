// Day 077
import java.util.Scanner;

public class Day_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String apa = sc.nextLine();
        String api = sc.nextLine();
        String upa = sc.nextLine();
        
        String a = apa.substring(0,5);
        String b = api.replace("_", " ");
        String c = upa.trim();
        
        System.out.println("substring: " + a);
        System.out.println("replace\t: " + b);
        System.out.println("trim\t: " + c);
    }
}
