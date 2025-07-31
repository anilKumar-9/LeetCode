class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int fresh=0;
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        if(fresh==0)
        {
            return 0;
        }
        int min=0;
        int [][]distance={{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty())
        {
            int size=q.size();
            boolean adjRotten=false;
            for(int i=0;i<size;i++)
            {
                int []values=q.poll();
                int row=values[0];
                int col=values[1];
                for(int []dist:distance)
                {
                   int nr= row+dist[0];
                   int nc= col+dist[1];
                    if(nr>=0&&nc>=0&&nr<n&&nc<m&&grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                        adjRotten=true;
                    }
                    
                }
                
            }
            if(adjRotten)
             min++;
        }
        return fresh==0?min:-1;
    }
}