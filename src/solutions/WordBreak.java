package solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordBreak{
    public boolean wordBreak(String s, Set<String> dict) {
        if (s==null||s.length()==0) return false;
        else if (dict.contains(s)) return true;
        
        List<Integer> starts = new LinkedList<Integer>();
        starts.add(0);
       
        for (int end=1;end<=s.length();end++){
        	boolean found=false;
            for (Integer start:starts)
                if (dict.contains(s.substring(start,end))){
                	found=true;
                	break;
                }
            if(found)  starts.add(0,end);
        }

                    
        return (starts.get(0)==s.length());
        /*
        for (int i=0;i<s.length();i++)
            if (dict.contains(s.substring(0,i)))
                queue.add(s.substring(i));
        
        while (!queue.isEmpty()){
            String temp = queue.poll();
            if (dict.contains(temp)) return true;
            for (int i=0;i<temp.length();i++)
                if (dict.contains(temp.substring(0,i)))
                    queue.add(s.substring(i));
        }
        return false;
        */
    }
}
