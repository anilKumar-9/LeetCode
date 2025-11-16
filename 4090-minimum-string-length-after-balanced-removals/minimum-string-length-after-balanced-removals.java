class Solution {
    public int minLengthAfterRemovals(String s) {
        int counta=0,countb=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            {
                counta++;
            }
            else
            {
                countb++;
            }
        }
        return Math.abs(counta-countb);
    }
}