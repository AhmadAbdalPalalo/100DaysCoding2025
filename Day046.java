//Day 046 Membuat daftar Menu menggunakan switch-case
import java.util.Scanner;

public class Day046_Membuat_Menu_dngn_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Pemilihan menu makanan.
        System.out.println("= = Pilihan jenis makanan = =");
        System.out.println("1. Makanan berat.\n2. Makanan Ringan.\n3. Desert.");
        
        System.out.println("\n= = Berikan pilihan Anda! = =");
        System.out.print("Pilihan Anda: ");
        int jenis = sc.nextInt();
        
        switch (jenis){ // switch pertama untuk menentukan jenis makanan.
            case 1: // Case 1 untuk tipe makanan berat.
                System.out.println("\nPilihan Anda > 1. Makanan Berat.");
                System.out.println("1. Bakso.\n2. Mie Ayam.\n3. Ayam geprek.");
                System.out.println("\n= = Berikan pilihan Anda! = =");
                System.out.print("Masukkan menu: ");
                int jenis2 = sc.nextInt();
                switch (jenis2){ // anak switch pertama untuk menentukan menu makanan berat. 
                    case 1: // Pilihan 1
                        System.out.println("1. Bakso.");
                    break;
                    case 2: //Pilihan 2
                        System.out.println("2. Mie Ayam.");
                    break;
                    case 3: //Pilihan 3
                        System.out.println("3. Ayam geprek.");
                    break;
                    default:
                        System.out.println("Menu tidak ditemukan");
                    break;
                }
            break;
            case 2: // Case 2 untuk tipe makanan ringan.
                System.out.println("\nPilihan Anda > 2. Makanan Ringan.");
                System.out.println("1. French Fries.\n2. Spring Rolls.\n3. Chicken Wings.");
                System.out.println("\n= = Berikan pilihan Anda! = =");
                System.out.print("Masukkan menu: ");
                int jenis3 = sc.nextInt();
                switch (jenis3){ // anak switch kedua untuk menentukan menu makanan ringan.
                    case 1: //Pilihan 1
                        System.out.println("1. French Fries.");
                    break;
                    case 2: //Pilihan 2
                        System.out.println("2. Spring Rolls.");
                    break;
                    case 3: //Pilihan 3
                        System.out.println("3. Chicken Wings.");
                    break;
                    default:
                        System.out.println("Menu tidak ditemukan");
                    break;
                }
            break;
            case 3: // Case 3 untuk tipe makanan desert.
                System.out.println("\nPilihan Anda > 3. Desert.");
                System.out.println("1. Chocolate Lava Cake.\n2. Panna Cotta.\n3. Brownies.");
                System.out.println("\n= = Berikan pilihan Anda! = =");
                System.out.print("Masukkan menu: ");
                int jenis4 = sc.nextInt();
                switch (jenis4){ // anak switch ketiga untuk menentukan menu makanan desert.
                    case 1: //Pilihan 1
                        System.out.println("1. Chocolate Lava Cake.");
                    break;
                    case 2: //Pilihan 2
                        System.out.println("2. Panna Cotta.");
                    break;
                    case 3: //Pilihan 3
                        System.out.println("3. Brownies.");
                    break;
                    default: 
                        System.out.println("Menu tidak ditemukan");
                    break;
                }
            break;
            default:
                System.out.println("Pilihan Anda:  Tidak terdata!");
            break;
        }
        
        // Pemilihan menu minuman
        System.out.println("\n= = Minuman = =");
        System.out.println("1. Hot.\n2. Ice.");
        System.out.println("\n= = Berikan pilihan Anda! = =");
        System.out.print("Pilihan Anda: ");
        byte minum = sc.nextByte();
        
        switch (minum){ // switch 2 untuk menentukan jenis minuman.
            case 1: // Case 1 untuk tipe minuman Hot.
                System.out.println("\nPilihan Anda > 1. Hot.");
                System.out.println("1. Teh hangat.\n2. Kopi hytam.\n3. Air putih.");
                System.out.println("\n= = Berikan pilihan Anda! = =");
                System.out.print("Masukkan menu: ");
                int minum2 = sc.nextInt();
                switch (minum2){ // switch 2.1 untuk menentukan menu minuman Hot.
                    case 1: //Pilihan 1
                        System.out.println("1. Teh hangat.");
                    break;
                    case 2: //Pilihan 2
                        System.out.println("2. Kopi hytam.");
                    break;
                    case 3: //Pilihan 3
                        System.out.println("3. Air putih.");
                    break;
                    default:
                        System.out.println("Menu tidak ditemukan");
                    break;
                }
            break;
            case 2: // Case 2 untuk tipe minuman Ice.
                System.out.println("\nPilihan Anda > 2. Ice.");
                System.out.println("1. EsTeh manis.\n2. Es kopi hytam.\n3. Air putih.");
                System.out.println("\n= = Berikan pilihan Anda! = =");
                System.out.print("Masukkan menu: ");
                int minum3 = sc.nextInt();
                switch (minum3){ // switch 2.2 untuk menentukan menu minuman Ice.
                    case 1: //Pilihan 1
                        System.out.println("1. EsTeh manis.");
                    break;
                    case 2: //Pilihan 2
                        System.out.println("2. Es kopi hytam.");
                    break;
                    case 3: //Pilihan 3
                        System.out.println("3. Air putih.");
                    break;
                    default:
                        System.out.println("Menu tidak ditemukan");
                    break;
                }
            break; 
        }
    }
}
