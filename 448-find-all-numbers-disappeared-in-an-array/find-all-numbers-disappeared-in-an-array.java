class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int curr=nums[i]-1;
            if(nums[i]!=nums[curr])
            {
                int temp=nums[i];
                nums[i]=nums[curr];
                nums[curr]=temp;
            }
            else
            {
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();

        for(i=0;i<n;i++)
        {
            if(i+1!=nums[i])
            {
                list.add(i+1);
            }
        }
        return list;
    }
}