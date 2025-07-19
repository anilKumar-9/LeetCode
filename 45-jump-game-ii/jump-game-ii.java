class Solution {
    public int jump(int[] nums) {
       int l=0,r=0,jump=0,n=nums.length;
       while(r<n-1)
       {
        int far=0;
        for(int ind=0;ind<=r;ind++)
        {
            far=Math.max(ind+nums[ind],far);
        }
        l=r+1;
        jump++;
        r=far;
       } 
       return jump;
    }
}