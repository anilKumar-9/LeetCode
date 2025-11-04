class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n][n+1];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return longestSubsequence(nums,0,-1,n,dp);
    }
    static int longestSubsequence(int []nums,int i, int prev,int n,int [][]dp)
    {
        if(i==n)
        {
            return 0;
        }

        if(dp[i][prev+1]!=-1)
        {
            return dp[i][prev+1];
        }
        int notTake=0+longestSubsequence(nums,i+1,prev,n,dp);

        int take=0;
        if(prev==-1||nums[i]>nums[prev])
        {
            take=1+longestSubsequence(nums,i+1,i,n,dp);
        }
        return dp[i][prev+1]=Math.max(take,notTake);
    }
}