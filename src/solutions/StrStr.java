package solutions;

public class StrStr {
	public String strStr(String haystack, String needle) {

		if (needle == null || needle.length() == 0)
			return haystack;

		if (haystack == null || haystack.length() < needle.length())
			return null;

		int len_n = needle.length(), len_h = haystack.length(), start = -1;

		for (int i = 0; i < len_h - len_n + 1; i++) {
			if (len_n == 1 && haystack.charAt(i) == needle.charAt(0)) {
				start = i;
				break;
			}
			if (haystack.charAt(i) != needle.charAt(0)
					|| haystack.charAt(i + len_n - 1) != needle
							.charAt(len_n - 1))
				continue;

			int j;
			for (j = i + 1; j < i + len_n - 1; j++) {
				if (haystack.charAt(j) != needle.charAt(j - i))
					break;
			}
			if (j == i + len_n - 1) {
				start = i;
				break;
			}

		}
		if (start == -1)
			return null;

		return haystack.substring(start);
	}

}
