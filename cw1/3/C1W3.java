import java.util.*;
public class C1W3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxi = -999999, c = 0, c_final = 0;
		while(n != -1){
			if (n%2==0){
				c++;
			}
			if (n > maxi){
				maxi = n;
				c_final = c;

			}
			n = sc.nextInt();
		}
		System.out.println(maxi + " " + c_final);
	}
}
