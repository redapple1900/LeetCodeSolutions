package solutions;

public class PermutationSequence {
    String result="";
    int[] array;
    public String getPermutation(int n, int k) {
		array=new int[n+1];
		
		for (int i=0;i<n;i++)
			array[i]=i+1;
		array[n]=0;
		
		int perm=1;		
		for (int i=1;i<=n;i++)
			perm*=i;
					
    	doPermutationHelper(array,perm,n,k);
    	return result;
        
    }
    private void doPermutationHelper(int[] a,int perm,int n,int k){
        if (n==1) {
            result+=String.valueOf(a[0]);
            return;
        }
        
        int perm_next=perm/n;
        int i=(k-1)/perm_next;
        result+=String.valueOf(a[i]);
        for (;i<n-1;i++)
        	a[i]=a[i+1];
        doPermutationHelper(a,perm_next,n-1,(k-1)%perm_next+1);
    }
}
