class Solution {
    public int coinChange(int[] coins, int amount) {
       int []coinIndex=new int[amount+1];
       Arrays.fill(coinIndex,-2);
       return minimumCoins(coins,amount,coinIndex);
    }

    static int minimumCoins(int []coins,int amount,int []coinIndex)
    {
        if(amount==0)
        {
            return 0;
        }

        if(amount<0)
        {
            return -1;
        }

        if(coinIndex[amount]!=-2)
        {
            return coinIndex[amount];
        }
        int mini=Integer.MAX_VALUE;

        for(int coin:coins)
        {
            int res=minimumCoins(coins,amount-coin,coinIndex);

            if(res>=0&&res<mini)
            {
                mini=res+1;
            }
        }
        return coinIndex[amount]=mini==Integer.MAX_VALUE?-1:mini;
    }
}