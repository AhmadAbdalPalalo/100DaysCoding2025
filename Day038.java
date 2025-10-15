import java.util.Scanner;

public class Day038_mnntuknBlngan_positif_ngtif_nol {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka > 0) {
            System.out.printf("%d adlah bilangan POSITIF!\n",angka);
        }else if (angka < 0) {
            System.out.printf("%d adlah bilangan NEGATIF!\n",angka);
        }else{
            System.out.printf("%d adlah angka NOL!\n",angka);
        }
    }
}
