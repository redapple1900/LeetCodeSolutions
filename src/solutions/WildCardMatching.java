package solutions;

public class WildCardMatching {
    public boolean isMatch(String s, String p) {
    	int len_s=s.length();
    	int len_p=p.length();
    	
    	int count=0;
    	for( int i=0;i<len_p;i++)
    		count+=(p.charAt(i)!='*')?1:0;
    	if (count>len_s) return false;
    	
    	boolean[][] matrix=new boolean[len_s+1][len_p+1];
    	matrix[0][0]=true;
    	for (int i=1;i<=len_p;i++)
    		if (p.charAt(i-1)=='*')
    			matrix[0][i]=true;
    		else 
    			break;
    	
    	for (int i=1;i<=len_s;i++)
    		for (int j=1;j<=len_p;j++)
    			if (p.charAt(j-1)==s.charAt(i-1)||p.charAt(j-1)=='?')
    				matrix[i][j]=matrix[i-1][j-1];
    			else if (p.charAt(j-1)=='*')
    				matrix[i][j]=matrix[i-1][j]||matrix[i-1][j-1]||matrix[i][j-1];
    			else 
    				matrix[i][j]=false;
    		
    	return matrix[len_s][len_p];
    }
}
