class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,max=Integer.MIN_VALUE;
        
        while(j<n)
        {
            if(map.containsKey(nums[j]))
            {
                sum-=nums[i];
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0)
                {
                    map.remove(nums[i]);
                }
                i++;  
            }
            else
            {
            sum+=nums[j];
            max=Math.max(sum,max);
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            j++;
            }
        }
        return max;
    }
}