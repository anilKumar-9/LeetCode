class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int [][]dp=new int[n][m];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return uniquePathsWithObstaclesHelper(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,dp);
    }
    static int uniquePathsWithObstaclesHelper(int i,int j, int[][] arr,int [][]dp)
    {
        if(i<0||j<0||arr[i][j]==1)
        {
            return 0;
        }
        if(i==0&&j==0)
        {
            return dp[i][j]=1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        int up=uniquePathsWithObstaclesHelper(i-1,j,arr,dp);

        int left=uniquePathsWithObstaclesHelper(i,j-1,arr,dp);

        return dp[i][j]=up+left;
    }
}