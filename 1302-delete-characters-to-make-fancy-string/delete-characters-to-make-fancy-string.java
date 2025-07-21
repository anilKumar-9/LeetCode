class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        if(n<=2)
        {
            return s;
        }
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length()-2;i++)
        {
            int ch=str.charAt(i);
            int next=str.charAt(i+1);
            int nextnext=str.charAt(i+2);
            while((i<str.length()-2)&&ch==next&&ch==nextnext)
            {
                str.deleteCharAt(i);
                ch=str.charAt(i);
                next=str.charAt(i+1);
                if(i<str.length()-2)
                nextnext=str.charAt(i+2);
                else 
                break;
            }
        }      
        return str.toString();
    }
}