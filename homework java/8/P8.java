import java.util.*;
public class P8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		boolean predmaxi = false;
		int n = sc.nextInt(), maxi  = -9999999, s = 0, kit = 0;
		while (n != 0){
			if (n == maxi){
				predmaxi = true; 
			}
			if (n > maxi){
				maxi = n;
				s = 0;
				predmaxi = false;
			}
			if (predmaxi == false){
				s+=n;
			}
			else{
				kit = maxi;
			}
			n = sc.nextInt();
		}
		System.out.println(s - kit);
	}
}