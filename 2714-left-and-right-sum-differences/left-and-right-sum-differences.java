class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []prefix=new int[n];
        int []suffix=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        int []ans=new int[n];
        for(int i=1;i<n;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];
            suffix[n-i-1]=nums[n-i-1]+suffix[n-i];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=Math.abs(prefix[i]-suffix[i]);
        }
        return ans;
    }
}