package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumClosest{
    public int threeSumClosest(int[] num,int target) {
      
        if (num==null||num.length==0)
        	return target;       	
        Arrays.sort(num);
        Set<Integer> set = new HashSet<Integer>();
        int i=0;
        while (i<num.length){
        	int j=i;
        	while (num[j]==num[i]) j++;
        	for(;j<num.length;j++)
        		if (num[j]==num[j-1])
        			continue;
        		else
        			set.add(num[j]+num[i]);
        	i++;
        	while(num[i]==num[i-1]) i++;
        }
        i=0;
        while (i<num.length){
        	if (set.contains(target-num[i]));
        	//TODO
        }
        for (i=0;i<num.length;i++){
        	while (i>1&&num[i]==num[i-1])
        		i++;
        	
        }
        	
        return 0;
    }
}
