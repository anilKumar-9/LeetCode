class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        int zerocount=0;
        int max=0;
        int count1=0;
        while(j<n)
        {
           if(nums[j]==0)
           {
            zerocount++;
           }

           while(zerocount>1)
           {
            if(nums[i]==0)
            {
                zerocount--;
            }
            i++;
           }

            max=Math.max(max,(j-(i)));
           j++;
        }
       
        return max;
    }
}