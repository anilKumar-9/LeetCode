class Solution {
    public int longestPalindrome(String[] words) {
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        boolean firstOdd=true;
        int count=0;

        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }


        for(String word:words)
        {
            String reverse=new StringBuilder(word).reverse().toString();
            
            if(map.containsKey(word)&&word.charAt(0)!=word.charAt(1))
            {
            if(map.containsKey(reverse))
            {
                int min=Math.min(map.get(word),map.get(reverse));
                count+=min*4;
                map.remove(reverse);
                map.remove(word);
            }
            }
            else if(map.containsKey(word)&&word.charAt(0)==word.charAt(1))
            {
                if(map.get(word)%2==0)
                {
                    count+=map.get(word)*2;
                    map.remove(word);
                }
                else if(firstOdd)
                {
                    count+=map.get(word)*2;
                    firstOdd=false;
                    map.remove(word);
                }
                else
                {
                    count+=(map.get(word)-1)*2;
                    map.remove(word);
                }
            }
        }    
        return count;
    }
}