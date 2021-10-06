import java.util.*;
public class C1W2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		boolean predmaxi = false;
		int m = sc.nextInt(), n = sc.nextInt(), sum = 501, c = 0, kit = 0, gun = 0;
		while((m != -1)&&(n != -1)){
			c++;
			if (n != 0){
				kit = m*n;
			}
			else{
				kit = m;
			}
			sum = sum - kit;
			if (sum == 0){
				System.out.println("WIN" + " "+c);
				gun = 1;
				break;
			}
			if (sum < 0){
				System.out.println("BUST" + " "+c);
				gun = 1;
				break;
			}
			if (sum - kit*2 == 0){
				System.out.println("DOUBLE" + " "+c);
				gun = 1;
				break;
			}
			m = sc.nextInt(); n = sc.nextInt();
		}
		if (gun==0){
		System.out.println(sum - 1);
	}
	}
}
