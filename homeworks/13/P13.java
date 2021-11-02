import java.util.*;
public class P13{
	public static int convert(int q, int[] a){
		int ans=0;
		int z = q;
		for (int i = 0; i<a.length; i++){
			if (i > 0){
				for(int j= 1; j<i; j++){
					z *= q; 
				}
			}
			else{
				z = 1;
			}
			ans += a[i] * z;
			z = q; 
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int [m];
		for (int i = 0; i < m; i++){
			a[i] = sc.nextInt();
		}
		int ans = convert(q, a);
		System.out.println(ans); 
	}
}