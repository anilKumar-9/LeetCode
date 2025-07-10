class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        long sum=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        while(right<n)
        {
            sum+=nums[right];
            while(sum>target)
            {
                min=Math.min(right-left+1,min);
                sum-=nums[left++];
            }
            if(sum==target)
            {
                min=Math.min(right-left+1,min);
            }
            right++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}