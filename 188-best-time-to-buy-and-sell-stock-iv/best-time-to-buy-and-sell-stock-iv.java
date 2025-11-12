class Solution {
    public int maxProfit(int k, int[] prices) {   
        int n=prices.length;
        int [][][]dp=new int[n][2][k+1];
        for(int [][] rows:dp)
        {
            for(int []row:rows)
            {
                Arrays.fill(row,-1);
            }
        }
        return profit(prices,0,k,0,dp);
    }

    static int profit(int [] prices,int ind ,int cap,int buy,int [][][]dp)
    {
        if(ind==prices.length||cap==0)
        {
            return 0;
        }
        if(dp[ind][buy][cap]!=-1)
        {
            return dp[ind][buy][cap];
        }
        int profit=Integer.MIN_VALUE;
        if(buy==0)
        {
            profit=Math.max(-prices[ind]+profit(prices,ind+1,cap,1,dp),
                            0+profit(prices,ind+1,cap,0,dp));
        }
        else
        {
            profit=Math.max(prices[ind]+profit(prices,ind+1,cap-1,0,dp),
                            0+profit(prices,ind+1,cap,1,dp));
        }
        return dp[ind][buy][cap]=profit;
    }
}