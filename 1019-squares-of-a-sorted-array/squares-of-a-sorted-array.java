class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        int low=0,high=n-1;
        int index=n-1;
        while(index>=0)
        {
            int leftSquare=nums[low]*nums[low];
            int rightSquare=nums[high]*nums[high];

            if(leftSquare<rightSquare)
            {
                res[index--]=rightSquare;
                high--;
            }
            else
            {
                res[index--]=leftSquare;
                low++;
            }
        }
        return res;
    }
}