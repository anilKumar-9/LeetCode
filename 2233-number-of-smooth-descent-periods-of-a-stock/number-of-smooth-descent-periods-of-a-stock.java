class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        if(n==1)
        {
            return 1;
        }

        long count=1;
        int i=0,j=1;

        while(j<n)
        {
            if(prices[j-1]-prices[j]==1)
            {
                count+=j-i+1;
            }
            else
            {
                count++;
                i=j;
            }
            j++;
        }
        return count;
    }
}