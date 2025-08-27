class Solution {
    public int minimumEffortPath(int[][] heights) {
                int n=heights.length;
        int m=heights[0].length;
        if(n==1&&m==1)
        {
            return 0;
        }


        int [][]dis=new int [n][m];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }

        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        dis[0][0]=heights[0][0];

        pq.offer(new int[]{0,0,0});
        int [][] distances={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty())
        {
            int []values=pq.poll();
            int effort=values[0];
            int row=values[1];
            int col=values[2];
            for(int [] distance: distances)
            {
                int nr=row+distance[0];
                int nc=col+distance[1];
                if(nr>=0&&nr<n&&nc>=0&&nc<m)
                {
                    int neweffort=Math.max(effort,Math.abs(heights[row][col]-heights[nr][nc]));

                    if(neweffort<dis[nr][nc])
                    {
                        dis[nr][nc]=neweffort;
                        pq.offer(new int[]{neweffort,nr,nc});
                    }
                }
            }
        }
        return dis[n-1][m-1];
    }
}