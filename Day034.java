import java.util.Scanner;

public class Day034 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
 
        System.out.print("Masukkan harga per: ");
        int harga = sc.nextInt();
        
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = sc.nextInt();
        
        double diskon = 0.10;
        
        int totalBelanja = harga * jumlah; //Operator Aritmatika
        double potongan = totalBelanja * diskon;
        System.out.println(potongan);
        System.out.println("Nama pembeli: " + nama);
        System.out.println("Total belanja tanpa diskon: " + totalBelanja);

        if (totalBelanja > 500000 && jumlah > 5) { //Operator Perbandingan dan Logika
            double hargaDiskon =  totalBelanja - potongan;
            
            System.out.println("Total bayar stlh diskon: "+hargaDiskon);
            System.out.println("Diskonn diterapkan");
        }else{
            System.out.println("Tidak ada diskon");
        }
    }
}
