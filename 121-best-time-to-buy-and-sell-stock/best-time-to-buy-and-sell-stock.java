class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitValue=0;
        int mini=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<prices.length;i++)
        {
           mini=Math.min(prices[i],mini);
           maxProfitValue=Math.max(maxProfitValue,prices[i]-mini);
        }
       return maxProfitValue;
    }
}