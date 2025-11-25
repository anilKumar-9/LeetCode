class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0;
        int n=nums.length;
        while(right<n)
        {
            if(map.containsKey(nums[right])&&
                Math.abs(right-map.get(nums[right]))<=k)
            {
                return true;
            }
            else
            map.put(nums[right],right);
            
            right++;
        }
        return false;
    }
}