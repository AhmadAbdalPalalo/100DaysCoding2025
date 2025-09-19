import java.util.Scanner;

public class Abdal_Ganteng {
    public static void main(String[]args){
    
    Scanner A = new Scanner (System.in);
      
    System.out.println("Haii there...\nIni adalah program biodata mahasiswa sederhana yang saya buat untuk menyelesaikan commit-an Day12 saya.");
      
    System.out.println("\n= = = Selamat mengisi = = =");
      
    System.out.print("Masukkan nama\t: ");
    String nama = A.nextLine();
    System.out.print("Masukkan Usia\t: ");
    byte usia = A.nextByte();
    A.nextLine();
    System.out.print("Masukkan NIM\t: ");
    String nim = A.nextLine();
    System.out.print("Kelas\t: ");
    char kelas = A.next().charAt(0);
    System.out.print("Angkatan\t: ");
    int angkatan = A.nextInt();
            
    System.out.println("\n= = = Biodata Anda = = =");
      
    System.out.printf("Nama Anda\t: %s%nUsia Anda\t: %d%s%n",nama,usia," Tahun");
    System.out.printf("NIM Anda\t: %s%nKelas Anda\t: %s%n",nim,kelas);
    System.out.printf("Angkatan\t: %s%n",angkatan);
            
    System.out.println("\nDengan selesainya mengisi biodata di atas, Anda sudah dinyatakan sebagai fans emyuuu");
            
    
    }
}
