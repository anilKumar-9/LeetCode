class Solution {
    public String mergeAlternately(String word1, String word2) {
        String  merge="";
        int n=word1.length(),m=word2.length();
        int i=0,j=0;
        while(i<n&&j<m)
        {
            merge+=word1.charAt(i);
            merge+=word2.charAt(j);
            i++;
            j++;
        }

        while(i<n)
        {
            merge+=word1.charAt(i);
            i++;
        }
         while(j<m)
        {
            merge+=word2.charAt(j);
            j++;
        }
        return merge;
    }
}