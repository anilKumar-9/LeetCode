class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count+=countPalin(i,i,s);
            count+=countPalin(i,i+1,s);
        }
        return count;
    }

    static int countPalin(int i,int j,String s)
    {
        int count=0;
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
            count++;
            
         }
        return count;
    }
}