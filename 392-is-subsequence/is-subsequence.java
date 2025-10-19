class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0)
        {
            return true;
        }
        int i=0;
        int j=0;
        int n=s.length();
        int m=t.length();
        int count=0;

        while(i<n&&j<m)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
                count++;
            }
            else 
            {
                j++;
            }
        }
        return count==n;
    }
}