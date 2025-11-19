class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int max=0;
        for(int num:set)
        {
            int count=1;
            int x=num;
            if(!set.contains(x-1))
            {
                while(set.contains(x+1))
                {
                    count++;
                    x++;
                }   
            }
            max=Math.max(count,max);
        }
        return max;
    }
}