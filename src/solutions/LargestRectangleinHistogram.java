package solutions;

import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangleinHistogram {
	
    public int largestRectangleArea(int[] height) {
        if (height==null) return 0;//Should throw exception
        if (height.length==0) return 0;
        Deque<Integer> value_stack= new LinkedList<Integer>();
        Deque<Integer> index_stack = new LinkedList<Integer>();
        int max=0;

        value_stack.push(Integer.MIN_VALUE);
        index_stack.push(-1);
        
        for  (int i=0;i<height.length;i++){
            if (height[i]<value_stack.peek()){
                //Start calculate the max value
                while (value_stack.peek()>height[i]){              	
                    index_stack.pop();                    
                    max=Math.max(max,value_stack.pop()*(i-1-index_stack.peek()));                  
                }
            }
            value_stack.push(height[i]);
            index_stack.push(i);
        }
        
        
        while(index_stack.peek()!=-1){
        	index_stack.pop();
            max=Math.max(max,value_stack.pop()*(height.length-1-index_stack.peek()));
        }        
        return max;
    }

}
