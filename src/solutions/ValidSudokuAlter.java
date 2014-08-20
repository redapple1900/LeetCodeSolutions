package solutions;

public class ValidSudokuAlter {
	public boolean isValidSudoku(char[][] board) {
	    int row, row2;
	    int col, col2;
	    int sqr, sqr2;
	    int a,b,c;

	    for(int i=0;i<9;i++){
	        row = 0; row2 = 0;
	        col = 0; col2 = 0;
	        sqr = 0; sqr2 = 0;
	        for(int j=0;j<9;j++){
	            a = board[i][j] - '0';                      // columns
	            b = board[j][i] - '0';                      // rows
	            c = board[3*(i%3)+j/3][3*(i/3)+j%3] -'0';   // sections
	            if(a>0) row2 ^= 1 << a;
	            if(b>0) col2 ^= 1 << b;
	            if(c>0) sqr2 ^= 1 << c;

	            if(row2 < row || col2 < col || sqr2 < sqr) 
	                return false;
	            row = row2;
	            col = col2;
	            sqr = sqr2;
	        }
	    }
	    return true;
	}

}
