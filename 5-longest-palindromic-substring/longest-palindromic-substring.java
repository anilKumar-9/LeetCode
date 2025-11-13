class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1)
        {
            return "";
        }
        int n=s.length();
        int max=0;
        int start=0,end=0;
        for(int i=0;i<n;i++)
        {
            int len1=isPalindrome(i,i,s);
            int len2=isPalindrome(i,i+1,s);
            int res=Math.max(len1,len2);
            if(res>max)
            {
                start=i-(res-1)/2;
                end=i+res/2;
                max=res;
            }

        }
        return s.substring(start,end+1);

    }
    static int isPalindrome(int i,int j,String s)
    {
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
        {
           i--;
           j++;
        }
        return j-i-1;
    }
}