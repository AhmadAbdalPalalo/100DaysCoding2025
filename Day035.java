import java.util.Scanner;

public class Day035 {
public static void main (String [] args) {

Scanner sc = new Scanner (System.in);

System.out.print("Masukkan angka 1: ");
int angka1 = sc.nextLine();
System.out.print("Masukkan angka 2: ");
int angka2 = sc.nextLine();

if(angka1 > angka2) {
  System.out.printf("Angka %d itu lebih besar dari %d.", angka1, angka2;
}else if (angka1 < angka2) {
    System.out.printf("Angka %d itu lebih besar dari %d.", angka2, angka1;
}else{
  System.out.println("Kamu fans Emyuu!");
}

}
}
