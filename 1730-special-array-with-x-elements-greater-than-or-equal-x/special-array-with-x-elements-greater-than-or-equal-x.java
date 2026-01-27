class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
     

        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=n-1;j>=0;j--)
            {
                if(nums[j]>=i)
                {
                    count++;
                }
            }
            if(count==i)
            {
                return i;
            }

        }
        return -1;
    }
}