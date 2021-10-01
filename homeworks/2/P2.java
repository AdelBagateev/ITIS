import java.io.*;
import java.util.*;
public class P21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		boolean f = true; 
		if (x <= 0){
			if (y > (1.0/3.0)*x-1){
				f = false;
			}
			if (y < (9.0/10.0)*x-1){
				f = false;
			}
			if (y>(1.0/2.0)*x+1){
				f =false ;	
			}

		}
		else{
			if (y > (-1.0/3.0) * x + 1) {
				f = false; 
			}
			if (y < (9.0/10.0)*x-1) {
				f = false;
			}
		}
		if (f == true){
			System.out.println("INSIDE");
		}
		else{
			System.out.println("OUTSIDE");
		}

	}
}