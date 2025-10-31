class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int [][]dp=new int[n][amount+1];

        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return countCoins(coins,amount,dp,n-1);
    }
    static int countCoins(int []coins,int amount,int [][]dp,int i)
    {
        if(i==0)
        {
            if(amount%coins[0]==0)
            {
                return 1;
            }
            return 0;
        }

        if(dp[i][amount]!=-1)
        {
            return dp[i][amount];
        }

        int notTake=countCoins(coins,amount,dp,i-1);

        int take=0;

        if(coins[i]<=amount)
        {
            take=countCoins(coins,amount-coins[i],dp,i);
        }
        return dp[i][amount]=notTake+take;
    }

}