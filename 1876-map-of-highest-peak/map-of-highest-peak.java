class Solution {
    public int[][] highestPeak(int[][] isWater) {
       int n=isWater.length;
       int m=isWater[0].length;
       Queue<int []> q=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            if(isWater[i][j]==1)
            {
                isWater[i][j]=0;
                q.offer(new int[]{i,j});
            }
            else
            {
                isWater[i][j]=Integer.MAX_VALUE;
            }
          }
        } 
        BFS(q,isWater);
        return isWater;
    }
    static void BFS(Queue<int []> q,int [][] isWater)
    {
        int n=isWater.length;
        int m=isWater[0].length;
        int [][]distances={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int []val=q.poll();
            int row=val[0];
            int col=val[1];

            for(int []dist:distances)
            {
                int nr=row+dist[0];
                int nc=col+dist[1];

                if(nr>=0&&nc>=0&&nr<n&&nc<m)
                {
                    if(isWater[row][col]+1<isWater[nr][nc])
                    {
                        isWater[nr][nc]=isWater[row][col]+1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
    }
}