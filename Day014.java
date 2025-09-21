public class Abdalllll {
    public static void main(String[] args) {
      
      // Mengubah String jadi tipe data primitif (int).
          String huruf = "21212121";
          int angka = Integer.parseInt(huruf);
          System.out.println("String ke int\t: "+angka);
          
        // Mengubah String jadi tipe data primitif (double).
          String huruf2 = "14.28";
          double angka2 = Double.parseDouble(huruf2);
          System.out.println("String ke double: "+angka2);
          
        // Mengubah String jadi tipe data primitif (byte).  
          String huruf3 = "21";
          byte angka3 = Byte.parseByte(huruf3);
          System.out.println("String ke byte\t: "+angka3);
          
        // Mengubang String jadi tipe data primitif (long).
          String huruf4 = "2121212121212121";
          long angka4 = Long.parseLong(huruf4);
          System.out.println("String ke long\t: "+angka4);
                  
        // Mengubah String jadi tipe data primitif (short).
          String huruf5 = "2121";
          short angka5 = Short.parseShort(huruf5);
          System.out.println("String ke short\t: "+angka5);
          
        // Mengubah String jadi tipe data primitif (boolean).
          String huruf6 = "true";
          boolean pernyataan = Boolean.parseBoolean(huruf6);
          System.out.println("String ke boolean: "+pernyataan);
          
          
        // Mengubah String jadi tipe data primitif (float).
          String huruf7 = "21.21f";
          float angka7 = Float.parseFloat(huruf7);
          System.out.println("String ke float\t: "+angka7);
          
         /* Note: kata parse itu adalah metode untuk mengganti tipe data.
                  kenapa kita menuliskan tipe data sebelum .parseInt dll karena itu menunjukkan bahwa parseInt ini
                  adalah kelas dari Integer, begitu pula dngan tipe data primitif lainnya, kita tinggal mnyesuakan.
          */
          
    }
}
