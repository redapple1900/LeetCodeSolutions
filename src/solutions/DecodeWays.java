package solutions;

public class DecodeWays {


	public int numDecodings(String s) {
		if (s==null||s.length()==0) return 0;
		if (s.length()==1) return s.charAt(0)!='0'?1:0;
		int[] res= new int[s.length()];
		if (s.charAt(0)=='0')
            return 0;
		else res[0]=1;    
		if (s.charAt(0)=='1'||(s.charAt(0)=='2'&&s.charAt(1)<='6'))
			res[1]=2;
		else res[1]=1;
		
		if (s.charAt(1)=='0')
			if (s.charAt(0)=='1'||s.charAt(0)=='2')
			res[1]=1;
		    else res[1]=0;
		    
		for (int i=2;i<s.length();i++)
			if (s.charAt(i)=='0')
			    if (s.charAt(i-1)=='1'||s.charAt(i-1)=='2')
			        res[i]=res[i-2];
			    else return 0;
			else if (s.charAt(i-1)=='1'||(s.charAt(i-1)=='2'&&s.charAt(i)<='6'))
				res[i]=res[i-1]+res[i-2];
			else res[i]=res[i-1];
		return res[s.length()-1];

	}
}
