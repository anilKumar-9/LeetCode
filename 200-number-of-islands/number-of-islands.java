class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void bfs(char [][] grid,int i1,int j1)
    {
        Queue<int []> q=new LinkedList<>();
        int [][]distance={{1,0},{0,1},{0,-1},{-1,0}};
        grid[i1][j1]='2';
        q.offer(new int[]{i1,j1});
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int [] val=q.poll();
                int row=val[0];
                int col=val[1];
                for(int []dist:distance)
                {
                    int nr=row+dist[0];
                    int nc=col+dist[1];
                    if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]=='1')
                    {
                        grid[nr][nc]='2';
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
    }
}