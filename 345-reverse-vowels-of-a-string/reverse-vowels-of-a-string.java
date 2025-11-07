class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        int start=0,end=s.length()-1;
        while(start<end)
        {
            while(start<end&&!isVowel(sb.charAt(start)))
            {
                start++;
            }
            while(start<end&&!isVowel(sb.charAt(end)))
            {
                end--;
            }
            char ele=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,ele);
            start++;
            end--;
        }
        return sb.toString();
    }
    static Boolean isVowel(char ele)
    {
        if(ele=='a'||ele=='e'||ele=='i'||ele=='o'||ele=='u')
        {
            return true;
        }
        if(ele=='A'||ele=='E'||ele=='I'||ele=='O'||ele=='U')
        {
            return true;
        }
        return false;
    }
}