class Solution {
    public int minFlipsMonoIncr(String s) {
        int n=s.length();
        int min=n;
        int flips=0,ones=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ones++;
            }
            else
            {
                flips++;
            }
            flips=Math.min(ones,flips);
        }
        return flips;
    }
}