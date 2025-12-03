import java.util.Scanner;

public class Day087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String a [] = {"apel","mangga","jeruk","nanas","mangga"};
    
		System.out.print("Masukkan buah: ");
		String b = sc.nextLine().toLowerCase();
    
		for(int i = 0; i < a.length; i++){
			if (b.equals(a[i])){
				System.out.println("Buah Tersedia");
				break;
			}else{
				System.out.println("Buah tidak tersedia");
				break;
			}
		}
	}
}
