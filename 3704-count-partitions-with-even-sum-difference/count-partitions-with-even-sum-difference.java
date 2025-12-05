class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int []prefix=new int[n-1];
        int []suffix=new int[n-1];
        prefix[0]=nums[0];
        suffix[n-2]=nums[n-1];
        int count=0;

        for(int i=1;i<n-1;i++){
            prefix[i]=prefix[i-1]+nums[i];
            suffix[n-2-i]=suffix[n-1-i]+nums[n-i-1];
        }

        for(int i=0;i<prefix.length;i++)
        {
            System.out.println(prefix[i]+" "+suffix[i]);
            if(Math.abs(prefix[i]-suffix[i])%2==0)
            {
                count++;
            }
        }
        return count;
    }
}