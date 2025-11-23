class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long val=0;
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem!=0)
            {
                sum+=rem;
                val+=(long)Math.pow(10,count)*rem;
                count++;
            }
            n/=10;
           
        }
         return val*sum;
    }
}