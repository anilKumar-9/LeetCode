class Solution {
    public int  uniquePaths(int m, int n) {
        // Code Here
        int [][]dp=new int[m][n];
        for(int []row: dp)
        {
            Arrays.fill(row,-1);
        }
        return numOfPaths(m-1,n-1,dp);
    }
    static int numOfPaths(int i,int j,int [][]dp)
    {
        if(i==0&&j==0)
        {
            return dp[i][j]=1;
        }
        if(i<0||j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        int up=numOfPaths(i-1,j,dp);
        int down=numOfPaths(i,j-1,dp);
        
        return dp[i][j]=up+down;
    }
}