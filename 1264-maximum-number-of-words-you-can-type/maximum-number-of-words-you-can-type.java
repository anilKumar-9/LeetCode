class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        text=text.trim();
        String []words=text.split(" ");
        int n=words.length;
        int count=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<brokenLetters.length();j++)
            {
                if(words[i].indexOf(brokenLetters.charAt(j))!=-1)
                {
                    count--;
                    break;
                }
            }
 
        }
        return count;
    }
}