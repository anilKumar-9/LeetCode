class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
       int prev=nums[0];
        int prev2=0,curr=0;
        for(int i=1;i<nums.length;i++)
        {
            int take=nums[i];
            if(i>1)
            {
                take+=prev2;
            }
            int notake=0+prev;
            curr=Math.max(take,notake);
            prev2=prev;
            prev=curr;
        }
        return prev;
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