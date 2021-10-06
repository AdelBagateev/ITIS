import java.util.*;
public class C1W1{
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
		int n = sc.nextInt(), c = 0, numbers = 0;
		boolean flag = false; 
		while (n != -1){

			for(int i = 3; i <= n; i++){
				if ((n % i == 0) && (prime(i) == true) && (i % 10==1)){
					c+=1;
					break;
				}
			}
			numbers+=1;
			n = sc.nextInt();
		}
		if (numbers == c){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
