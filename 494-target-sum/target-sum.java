class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        
        int totalSum=0;
        for(int num:nums)
        {
            totalSum+=num;
        }
        if(totalSum+target<0)
        {
            return 0;
        }

        if((totalSum+target)%2!=0)
        {
            return 0;
        }


        int s1=(totalSum+target)/2;
        
        int [][]dp=new int[n][s1+1];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return targetSum(nums,s1,dp,n-1);
    }
    static int targetSum(int []nums,int target,int [][]dp,int i)
    {
        if(i==0)
        {
            if(target==0&&nums[i]==0)
            {
                return 2;
            }
            if(target==0||target==nums[0])
            {
                return 1;
            }

          return 0;
        }

        if(dp[i][target]!=-1)
        {
            return dp[i][target];
        }

        int notTake=targetSum(nums,target,dp,i-1);

        int take=0;
        if(nums[i]<=target)
        {
            take=targetSum(nums,target-nums[i],dp,i-1);
        }
        return dp[i][target]=take+notTake;
    }
}