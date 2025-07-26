class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,low=0,high=0;
        Set<List<Integer>> set=new HashSet<>();
        
        for(int i=0;i<n;i++)
        {
            low=i+1;
            high=n-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                   int x=nums[low];
                   set.add(new ArrayList<>(Arrays.asList(nums[i],nums[low],nums[high])));
                 
                   while(low<high&&x==nums[low])
                   {
                    low++;
                   }
                   
                }
                else if(sum>0)
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>(set);
        return res;
    }
}