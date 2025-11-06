class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return 0;
        }
        int []left=new int[n];
        int []right=new int[n];
        left[0]=0;
        right[n-1]=0;

        for(int i=0;i<n-1;i++)
        {
            left[i+1]=left[i]+nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+nums[i+1];
        }
        int pivot=-1;
        for(int i=0;i<n;i++)
        {
                if(left[i]==right[i])
                {
                    pivot=i;
                    return pivot;
                }
        }
        return pivot;
    }
}