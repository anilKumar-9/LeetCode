class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }


        int n=nums.length;
        int []considerFirst=Arrays.copyOfRange(nums,0,n-1);
        int []considerLast=Arrays.copyOfRange(nums,1,n);
        return Math.max(MaximumProfit(considerFirst),MaximumProfit(considerLast));
    }
    static int MaximumProfit(int []arr)
    {
        int n=arr.length;
        int prev=arr[0];
        int prev2=0,curr=0;

        for(int i=1;i<n;i++)
        {
            int take=arr[i];
            if(i>1)
            {
                take+=prev2;
            }
            int nottake=0+prev;
            curr=Math.max(take,nottake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}