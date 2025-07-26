class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i=0,j=nums.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<=j)
        {
            if(i==j &&nums[i]==key)
            {
                list.add(i);
                i++;
                break;
            }
            if(nums[i]==key)
            {
                list.add(i);
            }
             if(nums[j]==key)
            {
                list.add(j);
            }
            i++;
            j--;
        }
        Set<Integer> set=new HashSet<>();
        for( i=0;i<list.size();i++)
        {
            for( j=0;j<nums.length;j++)
            {
                if(Math.abs(j-list.get(i))<=k)
                {
                    set.add(j);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}