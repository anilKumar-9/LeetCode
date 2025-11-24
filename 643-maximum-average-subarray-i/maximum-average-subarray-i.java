class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k;i<n;i++)
        {
            
            sum=sum-nums[i-k];
            sum=sum+nums[i];
         
            if(sum>max)
            {
                max=sum;
            }
        }
        return max/k;
    }
}