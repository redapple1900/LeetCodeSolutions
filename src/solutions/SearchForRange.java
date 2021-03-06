package solutions;

public class SearchForRange {
	public int[] searchRange(int[] A, int target) {

		if (A == null || A.length == 0)
			return new int[] { -1, 1 };

		int start = 0, end = A.length - 1, upper = -1, lower = -1;

		if (A[start] > target || A[end] < target)
			return new int[] { lower, upper };

		if (A[end] == target)
			upper = end;
		else
			while (start <=end) {

				int mid = start + (end - start) / 2;

				if (A[mid] < target
						|| (A[mid] == target && A[mid + 1] == target))
					start = mid + 1;
				else if (A[mid] > target)
					end = mid - 1;
				else if (A[mid] == target && A[mid + 1] > target) {
					upper = mid;
					break;
				} else
					continue;
			}

		start = 0;
		end = A.length - 1;
		if (A[start] == target)
			lower = start;
		else
			while (start <=end) {
				int mid = start + (end - start) / 2;

				if (A[mid] < target)
					start = mid + 1;
				else if (A[mid] > target
						|| (A[mid] == target && A[mid - 1] == target))
					end = mid - 1;
				else if (A[mid] == target && A[mid - 1] < target) {
					lower = mid;
					break;
				} else
					continue;
			}
		return new int[] { lower, upper };

	}
}
