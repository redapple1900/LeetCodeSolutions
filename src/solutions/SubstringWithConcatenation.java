package solutions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenation {

	    public List<Integer> findSubstring(String S, String[] L) {
		        List<Integer> result = new LinkedList<Integer>();		        
		        if (S==null||S.length()==0||L.length==0) return result;
		        
		        int length=L[0].length();
		        int limit=length*L.length;
		        if (S.length()<limit) return result;//Impossible to meet the given condition
		        //Store all words in L and their frequency
		        Map<String,Integer> map_full = new HashMap<String,Integer>();
		        //Store all words counted in S and their frequency
		        Map<String,Integer> map_working=new HashMap<String,Integer>();
		        //Initiation of the map_full;
		        for (int i=0;i<L.length;i++){
		        	if (map_full.containsKey(L[i]))
		        		map_full.put(L[i], map_full.get(L[i])+1);
		        	else map_full.put(L[i], 1);
		        }
		        	
		 		//Iterate from the end of S
		        for (int i= S.length();i>=limit;i--){//If i < limit, it is impossible to meet the given condition
		        			        	
		        	int start=i-length;
		        	String word=S.substring(start,start+length);
		        	//Check each word
		        	while (map_full.containsKey(word)&&map_full.get(word)>0){
		        		
		        		map_full.put(word, map_full.get(word)-1);
		        		if (map_working.containsKey(word))
		        		map_working.put(word,map_working.get(word)+1);
		        		else map_working.put(word, 1);	
		        		//Meet the condition
		        		if (i-start==limit){
		        			result.add(0,start);
		        			break;
		        		}
		        		
		        		start-=length;
		        		if (start>=0)
		        			word=S.substring(start,start+length);
		        	}
		        	//Reset both maps
		        	Iterator<String> iterator=map_working.keySet().iterator();
		        	while (iterator.hasNext()){
		        		 word = (String) iterator.next();
		        		 map_full.put(word, map_full.get(word)+map_working.get(word));
		        	}
		        	map_working.clear();
		        }
		        return result;
	    }
	}
