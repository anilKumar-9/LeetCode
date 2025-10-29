class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        System.out.println("n:"+n);

        int [][]dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            dp[n-1][i]=matrix[n-1][i];
            System.out.print(dp[n-1][i]+" ");
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {

                int downRight=Integer.MAX_VALUE;
                int downLeft=Integer.MAX_VALUE;

                int down=dp[i+1][j];

                if(j-1>=0&&j-1<n)
                {
                    downLeft=dp[i+1][j-1];
                }

                if(j+1>=0&&j+1<n)
                {
                    downRight=dp[i+1][j+1];
                }
            
            dp[i][j]=Math.min(down,Math.min(downLeft,downRight))+matrix[i][j];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}