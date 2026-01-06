class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length()-1;
        for(int i=n;i>=0;i--)
        {
            if((sb.charAt(i)-'0')%2!=0)
            {
                sb.deleteCharAt(i);
                continue;
            }
            else
            break;
        }
        return sb.toString();
    }
}