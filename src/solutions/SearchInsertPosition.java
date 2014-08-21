package solutions;

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
    	if (A==null||A.length==0) return 0;
    	int low=0,high=A.length-1;
    	if (A[low]>=target) return low;
    	if (A[high]<target) return high+1;
    	while (low<=high){
    		int mid=low+(high-low)/2;
    		
    		if (A[mid]<target&&A[mid+1]>=target)
    			return mid+1;
    		else if (A[mid]>=target)
    			high=mid;
    		else if (A[mid+1]<target)
    			low=mid+1;   		
    	}
    	return low;
    }
}
