class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())
        {
            return new ArrayList<>();
        }
        int k=p.length();
        List<Integer> res=new ArrayList<>();
        if(checkAnagram(p,s.substring(0,k)))
        {
            res.add(0);
        }
        int p1=0;

        for(int p2=k;p2<s.length();p2++)
        {
            p1++;
            if(checkAnagram(s.substring(p1,p2+1),p))
            {
                res.add(p1);
            }
        }
        return res;
    }

    static boolean checkAnagram(String a,String b)
    {
        int [] hash=new int[26];

        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            hash[b.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}