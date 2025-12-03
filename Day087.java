import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String a [] = {"apel","mangga","jeruk","nanas","mangga"};
    
		System.out.print("Masukkan buah: ");
		String b = sc.nextLine().toLowerCase();
        int anu = 0;
		for(int i = 0; i < a.length; i++){
			if (b.equals(a[i])){
			    anu++;
			}
		}
		if(anu>0){
		    System.out.println("Buah Tersedia");
		}else{
            System.out.println("Buah tidak  Tersedia");
		}
	}
}
