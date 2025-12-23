class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }

        return max;
    }

    static int dfs(int [][]grid,int row,int col)
    {
        int n=grid.length;
        int m=grid[0].length;
        if(row<0||row>=n||col<0||col>=m||grid[row][col]==0)
        {
            return 0;
        }

        grid[row][col]=0;

        int area=1;

        area+=dfs(grid,row,col-1);
        area+=dfs(grid,row,col+1);
        area+=dfs(grid,row+1,col);
        area+=dfs(grid,row-1,col);

        return area;
    }

    
}