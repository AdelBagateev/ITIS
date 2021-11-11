import java.util.Arrays;
public class P15 {
    public static int[] subtract(int q, int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - get(b, i);
        }
        return carry(q, c);
    }
    public static boolean less(int q, int[] a, int[] b){
        boolean result = false;
        if (a.length < b.length){
            result = true;
        } else if (a.length == b.length){
            for (int i = a.length - 1; i >= 0; i--){
                if (a[i] > b[i]){
                    result = false;
                    break;
                } else if (a[i] < b[i]){
                    result = true;
                    break;
                }
            }
        }
        return  result;
    }
    public static int[] multiply(int q, int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];
        for (int i=0; i<n; i++) {
            int[] d = multiplyDigit(q, b, a[i]);
            d = shift(q, d, i);
            c = addWithCarry(q, c, d);
        }
        return c;
    }
    public static int[] multiplyDigit(int q, int[] a, int digit) {
        int n = a.length;
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = a[i] * digit;
        }
        c = carry(q, c);
        return c;
    }
    public static int[] shift(int q, int[] a, int k) {
        int n = a.length;
        int[] c = new int[n+k];
        for (int i=0; i<n; i++) {
            c[i+k] = a[i];
        }
        return c;
    }
    public static int[] addWithCarry(int q, int[] a, int[] b) {
        int[] c = add(q, a, b);
        c = carry(q, c);
        return c;
    }
    public static int[] add(int q, int[] a, int[] b) {
        int n = a.length;
        if (n < b.length) {
            n = b.length;
        }
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = get(a,i) + get(b,i);
        }
        return c;
    }
    public static int[] carry(int q, int[] a) {
        int c = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] += c;
            c = a[i] / q;
            a[i] %= q; // a[i] = a[i] % q
            if (a[i] < 0) {
                a[i] += 10;
                c = -1;
            }
        }
        if (c > 0) {
            a = extend(a, n + 1);
            a[n] = c;
            n++;
        }
        while (n > 0 && a[n - 1] == 0) {
            n--;
        }
        a = extend(a, n);
        return a;
    }
    public static int[] extend(int[] a, int n) {
        int[] b = new int[n];
        for (int i = 0; i < Math.min(a.length, n); i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static int get(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        } else {
            return a[i];
        }
    }
    public static int[] divide(int q, int[] a, int[] b){
        int[] r = new int[a.length];
        int[] e = {1};
        while (less(q, b, a)){
            a = subtract(q, a, b);
            r = addWithCarry(q, r, e);
        }
        return r;
    }
    public static int[] remainder(int q, int[] a, int[] b){
        return subtract(q, a, multiply(q, divide(q, a, b), b));
    }
    public static void main(String[] args) {
    }
}