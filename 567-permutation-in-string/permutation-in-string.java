class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int []forS1=new int[26];
        int []forS2=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            forS1[s1.charAt(i)-'a']++;
            forS2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(forS1,forS2))
        {
            return true;
        }
        int p1=0;
        for(int p2=s1.length();p2<s2.length();p2++)
        {
            forS2[s2.charAt(p1)-'a']--;
            p1++;
            forS2[s2.charAt(p2)-'a']++;
            if(Arrays.equals(forS1,forS2))
        {
            return true;
        }
        }
        return false;
    }
}