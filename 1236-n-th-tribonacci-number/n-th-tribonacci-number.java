class Solution {
    public int tribonacci(int n) {
       int []dp=new int[n+1];
       return findingTribonacci(n,dp);
    }

    public int findingTribonacci(int n,int []dp)
    {
         if(n==0)
        {
            return 0;
        }
        if(n<=2)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        return dp[n]=findingTribonacci(n-1,dp)+
                     findingTribonacci(n-2,dp)+
                     findingTribonacci(n-3,dp);
    }
}