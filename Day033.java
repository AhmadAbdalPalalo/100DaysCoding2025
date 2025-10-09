import java.util.Scanner;

public class Day033 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Lu fan King Emyu? ");
    boolean emyu = sc.nextBoolean();
        
    System.out.println("Kamu ngefans? " + !emyu);
    System.out.println("beneran ngga? " + emyu);
    
        /*
        Operator NOT berfungsi untuk membalikkan nilai logika (boolean) dari suatu ekspresi.
        Jika suatu kondisi bernilai True, operator NOT akan menjadikannya False, dan sebaliknya,
        jika kondisi bernilai False, operator NOT akan menjadikannya True. 
        */
    }
}
