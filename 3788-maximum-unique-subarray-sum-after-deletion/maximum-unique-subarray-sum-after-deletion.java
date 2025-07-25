class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length,sum=0;
       
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                if(!set.contains(nums[i]))
                {
                set.add(nums[i]);
                sum+=nums[i];
                }
            }
        }
        sum=sum==0?Integer.MIN_VALUE:sum;
        if(sum==Integer.MIN_VALUE)
        {
            for(int i=0;i<n;i++)
            {
                sum=Math.max(sum,nums[i]);
            }
        }
        
        return sum;
    }
}