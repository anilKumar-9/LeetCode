class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<n)
        {
            while(j<n&&nums[j]!=0)
            {
                j++;
            }
            i=j;
            while(j<n&&nums[j]==0)
            {
                count+=(j-i+1);
                j++;
            }
        }
        return count;
    }
}