class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i=0,j=0,n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n&&j<n)
        {
            if(nums[j]!=key)
            {
                j++;
            }
            else if(i<j-k)
            {
                i++;
            }
            else if(i<=j+k)
            {
                list.add(i);
                i++;
            }
            else
            {
                j++;
            }
        }
        return list;
    }
}