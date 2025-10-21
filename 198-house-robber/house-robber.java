class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helperFun(nums.length-1,nums,dp);
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