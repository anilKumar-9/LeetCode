class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int write=0;
        int n=nums.length;
        for(int scout=0;scout<n;scout++)
        {
            if((nums[scout]&1)==0)
            {
                int temp=nums[write];
                nums[write]=nums[scout];
                nums[scout]=temp;
                write++;
            }
        }
        return nums;
    }
}