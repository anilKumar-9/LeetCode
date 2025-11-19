class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<n;i+=2*k)
        {
            int j=Math.min(i+k-1,n-1);
             reverse(i,j,sb);
        }
        return sb.toString();
    }
    static void reverse(int i,int j,StringBuilder s)
    {
        while(i<j)
        {
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}