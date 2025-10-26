class Solution {
    public long removeZeros(long n) {
        long notZero=1;
        long ans=0;
        while(n>0)
        {
            if(n%10!=0)
            {
                ans=n%10*notZero+ans;
                notZero*=10;
            }
            n/=10;
        }
        return ans;
        
    }
}