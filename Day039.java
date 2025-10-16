//Day 039 Membuat daftar menu sederhana dengan if

import java.util.Scanner;

public class Day039_mmbuat_Menu_dngn_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("= = MENU CAFE EMYU = =");
        System.out.println("1. Aren \t:Rp 10.000");
        System.out.println("2. Matcha \t:Rp 12.000");
        System.out.println("3. Red Red \t:Rp 11.000");
        System.out.println("4. Tea \t\t:Rp 7.000");
        
        System.out.println("\n= = Varian Hot & Ice = =");
        System.out.println("Varian Hot + Rp 3.000");
        System.out.println("Varian Ice + Rp 5.000");
        
        System.out.print("\nPilihan pesanan Anda : ");
        String pilih = sc.nextLine();
        System.out.print("Pilih varian: ");
        String varian = sc.nextLine();
        
        //harga dari 4 menu
        int aren = 10000;
        int matcha = 12000;
        int redred = 11000;
        int tea = 7000;
        
        //harga tambahan varian
        int hot = 3000;
        int ice = 5000;
        
        if (pilih.equalsIgnoreCase("Aren")) {
            if (varian.equalsIgnoreCase("hot")) {
                System.out.println("Pesanan Anda: Aren HOT\nHarga: " + (aren + hot));
            }else if (varian.equalsIgnoreCase("ice")) {
                System.out.println("Pesana Anda: Aren ICE\nHarga: " + (aren + ice));
            }
        }else if (pilih.equalsIgnoreCase("Matcha")) {
            if (varian.equalsIgnoreCase("hot")) {
                System.out.println("Pesanan Anda: Matcha HOT\nHarga: " + (matcha + hot));
            }else if (varian.equalsIgnoreCase("ice")) {
                System.out.println("Pesana Anda: Matcha ICE\nHarga: " + (matcha + ice));
            }
        }else if (pilih.equalsIgnoreCase("Red Red")) {
            if (varian.equalsIgnoreCase("hot")) {
                System.out.println("Pesanan Anda: Red Red HOT\nHarga: " + (redred + hot));
            }else if (varian.equalsIgnoreCase("ice")) {
                System.out.println("Pesana Anda: Red Red ICE\nHarga: " + (redred + ice));
            }
        }else if (pilih.equalsIgnoreCase("Matcha")) {
            if (varian.equalsIgnoreCase("hot")) {
                System.out.println("Pesanan Anda: Tea HOT\nHarga: " + (tea + hot));
            }else if (varian.equalsIgnoreCase("ice")) {
                System.out.println("Pesana Anda: Tea ICE\nHarga: " + (tea + ice));
            }
        }else{
            System.out.println("Pigiko tidur dinda");
        }
    }
}
