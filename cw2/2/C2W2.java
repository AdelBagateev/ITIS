import java.util.*;
public class C2W2{
    public static int solve2(int[] a) {
        int s = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] % 5 == 0) {
                s += a[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(solve2(new int[]{1, 5, 10, 0}));
    }
}

