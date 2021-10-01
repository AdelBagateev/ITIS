import java.util.*;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(), c = 0, s = 0;
		boolean flag = true;
		if (a == 0){
			System.out.println(s);
		}
		else{
			for (int i = 2; i<=999999999; i++){
				for (int j = 2; j*j <= i; j++){
					if (i % j == 0){
						flag = false;
						break;
					}
				}
				if (flag == true){
					s+=i;
					c++;
				}
				flag = true;
			    if (c==a){
				   break;
			    }

			}
	       System.out.println(s);
	    }
	}
}