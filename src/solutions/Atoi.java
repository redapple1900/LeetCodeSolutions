package solutions;

public class Atoi {
	public int atoi(String str) {
		if (str == null)
			return 0;
		String s = str.trim();
		if (s.length() == 0)
			return 0;
		boolean sign = true;

		if (s.charAt(0) == '-') {
			sign = !sign;
			s = s.substring(1);
		} else if (s.charAt(0) == '+')
			s = s.substring(1);
		long result = 0l;

		for (int i = 0; i < s.length() && s.charAt(i) <= '9'
				&& s.charAt(i) >= '0'; i++){
			if (sign){
				result = result * 10 + Long.parseLong(s.substring(i, i + 1));
				if (result > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			}
				
			else {
				result=result*10-Long.parseLong(s.substring(i,i+1));
				if (result < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
				
		}
			return (int) result;
	}
}
