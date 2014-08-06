package solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSetII {
	
	    
	    public List<List<Integer>> subsetsWithDup(int[] num) {
	        List<Integer> list = new LinkedList<Integer>();
	        List<List<Integer>> result = new LinkedList<List<Integer>>();
	    
	        Arrays.sort(num);

	        result.add(list);
	        int pre=Integer.MIN_VALUE;
	        int len_result=1;
	        int len_repeating=1;
	        
	        for (int i=0;i<num.length;i++){
	            if (num[i]!=pre){
	                pre=num[i];
	                len_repeating=result.size();
	            }
	            len_result=result.size();
	            for (int j=len_result-len_repeating;j<len_result;j++){
	                list = result.get(j);
	                List<Integer> temp= new LinkedList<Integer>();
	                temp.addAll(list);
	                temp.add(num[i]);
	                result.add(temp);
	            }
	        }
	        return result; 
	    }
	}

