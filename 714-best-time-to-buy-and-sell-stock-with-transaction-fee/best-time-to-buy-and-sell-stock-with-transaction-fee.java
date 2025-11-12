class Solution {
    public int maxProfit(int[] prices, int fee) {
   int n=prices.length;
        int [][]dp=new int[n][2];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return dpMaxProfit(prices,0,n,0,dp,fee);
    }
    static int dpMaxProfit(int []prices,int i,int n,int buy,int [][]dp,int fee)
    {
        if(i>=n)
        {
            return 0;
        }
        if(dp[i][buy]!=-1)
        {
            return dp[i][buy];
        }
        int profit=0;
        if(buy==0)
        {
            profit=Math.max(0+dpMaxProfit(prices,i+1,n,0,dp,fee),
                            -prices[i]+dpMaxProfit(prices,i+1,n,1,dp,fee));
        }
        if(buy==1)
        {
             profit=Math.max(0+dpMaxProfit(prices,i+1,n,1,dp,fee),
                                +prices[i]-fee+dpMaxProfit(prices,i+1,n,0,dp,fee));
        }
        return dp[i][buy]=profit;
    }
}