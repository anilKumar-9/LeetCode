class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,res=0,count=0;

        for(int num:nums)
        {
            if(num>max)
            {
                max=num;
                res=0;
                count=0;
            }

            if(num==max)
            {
               count++;
            }
            else
            {
                count=0;
            }
        res=Math.max(res,count);
        }
        return res;
    }
}