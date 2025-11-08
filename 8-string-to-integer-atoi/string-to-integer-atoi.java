class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int index=0,sign=1;
        long total=0;
        while(index<s.length()&&s.charAt(index)==' ')
        {
            index++;
        }
        if(index==s.length())
        {
            return 0;
        }
        if(s.charAt(index)=='+'||s.charAt(index)=='-')
        {
            sign=s.charAt(index)=='+'?1:-1;
            index++;
        }

        while(index<s.length())
        {
            int digit=s.charAt(index)-'0';
            if(digit<0||digit>9)
            {
                break;
            }
            total=total*10+digit;
            
            if(Integer.MAX_VALUE<total)
            {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            
            index++;
        }
        return (int)total*sign;
    }
}