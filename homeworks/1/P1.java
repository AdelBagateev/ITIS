import java.io.*;
import java.util.*;
public class P1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     double x = sc.nextDouble();
     double y = sc.nextDouble();
     if ((y >= 1/3 * x - 1) && (y <= -1/3 * x + 1) && (y >= 0.5 * x + 1) && (y >= 1.25 * x + 2.5) && (y >= 0.9 * x - 1)) {
          System.out.println("INSIDE");
     } else {
          System.out.println("OUTSIDE");
     }
  }
}
