class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        list.add(nums[0]);
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=list.get(list.size()-1))
            {
                list.add(nums[i]);
            }
        }
        int size=list.size();
        if(size<3)
        {
            return 0;
        }
        int count=0;
        int i=1,j=0,k=2;
        while(k<size)
        {
            if(list.get(i)<list.get(j)&&list.get(i)<list.get(k)||list.get(i)>list.get(j)&&list.get(i)>list.get(k))
            {
                count++;
            }
            i++;
            j++;
            k++;
        }
        return count;
    }
}