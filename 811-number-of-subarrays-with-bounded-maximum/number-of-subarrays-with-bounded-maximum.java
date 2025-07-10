class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int atMostlarge=atMost(nums,right);
        int atMostsmall=atMost(nums,left-1);
        int ans=atMostlarge-atMostsmall;
        return ans;
    }
    static int atMost(int []nums,int val)
    {
        int left=0,right=0,atMostCount=0;
        int n=nums.length;
        while(right<n)
        {
            if(nums[right]>val)
            {
                left=right+1;
            }
            
                if(nums[right]<=val)
                atMostCount+=right-left+1;

                right++;
        }
        return atMostCount;
    }
}