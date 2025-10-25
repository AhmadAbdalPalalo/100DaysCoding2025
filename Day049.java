//Day 049 Operator Ternary

import java.util.Scanner;

public class Day049_Operator_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Berikan nilai: ");
        int nilai = sc.nextInt();
        
        String hasil;
        hasil = (nilai >= 50) ? "Kamu lulusss!" : "Kerja bagus! Ayo ngulang tahun depan.";
        System.out.println(hasil);
    }
}
