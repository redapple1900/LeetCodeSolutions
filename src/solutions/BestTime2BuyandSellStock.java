package solutions;

public class BestTime2BuyandSellStock {
    public int maxProfit(int[] prices) {
        int valley=Integer.MAX_VALUE;
        int peak=Integer.MIN_VALUE;
        int max=0;
        int[] first=new int[prices.length];
        int[] second = new int[prices.length];
        for (int j=0;j<prices.length;j++){
            valley=Math.min(valley,prices[j]);
            if (j>0)
            first[j]=Math.max(first[j-1], prices[j]-valley);
        }
        for (int j=prices.length-1;j>=0;j--){
        	peak = Math.max(peak, prices[j]);
        	if (j<prices.length-1)
        		second[j]=Math.max(second[j+1], peak-prices[j]);
        	max=Math.max(max, first[j]+second[j]);
        }
        for (int i=0;i<prices.length;i++){
        	System.out.print(first[i]+" ");
        	
        	System.out.print(second[i]+" ");
        	System.out.print("\n");
        }
        return max;   
    }

}
