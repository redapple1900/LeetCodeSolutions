package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		if (num == null || num.length < 4)
			return results;
		// Map<Integer,List<Integer>> small = new
		// HashMap<Integer,List<Integer>>();
		// Map<Integer,List<Integer>> large = new
		// HashMap<Integer,List<Integer>>();
		Arrays.sort(num);
		/*
		 * for (int i = 0; i < num.length-1; i++) { if (i>0&&num[i]==num[i-1])
		 * continue;
		 * 
		 * for (int j = i+1; j < num.length; j++) { if (j>i+1&&num[j]==num[j-1])
		 * continue;
		 * 
		 * int sum=num[i]+num[j]; if (small.containsKey(target-sum)){
		 * 
		 * int gap=target-sum;
		 * 
		 * List<Integer> small_list=small.get(gap); List<Integer>
		 * large_list=large.get(gap);
		 * 
		 * for (int k=0;k<small_list.size();k++){ if
		 * (small_list.get(k)==i||small_list.get(k)==j) continue; if
		 * (large_list.get(k)==i||large_list.get(k)==j) continue;
		 * System.out.print(gap+" "+sum+"\n"); results.add(new
		 * ArrayList<Integer>
		 * (Arrays.asList(num[i],num[j],num[small_list.get(k)],
		 * num[large_list.get(k)])));
		 * System.out.print(results.get(results.size()-1));
		 * Collections.sort(results.get(results.size()-1)); } }
		 * 
		 * if (small.containsKey(sum)){ small.get(sum).add(i);
		 * large.get(sum).add(j); }else{ small.put(sum, new
		 * ArrayList<Integer>(Arrays.asList(i))); large.put(sum, new
		 * ArrayList<Integer>(Arrays.asList(j))); } } }
		 */

		int s = 0;
		int e = num.length - 1;
		for (s = 0; s < num.length - 3; s++) {
			if (s > 0 && num[s] == num[s - 1]) {
				continue;
			}

			for (e = num.length - 1; e >= s + 3; e--) {
				if (e < num.length - 1 && num[e] == num[e + 1]) {
					continue;
				}
				int local = target - num[s] - num[e];
				int j = s + 1;
				int k = e - 1;
				while (j < k) {

					if (j > s + 1 && num[j] == num[j - 1]) {
						j++;
						continue;
					}
					if (k < e - 1 && num[k] == num[k + 1]) {
						k--;
						continue;
					}

					if ((num[j] + num[k]) > local)
						k--;
					else if ((num[j] + num[k]) < local)
						j++;
					else
						results.add(new ArrayList<Integer>(Arrays.asList(
								num[s], num[j++], num[k--], num[e])));
				}
			}
		}
		return results;
	}
}
