package solutions;


public class SurroundedRegions {



	public void solve(char[][] board) {
		if (board==null||board.length==0||board[0].length==0) return;
		int m=board.length,n=board[0].length;
		for (int i=0;i<n-1;i++){
			finder(board,0,i);
			finder(board,m-1,i+1);
		}
		for (int i=0;i<m-1;i++){
			finder(board,i+1,0);
			finder(board,i,n-1);
		}
			
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				if (board[i][j]=='O')
					board[i][j]='X';
				else if (board[i][j]=='M')
					board[i][j]='O';
	}

	private void finder(char[][] board, int row, int col) {
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length)
			return;
		if (board[row][col] == 'X' || board[row][col]=='M')
			return;

		board[row][col]='M';
		finder(board, row - 1, col);
		finder(board, row + 1, col);
		finder(board, row, col - 1); 
		finder(board, row, col + 1);
		return;
	}
}
