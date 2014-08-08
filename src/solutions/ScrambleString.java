package solutions;

import java.util.Arrays;

public class ScrambleString {
		/*
	    public boolean isScramble(String s1, String s2) {
	    	if (s1.length()<=2)
	    		return s1.equals(s2);
	    	int split=s2.length()/2;
	    	String s=recurScrableHelper(s2.substring(0,split))+recurScrableHelper(s2.substring(split));
	    	return s.equals(s1);
	    }
	    
	    private String recurScrableHelper(String s){
	        if (s.length()==1)
	            return s;
	        else if (s.length()==2)
	            return (new StringBuilder(s)).reverse().toString();
	        int split=s.length()/2;
			return recurScrableHelper(s.substring(split))+recurScrableHelper(s.substring(0,split));	        	        
	    }
	    */
	
	    public boolean isScramble(String s1, String s2) {
	        
	        if (s1.length()==1) return true;
	        
	        char[] c1= s1.toCharArray();
	        char[] c2= s2.toCharArray();
	        
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        if (!Arrays.equals(c1,c2)) return false;
	        
	        for (int i=1;i<=c1.length;i++){
	            if (isScramble(s1.substring(0,i),s2.substring(0,i))&&isScramble(s1.substring(i),s2.substring(i))) return true;
	            if (isScramble(s1.substring(i),s2.substring(0,s2.length()-i))&&isScramble(s2.substring(i),s1.substring(0,s2.length()-i))) return true;
	            
	        }
	        return false;
	    }
	
	}
