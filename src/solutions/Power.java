package solutions;

public class Power {
    public double pow(double x, int n) {
        double result=x;
        double well=1;
        if (n<0) return 1d/(pow(x,-(n+1))*x);
        if (n==0) return 1;
        
        while (n>1){
        	if((n&1)==1) well*=result;
        	n=n>>1;
        	result=result*result;
        }
        result*=well;
        return (n>=0?result:(1d/result));
    }

}
