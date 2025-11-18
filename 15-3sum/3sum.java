class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            int low=i+1;
            int high=n-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    set.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }
                else if(sum<0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        List<List<Integer>> outer=new ArrayList(set);
        return outer;
    }
}