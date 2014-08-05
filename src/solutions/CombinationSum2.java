package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

	    public List<List<Integer>> combinationSum2(int[] num, int target) {
	       	List<List<Integer>> list_path = new LinkedList<List<Integer>>();
	       	List<List<Integer>> res	= new LinkedList<List<Integer>>();
			if (num == null || num.length == 0)
				return list_path;
			Arrays.sort(num);

			Deque<List<Integer>> list_queue = new LinkedList<List<Integer>>();
			Deque<Integer> diff_queue = new LinkedList<Integer>();
			List<Integer> list = new LinkedList<Integer>();
			list.add(-1);
			diff_queue.add(target);
			list_queue.add(list);


			while (!diff_queue.isEmpty()) {
				int diff = diff_queue.poll();
				
				list = list_queue.poll();
				int last = list.get(list.size()-1);
				
				for (int i = last+1; i < num.length; i++) {
					 if (i>0&&num[i-1]==num[i]&&i-1>last)
						continue;
					if (diff >=(num[i]+num[i])) {
						
						diff_queue.add(diff -num[i]);
						
						List<Integer> nlist = new LinkedList<Integer>();
						nlist.addAll(list);
						nlist.add(i);
						list_queue.add(nlist);
					} else if (diff==num[i]){
						list.add(i);
						list.remove(0);
						list_path.add(list);
					}else
						continue;
				}
			}
			
			for (List<Integer> pre:list_path){
				ArrayList<Integer> result= new ArrayList<Integer>();
					for (Integer i:pre)
						result.add(num[i]);
				res.add(result);
			}
			return res; 
	    }
	}


