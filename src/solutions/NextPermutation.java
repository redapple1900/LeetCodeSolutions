package solutions;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] num) {
        
        if (num==null||num.length==0) return;
        
        int i=num.length-1;
        int left=0;
        
        while(i>0)
            if (num[i-1]>=num[i])
                i--;
            else break;

        if(i>0){
            left=i-1;
            i=num.length-1; 
            
            while (i>left)
                if (num[i]<=num[left])
                	i--;
                else break;            
            //swap
            int temp= num[left];
            num[left]=num[i];
            num[i]=temp;
            
            left++;
        }
        Arrays.sort(num,left,num.length);

        return;
    }
}