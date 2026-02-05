class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1=str1.length(),len2=str2.length();
        for(int i=Math.min(len1,len2);i>=1;i--)
        {
            if(isValidDivisor(str1,str2,i))
            {
                return str1.substring(0,i);
            }
        }
        return "";
    }

    static boolean isValidDivisor(String str1, String str2, int i)
    {
       int len1=str1.length(),len2=str2.length();
        if(len1%i!=0&&len2%i!=0)
        {
            return false;
        }
        String base=str1.substring(0,i);

        return str1.replaceAll(base,"").isEmpty()&&
                str2.replaceAll(base,"").isEmpty();
    }
}