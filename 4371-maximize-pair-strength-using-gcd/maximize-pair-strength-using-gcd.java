class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long maxStrength = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long gcdOfPair = gcd(nums[i], nums[j]);
                long numarator = (long)((long)nums[i]*(long)nums[j]);
                long denominator = (long)(gcdOfPair) * (gcdOfPair);
                maxStrength = Math.max(maxStrength, numarator/denominator);
            }
        }

        return maxStrength;
    }

    static long gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }

        return gcd(b,a%b);
    }
}