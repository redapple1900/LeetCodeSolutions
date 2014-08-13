package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public List<String> anagrams(String[] strs) {
    	if (strs==null||strs.length==0)
    		return new LinkedList<String>();
    	List<String> results = new LinkedList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
    	for (int i=0;i<strs.length;i++ ){
    		char[] array= strs[i].toCharArray();
    		Arrays.sort(array);
    		String s= new String(array);
    		if (map.containsKey(s)){
    			results.add(strs[i]);
    			if (map.get(s)>=0){
    				results.add(strs[map.get(s)]);
    				map.put(s, -1);
    			}
    		}else
    			map.put(s, i);
    	}
    	return results;
        
    }
}
