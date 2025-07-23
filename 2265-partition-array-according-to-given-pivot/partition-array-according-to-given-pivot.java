class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> pivott=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
            {
                left.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                right.add(nums[i]);
            }
            else
            {
                pivott.add(nums[i]);
            }
        }
        int i=n-1;
        while(right.size()>0)
        {
            nums[i--]=right.remove(right.size()-1);
        }
       
        while(pivott.size()>0)
        {
            nums[i--]=pivott.remove(pivott.size()-1);
        }
         while(left.size()>0)
        {
            nums[i--]=left.remove(left.size()-1);
        }
        
        return nums;
    }
}