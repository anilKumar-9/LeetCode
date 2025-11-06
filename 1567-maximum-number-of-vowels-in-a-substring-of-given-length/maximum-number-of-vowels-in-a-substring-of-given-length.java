class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int i=0,j=0;
        int max=0;
        int n=s.length();
        for(j=0;j<k;j++)
        {
            if(isVowel(s.charAt(j)))
            {
                count++;
                max=Math.max(count,max);
            }
        }

        while(j<n)
        {
            if(isVowel(s.charAt(i)))
            {
                count--;
               
            }
            i++;
            if(isVowel(s.charAt(j)))
            {
                count++;
                max=Math.max(max,count);
            }
            j++;
        }
        return max;
    }

    static boolean isVowel(char ele)
    {
        if(ele=='a'||ele=='e'||ele=='i'||ele=='o'||ele=='u')
        {
            return true;
        }
        return false;
    }
}