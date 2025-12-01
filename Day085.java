// Day 085

public class Day085_ {
    public static void main(String[] args) {
        int max = 0;
        int a[] = {12,70,21};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
