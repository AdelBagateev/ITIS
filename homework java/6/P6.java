import java.util.*;
public class P6{
	public static boolean prime(int n){
		boolean f = true; 
		for(int i = 2; i * i <= n; i++){
			if(n%i==0){
				f = false;
			}
		}
		return f;  
	}
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(), c = 0; 
		boolean flag, f = false;
		while (n != 0){
			int m = n;
			for(int i = 2; i <= m; i++){
				flag = prime(i);
				if (flag == true){
					while (m % i == 0){
						c+=1;
						m/=i;
						System.out.println(n + " " + i + " " + c);
					}
				}
			}
			if (c > k){
				f = true;
			}
			n = sc.nextInt();
			c=0;
		}
		if (f == true){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	} 
}