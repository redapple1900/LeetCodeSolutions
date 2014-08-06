package solutions;

import java.util.ArrayList;
import java.util.List;

public class Queens{
	int total;
    int limit;
    List<String[]> results;
    String[] strings;
    StringBuilder std;
    List<Integer> index;
    public List<String[]> solveNQueens(int n) {
    		total=n;
    		strings=new String[n];
    		
        	std=new StringBuilder("");
        	for (int i=0;i<n;i++)
        		std.append(".");
        	
        	index = new ArrayList<Integer>();
        	results=new ArrayList<String[]>();   
        	
	        limit=(1<<n)-1;
	        dfs(0,0,0);
	        return results;
	    }
	    private void dfs(int h,int r,int l){
	        if (h==limit){
	        	for (int i=index.size()-1;i>=0;i--){
	        		int gap=h-index.get(i);//Be careful about the last index
	        		h=index.get(i);
	        		
	        		int n=0;
	        		while (gap>0){
	        			n++;
	        			gap>>=1;
	        		}
	        		
	        		StringBuilder answer=new StringBuilder(std);
	        		answer.setCharAt(n-1, 'Q');
	        		
	        		strings[i]=answer.toString();
	        	}	        	
	           results.add(strings);	
	           strings=new String[total];
	           return;
	        }
	        
	        index.add(h);
	        
	        int pos=limit&(~(h|r|l));
	        
	        while (pos>0){
	            int p= pos&(-pos);
	            
	            pos-=p;
	            
	            dfs(h+p,(r+p)>>1,(l+p)<<1);	            
	        }	        
	        index.remove(index.size()-1);
	    }
        
    }

