class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count=0;

            }
            else
            {
                count++;
                max=Math.max(max,count);
            }
        }
        max=Math.max(max,count);
        return max;
    }
}