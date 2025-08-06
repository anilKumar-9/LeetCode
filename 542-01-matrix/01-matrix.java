class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    mat[i][j]=Integer.MAX_VALUE;
                }
                else
                {
                    q.offer(new int[]{i,j});
                }
            }
        }

        int [][] dist={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int [] idx=q.poll();
            int row=idx[0];
            int col=idx[1];
            for(int [] dis:dist)
            {
                int nr=row+dis[0];
                int nc=col+dis[1];

                if(nr>=0&&nc>=0&&nr<n&&nc<m)
                {
                    if((mat[row][col]+1)<mat[nr][nc])
                    {
                        mat[nr][nc]=mat[row][col]+1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return mat;
    }
}