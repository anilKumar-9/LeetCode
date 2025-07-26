class Solution {
    public void sortColors(int[] nums) {
        int start=0,end=nums.length-1,mid=0;
        while(mid<=end)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,end);
                end--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,start,mid);
                mid++;
                start++;
            }
            else
            {
                mid++;
            }
        }
    }
    static void swap(int []arr,int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}