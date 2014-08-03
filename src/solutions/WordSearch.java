package solutions;

import java.util.HashSet;
import java.util.Set;

public class WordSearch {

	    Set<Integer> set = new HashSet<Integer>();

	    public boolean exist(char[][] board, String word) {
	        if (board==null||board.length==0||board[0].length==0) return false;
	        if (word==null||word.length()==0) return true;
	        
	        int total=board.length*board[0].length;
	        
	        if (total<word.length()) return false;
	       
	        for (int i =0;i<board.length;i++)
	            for (int j=0;j<board[0].length;j++)
	                if (board[i][j]==word.charAt(0)){
	                    set.add(i*board[0].length+j);
	                    if(dfs(board,word,i,j,0))
	                        return true;
	                }
	        return false;
	    }
	    public boolean dfs(char[][] board,String word,int row,int column,int length){
	        
	        int position=row*board[0].length+column;
	        
	        int next_char= length+1;
	        
	        if (next_char==word.length())
	            return true;
	            
	        if (column+1<board[0].length&&(!set.contains(position+1))&&board[row][column+1]==word.charAt(next_char)){
	                    set.add(position+1);
	                    
	                    if (dfs(board,word,row,column+1,next_char))
	                        return true;
	        }
	        if (column-1>=0&&(!set.contains(position-1))&&board[row][column-1]==word.charAt(next_char)){
	                    set.add(position-1);
	                    if (dfs(board,word,row,column-1,next_char))
	                        return true;
	        }
	        if (row+1<board.length&&(!set.contains(position+board[0].length))&&board[row+1][column]==word.charAt(next_char)){
	                    set.add(position+board[0].length);
	                    if (dfs(board,word,row+1,column,next_char))
	                        return true;
	        }
	        if (row-1>=0&&(!set.contains(position-board[0].length))&&board[row-1][column]==word.charAt(next_char)){
	                    set.add(position-board[0].length);
	                    if (dfs(board,word,row-1,column,next_char))
	                        return true;
	        }
	        set.remove(position);
	        
	        return false;
	    }
	}
