class Solution {
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int up=0;
        int ans=0;

        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                up++;
            }
            ans+=up;
        }
        return ans;
    }
}
