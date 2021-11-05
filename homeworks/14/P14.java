import java.util.*;
public class P14{
	public static int compare(int q, int[] a, int[] b){
		int flag = 0;
		if(a.length < b.length){
			return -1;
		}
		else if (a.length > b.length){
			return 1;
		}
		else{
			for(int i = 0; i<a.length; i++){
				if(a[i]<b[i]){
					flag = -1;
				}
				else if (a[i]>b[i]){
					flag = 1;
				}	
			}
			return flag;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] b = new int[m];
		for (int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}
		System.out.println(compare(q, a, b));	
	}
}