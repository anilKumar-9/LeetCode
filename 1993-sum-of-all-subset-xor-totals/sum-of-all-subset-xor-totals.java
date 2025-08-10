class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        xor(nums,0,0,res);
        int sum=0;
        for(int val:res)
        {
            sum+=val;
        }
        return sum;
    }
    static void xor(int []nums,int index,int xorSum,ArrayList<Integer> xorValues)
    {
        if(index==nums.length)
        {
            xorValues.add(xorSum);
            return ;
        }
        xorSum^=nums[index];
        xor(nums,index+1,xorSum,xorValues);
        xorSum^=nums[index];
        xor(nums,index+1,xorSum,xorValues);
    }
}