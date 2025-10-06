//Operator Perbandingan < dan >

package Abdal_100dayscoding;
public class NewClass {
    public static void main(String [] args) {
       
     //Cara pertama 
       int a = 21;
       int b = 12;
       System.out.printf("A = %d\nB = %d\n",a,b);
       System.out.println("Apakah A lebih BESAR dari B? " + (a > b)); //Operator perbandingan (lebih besar)
       System.out.println("Apakah A lebih KECIL dari B? " + (a < b)); //Operator perbandingan (lebih kecil)
       
       System.out.println(""); //ini hanya print kosong untuk memberikan jarak pada cara pertama dan cara kaedua
       
     //Cara kedua
       boolean kecil = a < b;
       boolean besar = a > b;
        System.out.printf("A lebih KECIL dari B? %b\nA lebih BESAR dari B? %b\n",kecil,besar);

      /*
      Di daya 29 ini atau Operator Perbandingan (< dan >), yang dimana kita membdandingkan dua data dengan pernyataan
      lebih besar atau lebuh kecil.
      */
    }
}
