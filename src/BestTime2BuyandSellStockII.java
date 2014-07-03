
public class BestTime2BuyandSellStockII {
    public int maxProfit(int[] prices) {
        int total=0;
        for (int j=1;j<prices.length;j++)
            if ((prices[j]-prices[j-1])>=0)
                total+=(prices[j]-prices[j-1]);
            
        return total;   
    }
}
