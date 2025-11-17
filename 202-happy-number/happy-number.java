class Solution {
    public boolean isHappy(int n) {
   if(n==1)
        {
            return true;
        }
        int slow=n;
        int fast=n;

        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
            if(slow==1||fast==1)
            {
                return true;
            }
        }while(slow!=fast);
        return false;
    }
    static int sumOfSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}