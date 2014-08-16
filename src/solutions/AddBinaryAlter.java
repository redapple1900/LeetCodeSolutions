package solutions;

public class AddBinaryAlter {

		public String addBinary(String a, String b) {
		    int m = a.length();
		    int n = b.length();
		    int carry = 0;
		    String res = "";
		    // the final length of the result depends on the bigger length between a and b, 
		    // (also the value of carry, if carry = 1, add "1" at the head of result, otherwise)
		    int maxLen = Math.max(m, n);
		    for (int i = 0; i < maxLen; i++) {
		        // start from last char of a and b
		        // notice that left side is int and right side is char
		        // so we need to  minus the decimal value of '0'
		        int p = i < m ? a.charAt(m - 1 - i) - '0' : 0;
		        int q = i < n ? b.charAt(n - 1 - i) - '0' : 0;
		        int tmp = p + q + carry;
		        carry = tmp / 2;
		        res = tmp % 2 + res;
		    }
		    return (carry == 0) ? res : "1" + res;
		}
}
