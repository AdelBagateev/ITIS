import java.util.*;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean  mini_last = false;
		int n = sc.nextInt(), maxi = -9999999, mini = 999999, s = 0, s_final = 0  ;
		while (n != 0){
			if (n > maxi){
				maxi = n;
				s = 0;
			}
			s+=n;
			if (mini == n){
				s_final = s;
			}
			if (n<mini){
				mini=n;
			}
			n = sc.nextInt();
		}
		System.out.println(s_final);
	}
}