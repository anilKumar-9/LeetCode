class Solution {
    public int minAddToMakeValid(String s) {
        int level=0;
        int n=s.length();
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                level++;
            }
            else
            {
                if(level>0)
                {
                    level--;

                }
                else
                {
                    min++;
                }
            }
        }
        return min+level;
    }
}