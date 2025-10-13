
import java.util.Scanner;

public class Day036_nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nilai teori: ");
        int ujian = sc.nextInt();
        System.out.print("Nilai praktik: ");
        int praktik = sc.nextInt();
        
        if (ujian >= 75) {
            if (praktik >= 75) {
                System.out.println("LULUSSS");
            }else if (praktik <= 75) {
                System.out.println("Gagal di ujian praktik");
            }
        }else{
            System.out.println("Gagal di ujian teori");
        }  
    }
}
