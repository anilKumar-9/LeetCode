class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        {return 0;}
        int n=nums.length,count=0;
        long product=1;
        int left=0,right=0;
        while(right<n)
        {
            product*=nums[right];
            while(product>=k)
            {
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count<0?0:count;
    }
}