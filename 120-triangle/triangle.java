class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();

        int [][]dp=new int[n][n];

        for(int i=n-1;i>=0;i--)
        {
            dp[n-1][i]=triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int down=triangle.get(i).get(j)+dp[i+1][j];
                int dig=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(dig,down);
            }
        }
        return dp[0][0];
    }
}