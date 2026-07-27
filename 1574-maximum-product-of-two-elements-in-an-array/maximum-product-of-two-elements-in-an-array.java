class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int largestElement =-1;
        int secondLargestElement =-1;
        
        for(int i=0;i<n;i++)
        {
            if(largestElement<=nums[i])
            {
                secondLargestElement=largestElement;
                largestElement = nums[i];
            }
            if(secondLargestElement<nums[i] && nums[i]!=largestElement)
            {
                secondLargestElement=nums[i];
            }
        }

        return (largestElement-1)*(secondLargestElement-1);
    }
}