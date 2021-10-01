import java.util.*;
public class P7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxi = -999999, predmaxi = 0;
		while(n != 0){
			if (n > maxi){
				predmaxi = maxi;
				maxi = n;
			}
			n = sc.nextInt() ;
		}
		System.out.println(predmaxi);
	}
}