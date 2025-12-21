
import java.util.Scanner;

public class soal_9_warcoding{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah hari kerja: ");
        int n = sc.nextInt();
        
        int hadir = 0;
        int tepat = 0;
        int telat = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Hari ke-"+i);
            System.out.print("Masuk? ");
            int a = sc.nextInt();
            System.out.print("Tepat? ");
            int b = sc.nextInt();
            
            if (a == 1) hadir++;
            if (b == 1) tepat++;
            if (a == 1) telat++;
        }
        System.out.println("");
        System.out.println("Hadir: "+hadir);
        System.out.println("Tepat waktu: "+tepat);
        System.out.println("Telat: "+telat);
    }
}
