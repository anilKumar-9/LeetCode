class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int count=1;
        while(true)
        {
            if(!set.contains(k*count))
            {
                return k*count;
            }
            count++;
        }
    }
}