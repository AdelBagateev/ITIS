import java.util.*;
public class P9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean  mini_last = false;
		int n = sc.nextInt(), maxi = -9999999, mini = 999999, s = 0, s_final = 0, num = 0, maxi_num = 0, mini_num = 0;
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
		if (mini_num <= maxi_num){
			System.out.println("NO");
		}
		else{
			System.out.println(s_final);
		}
	}
}