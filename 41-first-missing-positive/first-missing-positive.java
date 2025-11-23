class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int curr=nums[i]-1;
            if(nums[i]>0&&nums[i]<n&&nums[i]!=nums[curr])
            {
                int temp=nums[i];
                nums[i]=nums[curr];
                nums[curr]=temp;
            }
            else
            {
                i++;
            }
        }
        

        for(i=0;i<n;i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
            }
        }
        return i+1;
    }
}