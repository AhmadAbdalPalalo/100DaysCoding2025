// Day 083

public class Day_83_ {
    public static void main(String[] args) {
        int a[] = {21,31,28};
        int jumlah = 0;
        for (int i = 0; i < a.length; i++) {
            jumlah += a[i];
            System.out.print("Indeks "+ i +" = "+ a[i] + " \n");
        }
        System.out.println("= = = = = = = = = = = =");
        System.out.println("Jumlah elemen Array: "+jumlah);
    }
}
