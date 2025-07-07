class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            min=Math.min(min,nums[start]);
            max=Math.max(max,nums[start]);
            min=Math.min(min,nums[end]);
            max=Math.max(max,nums[end]);
            start++;
            end--;
        } 
        while(min!=0&&max!=0)
        {
            if(min>=max)
            {
                min=min%max;
            }
            else
            {
                max=max%min;
            }
        }      
        return min!=0?min:max;
    }
}