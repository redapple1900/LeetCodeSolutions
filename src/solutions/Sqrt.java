package solutions;

public class Sqrt {
    public int sqrt(int x) {

        
    if (x<=1<<30){
        int max=1<<15;
        int min=0;
        
        while (min+1 < max) {
            int candidate = (min+max)/2;
            if (candidate * candidate > x) 
                max = candidate-1;
            else min = candidate;
        }
        if (max*max <= x) 
            return max;
    
        return min;
    }else{
        long max=1<<16;
        long min =1<<15;
        while (min+1<max){
            long mid=(min+max)/2;
            if (mid*mid>x)
                max=mid-1;
            else 
                min=mid;
        }
        if (max*max<=x)
            return (int)max;
        return (int)min; 
    }
    }

}
