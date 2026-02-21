class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countPrime=0;
        for(int i=left;i<=right;i++)
        {
            int setBitCount=0;
            int n=i;

            while(n>0)
            {
                if((n&1)!=0)
                {
                    setBitCount++;
                }
                n>>=1;
            }

            if(isPrime(setBitCount))
            {
                countPrime++;
            }
        }

        return countPrime;
    }

    static boolean isPrime(int ele)
    {
        if(ele<=1)
        {
            return false;
        }

        for(int i=2;i*i<=ele;i++)
        {
            if(ele%i==0)
            {
                return false;
            }
        }

        return true;
    }
}