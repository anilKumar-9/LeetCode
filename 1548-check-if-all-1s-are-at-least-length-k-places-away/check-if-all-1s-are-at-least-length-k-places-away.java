class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int firstOne=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                firstOne=i;
                break;
            }
        }
        if(firstOne==-1)
        {
            return true;
        }
        int otherOnes=firstOne;
        for(int i=firstOne+1;i<n;i++)
        {
            if(nums[i]==1)
            {
                if((i-otherOnes)-1>=k)
                {
                    otherOnes=i;
                    
                }
                else
                {
                    return false;
                }
                
            }
        }
        return true;
    }
}