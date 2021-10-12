import java.util.*;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(), n_1 = 1, k_1 = 1, n_k_1 = 1;
		int [] arr = new int [n+1];
		for(int i = 1; i<=n; i++){
			n_1 *= i;
		}
		for(int k = 0; k <=n; k++){ 
			for(int i = 1; i <= k; i++){
				k_1 *= i;
			}
			for(int i = 1; i<=(n-k); i++){
				n_k_1 *= i;  
			}
			arr[k] = n_1 / (k_1*n_k_1);
			n_k_1 = 1;
			k_1 = 1;
		}
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
