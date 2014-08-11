package solutions;

import java.util.Arrays;

public class LongestPalindromeSubstring {

	public String longestPalindrome(String s) {
		if (s == null)
			return "";
		int length = s.length();
		if (length < 2)
			return s;
		int left = 0, right = 0;
		int max = 0;
		boolean[][] matrix = new boolean[length][length];

		for (int i = 0; i < length; i++)
			Arrays.fill(matrix[i], false);

		for (int i = length - 1; i >= 0; i--)
			for (int j = i; j < length; j++) {
				if (s.charAt(i) == s.charAt(j))
					if (j - i < 2)
						matrix[i][j] = true;
					else
						matrix[i][j] = matrix[i + 1][j - 1];
				if (matrix[i][j] && (j - i) > max) {
					max = j - i;
					left = i;
					right = j + 1;
				}
			}
		if (right>left)
		return s.substring(left,right);
		else return s.substring(left,right+1);
	}
}