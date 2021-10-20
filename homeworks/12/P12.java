import java.util.*;
public class P12{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), kit, h = 0; 
		int[][] chess_board = new int [8][8];
		for (int z = 0; z<n; z++){
			int x = sc.nextInt(), y = sc.nextInt(), chess_piece = sc.nextInt();
			chess_board[x][y] = chess_piece;
		}
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8;j++){
				if (chess_board[i][j] == 2){
					chess_board[i][j] = 1;
					for (int i_1 = i-1; i_1 >= 0; i_1-=1){
						if(chess_board[i_1][j]==0){ 
						    chess_board[i_1][j]=1;
					    }
					    else{
					    	break;
					    }
					}
					for (int i_1 = i+1; i_1 < 8; i_1++){
						if (chess_board[i_1][j]==0){
							chess_board[i_1][j]=1;
						}
						else{
							break;
						}
					}
					for (int j_1 = j-1; j_1 >= 0; j_1-=1){
						if (chess_board[i][j_1]==0){
							chess_board[i][j_1]=1;
						}
						else{
							break;}
					}
					for (int j_1 = j+1; j_1 < 8; j_1++){
						if (chess_board[i][j_1]==0){
							chess_board[i][j_1]=1;
						}
						else{
							break;
						}
					}
						
				}
				else if (chess_board[i][j] == 3){
					chess_board[i][j] = 1;
					int i_1 = i - 1, j_1 = j - 1;
					while(h != 1){
						if (chess_board[i_1][j_1] == 0){
							chess_board[i_1][j_1] = 1;
						}
						else{
							break;
						}
						i_1-=1;
						j_1-=1;
						if (i_1==-1 || j_1==-1){
							break;
						}
					}
					i_1 = i + 1; j_1 = j + 1;
					while(h != 1){
						if (chess_board[i_1][j_1] == 0){
							chess_board[i_1][j_1] = 1;
						}
						else{
							break;
						}
						i_1+=1;
						j_1+=1;
						if (i_1==8 || j_1==8){
							break;
						}
					}
					i_1 = i - 1; j_1 = j + 1;
					while(h != 1){
						if (chess_board[i_1][j_1] == 0){
							chess_board[i_1][j_1] = 1;
						}
						else{
							break;
						}
						i_1-=1;
						j_1+=1;
						if (i_1==-1 || j_1==8){
							break;
						}
					}
					i_1 = i + 1; j_1 = j - 1;
					while(h != 1){
						if(chess_board[i_1][j_1] == 0){
							chess_board[i_1][j_1] = 1;
						}
						else{
							break;
						}
						i_1+=1;
						j_1-=1;
						if (i_1==8 || j_1==-1){
							break;
						}
					}
				}
				else if(chess_board[i][j] == 4){

                int[][] d = {
                {-2,-1}, {+2,-1},
                {-2,+1}, {+2,+1},
                {-1,-2}, {-1,+2},
                {+1,-2}, {+1,+2}};
                for (int p=0; p<d.length; p++) {
                    int x2 = i+d[p][0];
                    int y2 = j+d[p][1];
                    if (0 <= x2 && x2 < 8 &&
                        0 <= y2 && y2 < 8) {
                        chess_board[x2][y2] = 1;
                    }
                }
			}
		}
	}
		int m = sc.nextInt();
	    String[] ans = new String[m];
		for(int i = 0; i<m; i++){
			int x1 = sc.nextInt(), y1 = sc.nextInt();
			if(chess_board[x1][y1]==1){
				ans[i] = "YES";
			}
			else{
				ans[i] = "NO";
			}
		}
		for (int i = 0; i<m; i++){
			System.out.println(ans[i]);
		}
	}
}