package solutions;

import java.util.LinkedList;
import java.util.List;

public class AddBinary {
    public String addBinary(String a, String b) {
    	List<Integer> list =new  LinkedList<Integer>();
        
    	int la=a.length()-1,lb=b.length()-1,carry=0;
    	int ca=0,cb=0,res=0;
    	while(la>=0||lb>=0){
    		  		
    		if (la>=0)
    			ca=a.charAt(la--)-'0';
    		else ca=0;
    		if (lb>=0)
    			cb=b.charAt(lb--)-'0';
    		else cb=0;
    		int sum=(ca+cb+carry);
    		res=sum%2;
    		carry=sum/2;
    		list.add(0,res);	
    	}
    	if (carry>0) list.add(0,carry);
    	StringBuilder sb=new StringBuilder();
    	for (Integer i:list)
    		sb.append(i);
    	return sb.toString();
    }
}
