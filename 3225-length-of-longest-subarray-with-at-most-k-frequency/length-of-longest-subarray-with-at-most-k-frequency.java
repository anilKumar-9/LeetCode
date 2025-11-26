class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0;
        int count=0,n=nums.length;

        while(right<n)
        {
           map.put(nums[right],map.getOrDefault(nums[right],0)+1);
           while(!map.isEmpty()&&map.get(nums[right])>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            count=Math.max(count,right-left+1);
            right++;
        }
        return count;
    }
}