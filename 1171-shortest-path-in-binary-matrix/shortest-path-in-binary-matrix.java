class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;

        if(n==1&&grid[0][0]==0)
        {
            return 1;
        }
        if(grid[0][0]==1||grid[n-1][n-1]==1)
        {
            return -1;
        }
        Queue<int []> queue=new LinkedList<>();
        queue.offer(new int[] {0,0});
        int level=1;
        

        int [][] directions={{1,0},{0,1},{-1,0},{0,-1},{-1,-1},{-1,1},{1,1},{1,-1}};

        while(!queue.isEmpty())
        {
            level++;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                
                int []values=queue.poll();
                for(int [] direction:directions)
                {
                    int nr=direction[0]+values[0];
                    int nc=direction[1]+values[1];

                    if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0)
                    {
                        grid[nr][nc]=level;
                        queue.offer(new int[]{nr,nc});
                    }
                }
            }
            
        }

        return grid[n-1][n-1]==0?-1:grid[n-1][n-1];
    }
}