package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {

	boolean[] isUsed;
	int length;
	List<List<Integer>> results;
	List<Integer> res;

	public List<List<Integer>> permuteUnique(int[] num) {
		length = num.length;
		res = new ArrayList<Integer>();
		results = new ArrayList<List<Integer>>();
		isUsed = new boolean[length];
		Arrays.sort(num);
		doPermutation(num);
		return results;
	}

	public void doPermutation(int[] num) {

		if (res.size() == length) {
			results.add(new ArrayList<Integer>(res));
			return;
		}

		for (int i = 0; i < length; i++) {
			if (isUsed[i])
				continue;

			if (i>0&&num[i]==num[i-1]&&(!isUsed[i-1]))
				continue;
			res.add(num[i]);
			isUsed[i] = true;
			doPermutation(num);
			isUsed[i] = false;
			res.remove(res.size() - 1);
		}
	}
}
