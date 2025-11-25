// Day 079
import java.util.Scanner;

public class Day079_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String usname = "abdal";
        String pw = "1428";
        
        System.out.print("Apakah sudah ada akun? ");
        boolean apa = sc.nextBoolean();
        if (apa == false) {
                System.out.println("\nBuat akun Anda!");
            
            while (apa);
                System.out.print("Berikan username: ");
                usname = sc.next();
                System.out.print("Berikan password: ");
                pw = sc.next();
                
                System.out.println("\n= = Akun berhasil dibuat = =");
                System.out.println("Username: " + usname);
                System.out.println("Password: " + pw);
            
        }else if (apa == true) {
            do {
                System.out.println("\nLogin ke akun Anda!");
                System.out.print("Masukkan Username: ");
                String usnm = sc.next();
                System.out.print("Masukkan Password: ");
                String pewe = sc.next();
                if (usnm.equalsIgnoreCase(usname) && pewe.equals(pw)) {
                    System.out.println("= = = = = = = = = = =");
                    System.out.println("Login Anda berhasil!");
                    System.out.println("= = = = = = = = = = =");
                    break;
                }else{
                    System.out.println("= = = = = = = = = =");
                    System.out.println("Akses Anda ditolak!");
                    System.out.println("= = = = = = = = = =");
                }
            } while (true);
        }
    }
}
