class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int n=nums1.length;
        int []nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=nums1[i]-nums2[i];
        }
        return mergeSort(0,n-1,nums,diff);
    }
    static long mergeSort(int low,int high,int []nums,int diff)
    {
        long count=0;
        if(low<high)
        {
            int mid=low+(high-low)/2;
            count+=mergeSort(low,mid,nums,diff);
            count+=mergeSort(mid+1,high,nums,diff);
            count+=countPairs(low,mid,high,nums,diff);
            merge(low,mid,high,nums);
        }

        return count;
    }
    static void merge(int low,int mid,int high,int []nums)
    {
        int i=low,j=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<=mid&&j<=high)
        {
            if(nums[i]<=nums[j])
            {
                temp.add(nums[i++]);
            }
            else
            {
                temp.add(nums[j++]);
            }
        }
        while(i<=mid)
        {
            temp.add(nums[i++]);
        }
        while(j<=high)
        {
            temp.add(nums[j++]);
        }
        for(i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }
    }
    static long countPairs(int low, int mid, int high,int []nums, int diff)
    {
        long count=0;
        int j=mid+1;

        for(int i=low;i<=mid;i++)
        {
            while(j<=high&&(nums[i]>nums[j]+diff))
            {
                j++;
            }
            count+=high-j+1;
        }
        return count;
    }
}