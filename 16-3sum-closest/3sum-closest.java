class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int l=i+1,r=n-1;
            while(l<r)
            {
                
                int val=nums[i]+nums[l]+nums[r];
                int diff=Math.abs(val-target);
                if(diff<minDiff)
                {
                    minDiff=diff;
                    res=val;
                }
                else if(diff==minDiff)
                {
                    res=Math.max(res,val);
                }
                if(val>target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
            
        }
        return res;
    }
}