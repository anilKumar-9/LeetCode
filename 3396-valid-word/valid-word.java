class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3)
        {
            return false;
        }
        int vol=0,con=0;
        boolean ans=true;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            String val="aeiouAEIOU";
            if(!Character.isLetterOrDigit(ch))
            {
                return false;
            }
            else if(val.indexOf(ch)!=-1)
            {
                vol++;
            }
            else if(val.indexOf(ch)==-1&&!Character.isDigit(ch))
            {
                con++;
            }
        }
        if(con<1||vol<1)
        return false;

        return true;
    }
}