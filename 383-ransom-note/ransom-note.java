class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] hashMagazine=new int[26];
        int n=magazine.length();
        int m=ransomNote.length();
        for(int i=0;i<n;i++)
        {
            hashMagazine[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<m;i++)
        {
            if(hashMagazine[ransomNote.charAt(i)-'a']==0)
            {
                return false;
            }
            else
            {
                hashMagazine[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }
}