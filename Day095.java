// Day 095
public class Day95_MencetakDenganParameterVoid {
public static void main(String[] args) {
        // Memanggil method dan mengirim parameter
        cetakNama("Abdal");
        cetakUmur(18);
        cetakPesan("Tetap semangat belajar Java!");
}
    // Method void dengan parameter
    static void cetakNama(String nama) {
        System.out.println("Nama Anda adalah: " + nama);
    }

    static void cetakUmur(int umur) {
        System.out.println("Umur Anda: " + umur + " tahun");
    }

    static void cetakPesan(String pesan) {
        System.out.println("Pesan: " + pesan);
    }
}
