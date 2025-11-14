class Solution {
    public int minCut(String s) {
        int n=s.length();
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return minCuts(n,0,s,dp);
    }
    static boolean isPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static int minCuts(int n,int start,String s,int []dp)
    {
        if (start == n || isPalindrome(s, start, n - 1))
            return 0;
        if(dp[start]!=-1)
        {
            return dp[start];
        }
            int min=Integer.MAX_VALUE;
        for(int end=start;end<n;end++)
        {
            if(isPalindrome(s,start,end))
            {
                int cuts=1+minCuts(n,end+1,s,dp);
                min=Math.min(min,cuts);
            }
            
        }
        return dp[start]=min;
    }
}