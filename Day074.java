// Day 074 do while: Program berulang.

import java.util.Scanner;

public class Day074_do_while_Program_Berulang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int apa;
        
        do {
            System.out.println("\n= = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("Apakah Manchester United adalah KING yg aseli? ");
            System.out.println("1. FORRILLLLLLLL");
            System.out.println("2. KING adalah KING Man.United!");
            System.out.println("3. bkn");
            
            System.out.println("\nPilih cepattt!!!!!!!");
            System.out.print("Apaa?? ");
            apa = sc.nextInt();
            
            switch (apa) {
                case 1: System.out.println("\nBetulll bgttt dindaa!");
                break;
                case 2: System.out.println("\nTiada KING selain KING Man.United!");
                break;
                case 3: System.out.println("\nCuki!!!");
                break;
            }
        } 
        while (apa != 1 && apa != 2);
    }
}
