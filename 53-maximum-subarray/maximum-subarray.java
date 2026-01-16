class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int [] type2Prefix=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            type2Prefix[i]=Math.max(type2Prefix[i-1]+nums[i-1],nums[i-1]);
        }

        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            max=Math.max(max,type2Prefix[i]);
        }

        return max;
    }
}