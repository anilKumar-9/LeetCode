class Solution {
    public int trailingZeroes(int n) {
        int divisor=5;
        int res=0;

        while(divisor<=n)
        {
            res+=n/divisor;
            divisor*=5;
        }
        return res;
    }
}