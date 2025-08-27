class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0)
        {
            return -1;
        }
      int n=grid.length;
      int [][] dis=new int[n][n];

      for(int i=0;i<n;i++) 
      {
            Arrays.fill(dis[i],Integer.MAX_VALUE);
      } 

      dis[0][0]=1;

      Queue<int []> q=new LinkedList<>();

      q.offer(new int[]{0,0});

      while(!q.isEmpty())
      {
        int []values=q.poll();
        int row=values[0];
        int col=values[1];

        for(int i=-1;i<=1;i++)
        {
            for(int j=-1;j<=1;j++)
            {
                if(i==0&&j==0)
                {
                    continue;
                }
                    int newRow=row+i;
                    int newCol=col+j;
                    if(newRow>=0&&newCol>=0&&newRow<n&&newCol<n&&dis[row][col]+1<dis[newRow][newCol]&&grid[newRow][newCol]==0)
                    {
                        dis[newRow][newCol]=dis[row][col]+1;
                        q.offer(new int[]{newRow,newCol});
                    }
                
            }
        }

      }
    return dis[n-1][n-1]==Integer.MAX_VALUE?-1:dis[n-1][n-1];
    }
}