import java.util.*;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i = 1, s = 1, c = 1, z = 0;
		while (c <= n){
			i++;
			for(int j = 2; j*j <= i; j++){
				if(i % j == 0){
					s+=j + i/j;
					if (j*j==i){
						s-=j;
					}
				}
			}
			if (s == i){
				c++;
				z+=i;
			}
			s = 1;
		}
		System.out.println(z);
	}
}
