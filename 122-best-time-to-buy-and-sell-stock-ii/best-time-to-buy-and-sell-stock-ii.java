class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][]dp=new int[n][2];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return dpMaxProfit(prices,0,n,0,dp);
    }
    static int dpMaxProfit(int []prices,int i,int n,int buy,int [][]dp)
    {
        if(i==n)
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
            profit=Math.max(0+dpMaxProfit(prices,i+1,n,0,dp),
                            -prices[i]+dpMaxProfit(prices,i+1,n,1,dp));
        }
        if(buy==1)
        {
             profit=Math.max(0+dpMaxProfit(prices,i+1,n,1,dp),
                                prices[i]+dpMaxProfit(prices,i+1,n,0,dp));
        }
        return dp[i][buy]=profit;
    }
}