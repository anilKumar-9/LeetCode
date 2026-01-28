class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int first=binarySearch(nums,target,true);
        int last=binarySearch(nums,target,false);
        System.out.println(first+" "+last);
        List<Integer> list=new ArrayList<>();
        if(first!=-1)
        {
            for(int i=first;i<=last;i++)
                 {
                    list.add(i);
                }
        }
        return list;
    }

    static int binarySearch(int[] nums, int target, boolean isTrue)
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                
                if(isTrue)
                {
                    index=mid;
                    high=mid-1;
                }
                else
                {
                    index=mid;
                    low=mid+1;
                }
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return index;
    }
}