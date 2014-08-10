package solutions;

public class BestTime2BuyandSellStockIII {

	    public int maxProfit(int[] prices) {
	    	int con=0;
	    	int pos=Integer.MIN_VALUE;
	        int total_profits=0;
	        int profits_sofar=0;
	        for (int j=1;j<prices.length;j++){
	            int diff=prices[j]-prices[j-1];
	            if (diff>=0) con++;
	            else con=0;
	            profits_sofar+=diff;
	            profits_sofar=Math.max(0,profits_sofar);
	            if (profits_sofar>total_profits){
	            	total_profits=profits_sofar;
	            	pos=j;
	            }
	           
	        }
	        int result=total_profits;
	        System.out.print(result+" \n");
	        for (int j=prices.length-1;j>0;j--){
	        	if (j<=pos&&j>=pos-con) continue;
	        	int diff=prices[j]-prices[j-1];
	        	profits_sofar+=diff;
	        	profits_sofar=Math.max(0, profits_sofar);
	        	 total_profits=Math.max(total_profits,profits_sofar);
	        }
	        return result+total_profits;   
	    }
	}