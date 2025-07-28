class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] str=s.split(" ");
        String ans="";
        for(int i=0;i<str.length-1;i++)
        {
            ans+=reverse(str[i])+" ";
        }
        ans+=reverse(str[str.length-1]);
        return ans;
    
    }
    static String reverse(String str)
    {
        StringBuilder s=new StringBuilder(str);
        int start=0,end=s.length()-1;
        while(start<end)
        {
            char ch=s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,ch);
            start++;
            end--;
        }
        return s.toString();
    }
}