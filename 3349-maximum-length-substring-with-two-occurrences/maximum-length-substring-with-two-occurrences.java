class Solution {
    public int maximumLengthSubstring(String s) {
        
        int n = s.length();
        int i=0;
        int [] hash = new int [26];
        int maxLength =0;

        for(int j=0;j<n;j++)
        {
            int hashValue = s.charAt(j)-'a';
            hash[hashValue]++;

            while(hash[hashValue]>2 && i<=j)
            {
                hash[s.charAt(i)-'a']--;
                i++;
            }

            maxLength = Math.max(maxLength , j-i+1);
        }

        return maxLength ;
    }
}