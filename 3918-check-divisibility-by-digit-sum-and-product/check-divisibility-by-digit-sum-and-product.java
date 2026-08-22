class Solution {
    public boolean checkDivisibility(int n) {
        
        long sum = 0;
        long product = 1;

        int tempN = n;

        while(tempN>0)
        {
            int digit = tempN %10;
            sum = sum+ digit;
            product = product * digit;
            tempN = tempN/10;
        }

        return n%(product+sum) == 0;
    }
}