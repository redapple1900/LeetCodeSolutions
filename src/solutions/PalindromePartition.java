package solutions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartition {
    HashMap<String,Boolean> palindromes = new HashMap<String,Boolean>();
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<List<String>>();
        Deque<List<String>> list_queue= new LinkedList<List<String>>();
        if (s==null||s.length()==0) return results;
        
        Deque<String> remains = new LinkedList<String>();
        
       
        for (int i=1;i<s.length();i++){
            String first_half=s.substring(0, i);
            
            if (isPalindrome(first_half)){
                List<String> list = new ArrayList<String>();
                list.add(first_half);
                list_queue.add(list);
               
                remains.add(s.substring(i,s.length()));
            }
        }
        if (isPalindrome(s)){
        	List<String> list = new LinkedList<String>();
        	list.add(s);
        	results.add(list);
        }
       
        
        while (!remains.isEmpty()){
        	String current_sb=remains.poll();
        	List<String> current_list=list_queue.poll();
       	
            for (int i=1;i<current_sb.length();i++){
                String first_half=current_sb.substring(0, i);
                
                if (isPalindrome(first_half)){
                    List<String> list = new ArrayList<String>();
                    list.addAll(current_list);
                    list.add(first_half);
                    list_queue.add(list);
              
                    remains.add(current_sb.substring(i,current_sb.length()));
                }
            } 
            if (isPalindrome(current_sb)){
            	current_list.add(current_sb);
            	results.add(current_list);
            }
        }      
      return results;  
    }
    
  public boolean isPalindrome(String s){            
    if(palindromes.containsKey(s))
      return (palindromes.get(s)).booleanValue();
    int m=0;int n=s.length()-1;
    while(m<n){
      if(s.charAt(m++)!=s.charAt(n--)){
        palindromes.put(s,new Boolean(false));
        return false;
      }
    }
    palindromes.put(s,new Boolean(true));
    return true;
  }
}