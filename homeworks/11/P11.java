import java.util.*;
public class P11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), number_of_elements = n * m, number = 1;
		if ((n==0)||(m==0)){
			System.out.println();
		}
		else if(n==1){
			for (int i = 1; i<=number_of_elements;i++){
				System.out.print(i + " ");
			}
		}
		else if(m==1){
			for (int i = 1; i<=number_of_elements;i++){
				System.out.println(i + " ");
			}
		}
		else{
			boolean flag = true, flag_2 = true;
			int[][] matrix = new int[n][m];
			for (int j = 0; j<m; j++){
				matrix[0][j] = number;
				number +=1;
			}
			for (int i = 1; i<n; i++){
				matrix[i][m-1] = number;
				number +=1;
			}
			for (int j = m-2; j!=0; j-=1){
				matrix[n-1][j] = number;
				number +=1;
			}
			for (int i = n-1; i!=0; i-=1){
				matrix[i][0] = number;
				number +=1;
			}
			int i = 1;
			int j = 0;
			int order = 1;
			while( number <= number_of_elements){
				if (order == 1){
					j++;
				}
				else if (order == 2){
					i++;
				}
				else if (order == 3){
					j-=1;
				}
				else if (order == 4){
					i-=1;
				}
				matrix[i][j] = number;
				number++;
				if ((order == 1)&&(matrix[i][j + 1] != 0)){
					order = 2;
				}
				else if ((order == 2)&&(matrix[i + 1][j] != 0)){
					order = 3;
				}
				else if ((order == 3)&&(matrix[i][j - 1] != 0)){ 
					order = 4;
				}
				else if ((order == 4)&&(matrix[i - 1][j] != 0)){
					order = 1;
				}

			}
			for (int t = 0; t<n; t++){
				for (int r = 0; r < m; r++){
					System.out.print(matrix[t][r] + " ");
				}
				System.out.println();
		    }
		}	
	}
}