import java.io.*;
import java.util.*;
public class C1W1 {
    // Решение задачи 1 следует писать здесь
    public static int getI(int k, int m, int n) {
      return k;
    }
    public static int getJ(int k, int m, int n) {
      return k+m;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int[][] a = new int[n][n];
        for (int k = 0; k < n - m; k++) {
          a[getI(k,m,n)][getJ(k,m,n)] = k + 1;
        }
        for (int i=0; i<n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
