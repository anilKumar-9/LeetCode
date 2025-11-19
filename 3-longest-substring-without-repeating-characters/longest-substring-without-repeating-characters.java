class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0,right=0;
        int n=s.length(),max=0;
        while(right<n)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                max=Math.max(right-left+1,max);
                right++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}