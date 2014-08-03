package solutions;

public class Interleave{
    public boolean isInterleave(String s1, String s2, String s3) {

	        if (s1==null||s2==null||s3==null) return false;
	        if ((s1.length()+s2.length())!=s3.length()) return false;
            return isInterleaveHelper(s1,0,s2,0,s3,0);
    }
    
    public boolean isInterleaveHelper(String s1,int i1,String s2,int i2,String s3,int i3){
        if (i1==s1.length()&&s2.length()==i2&&i3==s3.length()) return true;
        boolean b1=false,b2=false;
        if (i1<s1.length()&&s3.charAt(i3)==s1.charAt(i1))
            b1=isInterleaveHelper(s1,i1+1,s2,i2,s3,i3+1);
        if (i2<s2.length()&&s3.charAt(i3)==s2.charAt(i2))
            b2=isInterleaveHelper(s1,i1,s2,i2+1,s3,i3+1);
        return b1||b2;
    }
}
