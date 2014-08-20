package solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	Map<Character,Character[]> map; 
	char[] array;
	char[] cons;
	List<String> result;
	public LetterCombinations(){
		map = new HashMap<Character,Character[]>();
		map.put('2', new Character[]{'a','b','c'});
		map.put('3', new Character[]{'d','e','f'});
		map.put('4', new Character[]{'g','h','i'});
		map.put('5', new Character[]{'j','k','l'});
		map.put('6', new Character[]{'m','n','o'});
		map.put('7', new Character[]{'p','q','r','s'});
		map.put('8', new Character[]{'t','u','v'});
		map.put('9', new Character[]{'w','x','y','z'});
	}
    public List<String> letterCombinations(String digits) {
    	result= new LinkedList<String>();
    	if (digits==null||digits.length()==0){
    		result.add("");
    		return result;
    	}
    	array=digits.toCharArray();
    	
    	cons=new char[digits.length()];
    	for (Character ch:map.get(array[0]))	
    		letterCombinationsHelper(0,ch);
    	return result;        
    }
    private void letterCombinationsHelper(int i,char c){
    	cons[i++]=c;
    	if (i==array.length){
    		result.add(new String(cons));
    		return;
    	}
    	for (Character ch:map.get(array[i]))
    		letterCombinationsHelper(i,ch);    	
    }
    
}
