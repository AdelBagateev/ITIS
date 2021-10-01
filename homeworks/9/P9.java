import java.util.*;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxi = -9999999, mini = 999999, s = 0, s_final = 0, num = 0, maxi_num = 0, mini_num = 0, n_nach = 0;
	    n_nach = n;
	    while (n != 0){
		num++;
		if (n > maxi){
			maxi = n;
			s = 0;
			maxi_num = num; 

		}
		s+=n;
		if (mini == n){
			s_final = s;
		}
		if (n<mini){
			mini=n;
			mini_num = num;
		}
		n = sc.nextInt();
		}
	if (num == 1  || n_nach == 0){
		System.out.println("NO");
	}
	else{
		if (mini_num <= maxi_num){
			System.out.println(0);
		}
		else{
			System.out.println(s_final);
		}
	}		
}
}