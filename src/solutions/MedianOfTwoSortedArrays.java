package solutions;

public class MedianOfTwoSortedArrays {
	int[] a;
	int[] b;

	public double findMedianSortedArrays(int A[], int B[]) {
		a = A;
		b = B;
		int len_a = a.length, len_b = b.length;

		if ((len_a + len_b) % 2 == 0)
			return (getKth(0, len_a, 0, len_b, (len_a + len_b) / 2 + 1) + getKth(
					0, len_a, 0, len_b, (len_a + len_b) / 2)) / 2.0d;
		else
			return getKth(0, A.length, 0, B.length, (len_a + len_b) / 2 + 1);

	}

	private int getKth(int al, int ar, int bl, int br, int k) {

		if (al >= ar)
			return b[bl+k - 1];
		if (bl >= br)
			return a[al+k - 1];
		if (k <= 1)
			return Math.min(a[al], b[bl]);

		int m = ar - al, n = br - bl;

		if (b[bl + n / 2] > a[al + m / 2]) {
			if (n / 2 + m / 2 >=k - 1)
				return getKth(al, ar, bl, bl+n/2, k);
			else
				return getKth(al + m / 2 + 1, ar, bl, br, k - (m / 2 + 1));
		} else {

			if (n / 2 + m / 2 >= k - 1)
				return getKth(al, al+m/2, bl, br, k);
			else
				return getKth(al, ar, bl + n / 2 + 1, br, k - (n / 2 + 1));
		}
	}

}
