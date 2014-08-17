package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    if (board.length!=9||board[0].length!=9)	
    	return false;
    Map<Integer,Set<Character>> map_row= new HashMap<Integer,Set<Character>>();
    Map<Integer,Set<Character>> map_col= new HashMap<Integer,Set<Character>>();
    Map<Integer,Set<Character>> map_sqr= new HashMap<Integer,Set<Character>>();
    for (int i=0;i<9;i++){
    	map_row.put(i,new HashSet<Character>());
    	map_col.put(i,new HashSet<Character>());
    	map_sqr.put(i,new HashSet<Character>());
    }
    for (int i=0;i<9;i++){
    	for (int j=0;j<9;j++){
    		if (board[i][j]!='.'){
    			
    			if (map_row.get(i).contains(board[i][j]))
    				return false;
    			else map_row.get(i).add(board[i][j]);

    			if (map_col.get(j).contains(board[i][j]))
    				return false;
    			else map_col.get(j).add(board[i][j]);

    			int sqr=(i-i%3)+j/3;
    			if (map_sqr.get(sqr).contains(board[i][j]))
    				return false;
    			else map_sqr.get(sqr).add(board[i][j]);


    		}
    	}
    }
    
    return true;	
    		
    }

}
