package solutions;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int A[], int B[]) {
		if ((A.length + B.length) % 2 == 0)
			return (getMedian(A, 0, A.length, B, 0, B.length, (A.length
					+ B.length + 1) / 2) + getMedian(A, 0, A.length, B, 0,
					B.length, (A.length + B.length) / 2)) / 2.0d;
		else
			return getMedian(A, 0, A.length, B, 0, B.length,
					(A.length + B.length) / 2);

	}

	private int getMedian(int a[], int al, int ar, int b[], int bl, int br,
			int k) {
		if (al >= ar)
			return b[k - 1];
		if (bl >= br)
			return a[k - 1];
		if (k <= 1)
			return Math.min(a[al], b[bl]);

		int m = ar - al, n = br - bl;

		if (b[m / 2] >= a[n / 2]) {
			if (n / 2 + m / 2 + 1 > k)
				return getMedian(a, al, ar, b, bl, br - n / 2, k);
			else
				return getMedian(a, al + m / 2 + 1, ar, b, bl, br, k
						- (m / 2 + 1));
		} else {

			if (n / 2 + m / 2 + 1 > k)
				return getMedian(a, al, ar - m / 2, b, bl, br, k);
			else
				return getMedian(a, al, ar, b, bl + n / 2 + 1, br, k
						- (n / 2 + 1));
		}
	}

}
