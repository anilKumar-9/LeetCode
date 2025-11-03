class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitValue=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int curr=prices[i]-mini;
            maxProfitValue=Math.max(maxProfitValue,curr);
            mini=Math.min(mini,prices[i]);
        }
        return maxProfitValue;
    }
}