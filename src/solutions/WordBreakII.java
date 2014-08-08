package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakII {

	    Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
	    int length;
	    String word;
	    List<String> results;
	    List<Integer> path;
	    public List<String> wordBreak(String s, Set<String> dict) {
	    	results= new ArrayList<String>();
	        if (s==null||s.length()==0) return results;
	        else if (dict.contains(s)){
	        	results.add(s);
	        	return results;
	        }
	        length=s.length();
	        word=s;
	        
	        List<Integer> starts = new LinkedList<Integer>();
	        starts.add(0);
	        map.put(0, new LinkedList<Integer>());
	       
	        for (int end=1;end<=s.length();end++){
	        	boolean found=false;
	            for (Integer start:starts)
	                if (dict.contains(s.substring(start,end))){
	                	found=true;
	                	map.get(start).add(end);	                	
	                }
	            if(found){
	            	starts.add(0,end);           	    
            	    map.put(end,new LinkedList<Integer>());
	            }
	        }

	        if (starts.get(0)==s.length()){
	        	path=new LinkedList<Integer>();
	        	buildStringDFS(0);
	        }
	        	
	        return results;
	    }
	    private void buildStringDFS(int index){
	    	if (index==length){
	    		StringBuilder builder= new StringBuilder();
	    		int head=path.get(0);//should be zero
	    		for (int i=1;i<path.size();i++){
	    			builder.append(word.substring(head,path.get(i)));
	    			builder.append(' ');
	    			head=path.get(i);
	    		}
	    		builder.append(word.substring(head,index));
	    		results.add(builder.toString());
	    		return;
	    	}
	    	path.add(index);
	    	for (Integer i:map.get(index))
	    		buildStringDFS(i);
	    	path.remove(path.size()-1);
	    }
	}
