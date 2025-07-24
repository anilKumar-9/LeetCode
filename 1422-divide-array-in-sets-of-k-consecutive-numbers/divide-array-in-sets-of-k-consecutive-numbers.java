class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])!=0)
            {
                for(int j=nums[i];j<nums[i]+k;j++)
                {
                    if(map.get(j)!=null&&map.get(j)!=0)
                    {
                        map.put(j,map.get(j)-1);
                    }   
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}