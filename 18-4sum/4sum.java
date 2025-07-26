class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
      int n=nums.length,low=0,high=0;
      List<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        if(i>0&&nums[i]==nums[i-1])
            continue;

        for(int j=i+1;j<n;j++)
        {
            if(j>i+1&&nums[j]==nums[j-1])
            continue;
            low=j+1;
            high=n-1;

            while(low<high)
            {
               long  sum=(long)nums[i]+nums[j];
               sum+=nums[low];
               sum+=nums[high];
               if(sum==target)
               {
                    list.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                        while(low<high&&nums[low]==nums[low-1])
                        {
                            low++;
                        }
                        while(low<high&&nums[high]==nums[high+1])
                        {
                            high--;
                        }
               }
               else if(sum>target)
               {
                        high--;
               }
               else
               {
                        low++;
               }
            }
        }
      }  
      return list;
    }
}