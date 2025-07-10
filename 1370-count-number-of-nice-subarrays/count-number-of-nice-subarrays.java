class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    static int atMost(int []nums,int k)
    {
        int n=nums.length;
        int left=0;
        int right=0;
        int oddsum=0;
        int atMostCount=0;
        while(right<n)
        {
            oddsum+=(nums[right]%2);
                while(oddsum>k)
                {
                    oddsum-=(nums[left]%2);
                    left++;
                }

            if(oddsum<=k)
            {
                atMostCount+=right-left+1;
            }
            right++;
        }
        return atMostCount;
    }
}