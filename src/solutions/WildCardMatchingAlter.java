package solutions;

public class WildCardMatchingAlter {
	public boolean isMatch(String s,String p){
		char[] as = s.toCharArray();
		char[] ap = p.toCharArray();
		return isMatchRecursion(0,0,as,ap);
	}
	private boolean isMatchRecursion(int s,int p,char[] as,char[] ap){
		int ls=as.length,lp=ap.length;
		if (s>=ls&&p>=lp) return true;
		if (s<ls&&p<lp&&((as[s]==ap[p])||ap[p]=='?'))
			return isMatchRecursion(s+1,p+1,as,ap);
		else if (p<lp&&ap[p]=='*'){
			boolean result=false;
			while(p<lp&&ap[p]=='*') 
				p++;
			if (p>=lp) 
				return true;
			while (s<ls){
				int ts=s,tp=p;
				while (ts<ls&&tp<lp){
					if (as[ts]!=ap[tp]&&ap[tp]!='?')
						break;
					if (ap[tp]=='*') 
						break;
					ts++;tp++;
				}
				if (ts>=ls&&tp>=lp) 
					return true;
				if (tp<lp&&ap[tp]=='*')
					return result||isMatchRecursion(ts,tp,as,ap);
				if (ts>=ls) 
					return false;
				s++;
			}
			return result;
		}
		else return false;
	}
}
