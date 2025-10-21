class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
        dp[0]=nums[0];
        int neg=0;
        for(int i=1;i<nums.length;i++)
        {
            int take=nums[i];
            if(i>1)
            {
                take+=dp[i-2];
            }
            int notake=0+dp[i-1];
            dp[i]=Math.max(take,notake);
        }
        return dp[nums.length-1];
    }

    static int helperFun(int ind,int[]nums,int []dp)
    {
        if(ind==0)
        {
            return nums[0];
        }

        if(ind<0)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }

        int pick=nums[ind]+helperFun(ind-2,nums,dp);
        int notpick=0+helperFun(ind-1,nums,dp);

        return dp[ind]= Math.max(pick,notpick);
    }
}