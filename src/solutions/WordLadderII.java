package solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadderII {

	    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
	    	//long t1=System.currentTimeMillis();
	        List<List<String>> results= new ArrayList<List<String>>();
	        if (dict.size() == 0)
				return results;
	        
	        int min=Integer.MAX_VALUE;
	        
	        Queue<String> queue= new ArrayDeque<String>();
	        
			Map<String,LinkedList<String>> map = new HashMap<String,LinkedList<String>>();
			
			Map<String,Integer> ladder = new HashMap<String,Integer>();
			for (String string:dict){
			    ladder.put(string, Integer.MAX_VALUE);
			    map.put(string, new LinkedList<String>());//Find the next
			}
				
			ladder.put(start, 0);
			
			queue.add(start);
			
			dict.add(end);
			
			while (!queue.isEmpty()) {
			   
				String word = queue.poll();
				
				int step = ladder.get(word)+1;
				
				if (step>min) break;
				
				for (int i = 0; i < word.length(); i++){
				   StringBuilder builder = new StringBuilder(word); 
					for (char ch='a';  ch <= 'z'; ch++){
						builder.setCharAt(i,ch);
						String new_word=builder.toString();				
						if (ch!=word.charAt(i)&&(ladder.containsKey(new_word))&&(step<=ladder.get(new_word))) {
						    ladder.put(new_word, step);
						    map.get(new_word).add(word);						    
						    if (new_word.equals(end))
						    	min=step;
						    else
						    	queue.add(new_word);
						}//End if dict contains new_word
					}//End:Iteration from 'a' to 'z'
				}//End:Iteration from the first to the last
			}//End While

	    	
	    	for (String str:map.get(end)){
		    	LinkedList<String> result = new LinkedList<String>();
		    	result.add(end);
	    		result.addFirst(str);
	    		LinkedList<String> backtrace= map.get(str);
		    	while (backtrace.size()>0){//The recent added word is not the start
		    		int index=backtrace.size()-1;//Find the position of the word
		    		String back= backtrace.get(index);//Find one ancestor
		    		result.add(0,back);//Add the ancestor to the result list
		    		if (index>0)
		    			backtrace.remove(index);// Remove the recent added ancestor						    		
		    		backtrace=map.get(back);//Continue back tracking
		    	}
		    	results.add(result);
	    	}			
	    	//long t2=System.currentTimeMillis();
	    	//System.out.print("Consumes: "+(t2-t1)+"\n");
			return results;        
	    }
	}
