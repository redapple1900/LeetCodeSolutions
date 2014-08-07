package solutions;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MinWindows {
	    public String minWindow(String S, String T) {
	        
	        
	        String result="";
	        
	        if (S.length()==0||T.length()==0) return result;
	        
	        if (S.length()<T.length()) return result;
	        
	        int count_left=T.length();
	        
	        Deque<Integer> index_queue= new LinkedList<Integer>();
	        
	        Map<Character,Integer> count_map= new HashMap<Character,Integer>();
	        
	        for (int i=0;i<T.length();i++){
	            char temp_char= T.charAt(i);
	            
	            if (count_map.containsKey(temp_char))
	                count_map.put(temp_char,count_map.get(temp_char)+1);
	            else count_map.put(temp_char,1);
	        }
	        
	        for (int i =0;i<S.length();i++){
	            char temp_char= S.charAt(i);
	            if (!count_map.containsKey(temp_char))
	                continue;
	                
	            int count = count_map.get(temp_char);
	            count_map.put(temp_char,count-1);
	            index_queue.add(i);
	                
	            char head = S.charAt(index_queue.peek());
	            if (!index_queue.isEmpty()&&temp_char==head){
	                while(count_map.get(head)<0){
	            		index_queue.poll();
	            		count_map.put(head,count_map.get(head)+1);
	            		head=S.charAt(index_queue.peek());
	            	}
	            	if (count_left==0){
	                String temp_result=S.substring(index_queue.peek(),index_queue.peekLast()+1);
	                if (temp_result.length()<result.length())
	                    result=temp_result;
	                }
	            	
	            }
	              
	            if (count>0)
	                count_left--;
	            if (result==""&&count_left==0)
	                result=S.substring(index_queue.peek(),index_queue.peekLast()+1);

	            
	        }
	          return result;
	    }
	}
