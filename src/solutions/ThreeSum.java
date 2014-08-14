package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		if (num==null||num.length<3) return results;
		
		Arrays.sort(num);
		for (int i = 0; i < num.length-2; i++) {
			if (i>0&&num[i]==num[i-1]) continue;				
			int target=-num[i];
			int j=i+1;			
			int k=num.length-1;		
			while (j<k){
				
				if (j>i+1&&num[j]==num[j-1]){
					j++;
					continue;
				}
				if (k<num.length-1&&num[k]==num[k+1]){
					k--;
					continue;
				}
									
				if ((num[j]+num[k])>target)
					k--;
				else if ((num[j]+num[k])<target)
					j++;
				else
					results.add(new ArrayList<Integer>(Arrays.asList(num[i],num[j++],num[k--])));				
			}
		}
		return results;
	}
}
