class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        int []maxDigits=new int[82];
        int result=-1;
        for(int element:nums)
        {
            int digit=0;
            for(int i=element;i>0;i=i/10)
            {
                digit+=i%10;
            }

            if(maxDigits[digit]>0)
            {
                result=Math.max(maxDigits[digit]+element,result);
            }

            maxDigits[digit]=Math.max(maxDigits[digit],element);
        }

        return result;
    }
}