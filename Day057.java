// Day 057 Nested loop.

public class Day057_Nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      // loop luar
            for (int j = 1; j <= 2; j++) { // loop dalam
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println(); // untuk jarak
        }
    }
}
