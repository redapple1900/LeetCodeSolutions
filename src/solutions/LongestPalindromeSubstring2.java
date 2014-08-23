package solutions;

public class LongestPalindromeSubstring2 {

	 public  String longestPalindrome(String s) {
	            int start =0,maxlength=1,n=s.length(),low,high;
	            
	            if(n==0) return ""; // empty String
	            if(n==1)  //1 character
	            return s.substring(0,1);
	             // One by one consider every character as center point of 
	            // even and length palindromes
	            for (int i=1;i<n; i++)
	            {
	                // Find the longest even length palindrome with center points
	                // as i-1 and i.  
	                for (low=i-1,high=i;low >=0 && high < n && s.charAt(low)==s.charAt(high);low--,high++)
	                {
	                    if((high-low+1) > maxlength)
	                    {
	                        start= low;
	                        maxlength= high-low+1;
	                    }
	                }

	                // Find the longest odd length palindrome with center 
	               // point as i
	                for(low=i-1,high=i+1;low >=0 && high < n && s.charAt(low)==s.charAt(high);low--,high++)
	                {
	                    if((high-low+1) > maxlength)
	                    {
	                        start= low;
	                        maxlength= high-low+1;
	                    }
	                }
	            }
	            return s.substring(start,maxlength);

	        }


}
