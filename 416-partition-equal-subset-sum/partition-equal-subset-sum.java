class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        int n=nums.length;
        
        for(int num:nums)
        {
            totalSum+=num;
        }
        if((totalSum&1)==1)
        {
            return false;
        }
        int halfSum=totalSum/2;
        int [][]dp=new int[n][halfSum+1];
        for(int []rows: dp)
        {
            Arrays.fill(rows,-1);
        }
        return partitionEqual(halfSum,n-1,nums,dp);
    }

    static boolean partitionEqual(int k,int i,int []nums,int [][]dp)
    {
        if(k==0)
        {
            return true;
        }

        if(i==0)
        {
            return nums[0]==k;
        }

        if(dp[i][k]!=-1)
        {
            return dp[i][k]==0?false:true;
        }

        boolean notTake=partitionEqual(k,i-1,nums,dp);
        boolean take=false;
        if(nums[i]<=k)
        {
            take=partitionEqual(k-nums[i],i-1,nums,dp);
        }
        dp[i][k]=take||notTake==true?1:0;

        return take||notTake;
    }

}