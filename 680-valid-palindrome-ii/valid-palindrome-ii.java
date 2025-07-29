class Solution {
    public boolean validPalindrome(String s) {
       
       int n=s.length(),i=0,j=s.length()-1;
       while(i<j)
       {
        if(s.charAt(i)!=s.charAt(j))
        {
            return palindrome(s,i+1,j)||palindrome(s,i,j-1);
        }
        i++;
        j--;
       }
       return true;
    }
    static boolean palindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}