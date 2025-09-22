class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []freq=new int[105];
        int n=nums.length;
        if(n==1)
        {
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
            if(freq[nums[i]]>=max)
            {
                max=freq[nums[i]];
            }
        }
        for(int i=0;i<105;i++)
        {
            if(freq[i]==max)
            {
                total+=max;
            }
        }
        return total;
    }
}