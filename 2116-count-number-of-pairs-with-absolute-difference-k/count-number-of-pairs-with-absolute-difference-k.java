class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int absvalue=Math.abs(nums[i]-nums[j]);
                if(absvalue==k)
                {
                    count=count+1;
                }
            }
        }
        return count;
    }
}