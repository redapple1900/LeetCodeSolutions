package solutions;

import java.util.Arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    if (board.length!=9||board[0].length!=9)	
    	return false;

    int[] row= new int[9]; int[] col= new int[9];int[] sqr= new int[9];   
    Arrays.fill(row, 0); Arrays.fill(col, 0); Arrays.fill(sqr, 0);
    for (int i=0;i<9;i++){
    	for (int j=0;j<9;j++){
    		if (board[i][j]!='.'){
    			int num = board[i][j]-'0';
    			if ((row[i]&1<<num)>0)
    				return false;
    			else row[i]|=1<<num;

    			if ((col[j]&1<<num)>0)
    				return false;
    			else col[j]|=1<<num;

    			int sqr_num=(i-i%3)+j/3;
    			if ((sqr[sqr_num]&1<<num)>0)
    				return false;
    			else sqr[sqr_num]|=1<<num;

    		}
    	}
    }    
    return true;	
    		
    }

}
