class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==1)
            {
                q.offer(new int[]{i,0});
                grid[i][0]=0;
            }
            if(grid[i][m-1]==1)
            {
                q.offer(new int[]{i,m-1});
                grid[i][m-1]=0;
            }
        }

        for(int i=1;i<m;i++)
        {
            if(grid[0][i]==1)
            {
                q.offer(new int[]{0,i});
                grid[0][i]=0;
            }
            if(grid[n-1][i]==1)
            {
                q.offer(new int[]{n-1,i});
                grid[n-1][i]=0;
            }
        }
        int [][] distance={{1,0},{0,1},{-1,0},{0,-1}};

        while(!q.isEmpty())
        {
            int [] val=q.poll();
            int row=val[0];
            int col=val[1];
            for(int []dist:distance)
            {
                int nr=row+dist[0];
                int nc=col+dist[1];
                if(nr>=0&&nc>=0&&nr<n&&nc<m&&grid[nr][nc]==1)
                {
                    grid[nr][nc]=0;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}