package solutions;

import java.util.Arrays;

public class SudokuSolver {
	int[] row,col,sqr;

    public void solveSudoku(char[][] board) {
        if (board.length!=9||board[0].length!=9)	
        	return;

        row= new int[9]; col= new int[9]; sqr= new int[9];   
        Arrays.fill(row, 0); Arrays.fill(col, 0); Arrays.fill(sqr, 0);   
        for (int i=0;i<9;i++){
        	for (int j=0;j<9;j++){
        		if (board[i][j]!='.'){
        			int num = board[i][j]-'0';
        			int k=(i-i%3)+j/3;
        			row[i]|=1<<num;
        			col[j]|=1<<num;        			
        			sqr[k]|=1<<num;

        		}
        	}
        }//end loop
        
        for (int i=1;i<=9;i++)
        	if (solveSudokuHelper(board,0,0,0,i))
        		return;       

    }
    private boolean solveSudokuHelper(char[][] board,int i,int j,int k,int num){

    	if (i==9) return true;
		while(board[i][j]!='.'){
			j=(j+1)%9;
			if (j%9==0) i++;
			if (i==9) return true;
		}
		k=(i-i%3)+j/3;
    		if (isValid(i,j,k,num)){
    			row[i]|=1<<num;col[j]|=1<<num;sqr[k]|=1<<num;
       			
    			board[i][j]=(char) ('0'+num);
    		}else return false;

    		for (int n=1;n<=9;n++)
    			if (solveSudokuHelper(board,i+(j+1)/9,(j+1)%9,k,n))
    				return true;
    		
			row[i]^=1<<num;col[j]^=1<<num;sqr[k]^=1<<num;			
			board[i][j]='.';
    		
			return false;
    }
    private boolean isValid(int i,int j,int k,int num){
    	if ((row[i]&1<<num)>0)
    		return false;
    	if ((col[j]&1<<num)>0)
    		return false;
    	if ((sqr[k]&1<<num)>0)
    		return false;
    	return true;    	
    }
}
