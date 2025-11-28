class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int left=0,right=n-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==k)
            {
                left++;
                right--;
                count++;
            }
            else if(sum>k)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return count;
    }
}