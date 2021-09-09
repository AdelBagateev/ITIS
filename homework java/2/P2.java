import java.io.*;
import java.util.*;

public class P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
	boolean b;
	b = false;
	if (((1/3) * x - 1 <= y) && (y <= (-1/3)*x + 1) && (y <= (1/2)*x + 1) && (y <= (5/4)*x + 2.5) && (y >= (9/10)*x - 1)){
	    b = true;  
	} 
        else if (((1/3) * x - 1 <= y) && (y <= (-1/3)*x + 1) && (y <= (1/2)*x + 1) && (y <= (5/4)*x + 2.5) && (y <= (9/10)*x - 1)) {
	    b = true; 
	    }
        else if (((1/3) * x - 1 <= y) && (y <= (-1/3)*x + 1) && (y <= (1/2)*x + 1) && (y <= (5/4)*x + 2.5) && (y >= (9/10)*x - 1)){
            b = true;
        }
	if (y >= (-1/3)*x + 1){
	    b = false;
	}
        if (b == true) {
	    System.out.println("INSIDE");
        }
	else {
	    System.out.println("OUTSIDE");
	}
    }
}