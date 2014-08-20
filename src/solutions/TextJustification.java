package solutions;

import java.util.LinkedList;
import java.util.List;

public class TextJustification {
	int current=0;
	List<String> list;
    public List<String> fullJustify(String[] words, int L) {
    	List<String> results = new LinkedList<String>();
        if (words==null||words.length==0) return  results;
        
        list = new LinkedList<String>();
        
        for (String s:words){     	
        	if (!isValid(s.length(),L))
        		results.add(buildWord(list,L));
        	 list.add(s);	
        	 current+=s.length();
        }
        if (list.size()==1)
        	results.add(buildWord(list,L));
        else if (list.size()>1)
        	results.add(buildLastLine(list,L));
        return results;
    }
    private boolean isValid(int next,int L){
    	if ((current+list.size()+next)>L)
    		return false;
    	else     		
    		return true;
    }
    
    private String buildWord(List<String> l,int L){
    	StringBuilder sb = new StringBuilder();
    	for (int num=0;num<l.size();num++){
    		sb.append(l.get(num));
    		for (int i=0;i<allocateSpace(L-current,l.size()-1,num+1);i++)
    			sb.append(" ");
    	}
    	list.clear();
    	current=0;
    	return sb.toString();
    }
    private String buildLastLine(List<String> l,int L){
    	StringBuilder sb = new StringBuilder();
    	for (int num=0;num<l.size()-1;num++){
    		sb.append(l.get(num));
    		sb.append(" ");
    	}
    	sb.append(l.get(l.size()-1));
    	while(sb.length()<L) sb.append(" ");
    	return sb.toString();
    }
    private int allocateSpace(int space,int slots,int index){
    	if (slots==0) return space;
    	if (index>slots) return 0;
    	int result=space/slots;
    	result+=(index<=space%slots)?1:0;
    	return result;
    }     
}
