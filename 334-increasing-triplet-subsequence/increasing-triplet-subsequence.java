class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3)
        {
            return false;
        }
        int small=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(nums[i]<small)
            {
                small=nums[i];
            }
            else if(nums[i]<secondSmall&&nums[i]>small)
            {
                secondSmall=nums[i];
            }
            else if(nums[i]>small&&nums[i]>secondSmall)
            {
                return true;
            }

        }
        return false;
    }
}