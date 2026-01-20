class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int []max=new int[n];
        int maxDigit=0;
        for(int i=0;i<n;i++)
        {
            int digit=largestDigit(nums[i]);
            max[i]=digit;
            
        }

        int maxSum=-1;
        for(int i=0;i<n;i++)
        {
           
                for(int j=i+1;j<n;j++)
                {
                    if(max[i]==max[j])
                    {
                        maxSum=Math.max(maxSum,nums[i]+nums[j]);
                    }
                }
           
        }
        return maxSum;
    }

    static int largestDigit(int num)
    {
        int max=0;
        while(num>0)
        {
            max=Math.max(num%10,max);
            num/=10;
        }
        return max;
    }
}