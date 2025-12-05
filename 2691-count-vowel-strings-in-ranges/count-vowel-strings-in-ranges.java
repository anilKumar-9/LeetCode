class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int []prefix=new int[n+1];
        int queryLength=queries.length;
        int [] res=new int[queryLength];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+checkVowel(words[i]);
        }
        int index=0;
        for(int []query:queries)
        {
            if(query[0]==0)
            {
                res[index++]=prefix[query[1]+1];
            }
            else
            {
                res[index++]=prefix[query[1]+1]-prefix[query[0]];
            }
        }

        return res;
    }

    static int  checkVowel(String word)
    {
        if(isVowel(word.charAt(0))&&
        isVowel(word.charAt(word.length()-1)))
        {
            return 1;
        }
        return 0;
    }

    static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
}