class Solution {
    public List<String> commonChars(String[] words) {
         
        int n=words.length;
        int [] currentCount=new int[26];
        int [] commenCount=new int[26];
        List<String> res=new ArrayList<>();

        for(char ch : words[0].toCharArray())
        {
            commenCount[(int)(ch-'a')]++;
        }

        for(int i=1;i<n;i++)
        {
            Arrays.fill(currentCount,0);
            for(char ch : words[i].toCharArray())
            {
                currentCount[(int)(ch-'a')]++;
            }

            for(int j=0;j<26;j++)
            {
                commenCount[j]=Math.min(commenCount[j],currentCount[j]);
            }
        }

        for(int i=0;i<26;i++)
        {
            while(commenCount[i]-->0)
            {
                res.add(""+(char)(i+'a'));
            }
        }

        return res;
    }
}