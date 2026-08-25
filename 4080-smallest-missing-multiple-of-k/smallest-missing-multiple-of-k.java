class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }

        for(int i=1;i<=n;i++)
        {
            int value = i*k;
            if(!set.contains(value))
            {
                return value;
            }
        }

        return (n+1)*k;

    }
}