// Day 086

public class Day086_ {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int a[] = {12,70,21};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
