package solutions;

import java.util.HashSet;
import java.util.Set;

public class SurroundedRegions {
	Set<Integer> set = new HashSet<Integer>();
	int length;

	public void solve(char[][] board) {
		if (board==null||board.length==0||board[0].length==0) return;
		length=board.length;
		for (int i=1;i<length/2;i++){
			
		}
		for (int i=0;i<length;i++)
			for (int j=0;j<board[0].length;j++)
				if (board[i][j]=='O')
					finder(board,i,j);
	}

	private boolean finder(char[][] board, int row, int col) {
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length)
			return true;
		if (board[row][col] == 'X' || set.contains(row * length + col))
			return false;

		set.add(row * length + col);
		boolean result = (finder(board, row - 1, col)
				|| finder(board, row + 1, col) || finder(board, row, col - 1) || finder(
				board, row, col + 1));
		if (!result) {
			set.remove(row * length + col);
			board[row][col] = 'X';
		}
		return result;

	}
}
